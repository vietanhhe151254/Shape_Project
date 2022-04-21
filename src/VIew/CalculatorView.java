package VIew;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner sc = new Scanner(System.in);

    public int Menu() {
        showMes("=========Calculator========\n");
        showMes("1. Area Square\n"
                + "2. Rectangular Area\n"
                + "3. Circle Area\n"
                + "4. Exit");
        showMes("\nYour choose:");
        return validationChoice(4, 1);
    }

    public int validationChoice(int max, int min) {
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(sc.nextLine().trim());
                //Check out of range
                if (min > result || max < result) {
                    showWar("Input out of range! Please enter a value from " + min + " to " + max);
                    showMes("Enter again: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                showWar("Please enter an integer!");
                showMes("Enter again: ");
            }
        }
        return result;
    }

    public void showMes(String mes) {
        System.out.print(mes);
    }

    public void showWar(String war) {
        System.err.println(war);
    }

    public double inputDouble(String mes) {
        showMes(mes);
        double result = 0;
        while (true) {
            try {
                result = Double.parseDouble(sc.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                showWar("Please enter an double!");
                showMes("Enter again: ");
            }
        }
        return result;
    }

    public String inputText(String mes) {
        String s;
        showMes(mes);
        while (true) {
            s = sc.nextLine();
            //Check empty
            if (s.isEmpty()) {
                showWar("Please enter something!");
                showMes("Enter again: ");
                continue;
            }
            return s;
        }
    }

    public boolean checkYesNo(String mes) {
        String s = inputText(mes);
        while (true) {

            if (s.equalsIgnoreCase("N") || s.equalsIgnoreCase("NO")) {
                return false;
            }
            if (s.equalsIgnoreCase("Y") || s.equalsIgnoreCase("YES")) {
                return true;
            }
            s = inputText("Enter again: ");
        }
    }
}
