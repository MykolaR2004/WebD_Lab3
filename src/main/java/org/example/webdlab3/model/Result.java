package org.example.webdlab3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Result {

    int maxI;
    int minI;
    double maxX;
    double maxY;
    double minX;
    double minY;
    double sum;
    double average;
    double[] xArr;
    double[] yArr;
}
