package Controler;

import VIew.CalculatorView;

public class CalculatorManagement implements ICommon{
    public static final double PI = 3.14;

    public void Calculator() {

    }

    void Calculator(String type) {
        CalculatorView calculatorView = new CalculatorView();
        if (type.equals("Square")) {
            calculatorView.showMes("--------------------------------------\n");
            double Edge = calculatorView.inputDouble("Enter Edge: ");
            calculatorView.showMes("Area " + type + " : " + (double) Math.round(Acreage(Edge, Edge, type) * 10) / 10 + "\n");
            calculatorView.showMes(type + " Perimeter: " + (double) Math.round(Perimeter(Edge, Edge, type) * 10) / 10 + "\n");
            calculatorView.showMes("--------------------------------------\n");
        } else if (type.equals("Rectangular")) {
            calculatorView.showMes("--------------------------------------\n");
            double Width = calculatorView.inputDouble("Enter Width: ");
            double High = calculatorView.inputDouble("Enter High: ");
            calculatorView.showMes("Area " + type + " : " + (double) Math.round(Acreage(Width, High, type) * 10) / 10 + "\n");
            calculatorView.showMes(type + " Perimeter: " + (double) Math.round(Perimeter(Width, High, type) * 10) / 10 + "\n");
            calculatorView.showMes("--------------------------------------\n");
        } else if (type.equals("Circle")) {
            calculatorView.showMes("--------------------------------------\n");
            double Radius = calculatorView.inputDouble("Enter Radius: ");
            calculatorView.showMes("Area " + type + " : " + (double) Math.round(Acreage(Radius, Radius, type) * 10) / 10 + "\n");
            calculatorView.showMes(type + " Perimeter: " + (double) Math.round(Perimeter(Radius, Radius, type) * 10) / 10 + "\n");
            calculatorView.showMes("--------------------------------------\n");
        } else {

        }
    }

    @Override
    public double Acreage(double width, double high, String type) {
        if (type.equals("Square")) {
            return width * width;
        } else if (type.equals("Rectangular")) {
            return width * high;
        } else {
            return width * width * PI;
        }
    }

    @Override
    public double Perimeter(double width, double high, String type) {
        if (type.equals("Square")) {
            return width * 4;
        } else if (type.equals("Rectangular")) {
            return (width + high) * 2;
        } else {
            return 2 * width * PI;
        }
    }

}
