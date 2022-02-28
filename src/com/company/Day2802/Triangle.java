package com.company.Day2802;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(int sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("Invalid input");
            return;
        }
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("Invalid input");
            return;
        }
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("Invalid input");
            return;
        }
        this.sideC = sideC;
    }

    private boolean isTriangleValid() {
        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            return false;
        }
        return true;
    }

    public boolean check(Triangle triangle) {
        return triangle.isTriangleValid();
    }

    public boolean isRight(Triangle triangle) {
        if (triangle.sideC == Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2))) {
            return true;
        }
        if (triangle.sideB == Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideC, 2))) {
            return true;
        }
        if (triangle.sideA == Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideC, 2))) {
            return true;
        }
        return false;
    }

    public double perimeter(Triangle triangle) {
        if (isRight(triangle)) {

            if (sideA > sideB && sideA > sideC) {
                return perimeterOrArea(sideC, sideB);
            }
            if (sideC > sideB && sideC > sideA) {
                return perimeterOrArea(sideA, sideB);
            }
            if (sideB > sideA && sideB > sideC) {
                return perimeterOrArea(sideA, sideC);
            }

        }
        return perimeterOrArea(sideA, sideB, sideC);
    }

    private double perimeterOrArea(double side1, double side2) {
        return (side1 * side2) / 2;
    }

    private double perimeterOrArea(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

}
