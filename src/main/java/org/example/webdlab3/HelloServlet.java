package org.example.webdlab3;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.webdlab3.logic.CalcFunction;
import org.example.webdlab3.model.Result;


@WebServlet(name = "calculate", value = "/calculate")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF-8");

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        Result result = getResult(start, end, step);

        request.setAttribute("result", result);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/tabulation.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Result getResult(double start, double end, double step) {
        CalcFunction calcFunction = new CalcFunction(start, end, step);

        int maxI = calcFunction.getMaxI();
        int minI = calcFunction.getMinI();
        double maxX = calcFunction.getX(maxI);
        double maxY = calcFunction.getY(maxI);
        double minX = calcFunction.getX(minI);
        double minY = calcFunction.getY(minI);
        double[] xArr = calcFunction.getXArr();
        double[] yArr = calcFunction.getYArr();
        double sum = calcFunction.getSum();
        double average = calcFunction.getAverage();

        return new Result(maxI, minI, maxX, maxY, minX, minY, sum, average, xArr, yArr);
    }

    private void GoBack(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
