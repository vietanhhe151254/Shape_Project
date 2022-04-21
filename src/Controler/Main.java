package Controler;

import VIew.CalculatorView;

public class Main {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        CalculatorManagement calculatorManagement = new CalculatorManagement();
        int x;
        while (true) {
            x = calculatorView.Menu();
            switch (x) {
                case 1:
                    calculatorManagement.Calculator("Square");
                    break;
                case 2:
                    calculatorManagement.Calculator("Rectangular");
                    break;
                case 3:
                    calculatorManagement.Calculator("Circle");
                    break;
                case 4:
                    System.exit(0);
            }
            if (!calculatorView.checkYesNo("Do you have another calculator(Y/N)?")) {
                break;
            }
        }
    }
}
