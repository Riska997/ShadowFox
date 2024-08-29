/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consolecalculator;

import java.util.Scanner;

/**
 *
 * @author Riska
 */
public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            display();

            System.out.println("Select your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    ArithmeticCalculation("addition", input);
                    break;
                case 2:
                    ArithmeticCalculation("subtraction", input);
                    break;
                case 3:
                    ArithmeticCalculation("multiplication", input);
                    break;
                case 4:
                    ArithmeticCalculation("division", input);
                    break;
                case 5:
                    scientificCalculation("sqrt", input);
                    break;
                case 6:
                    scientificCalculation("exponentiation", input);
                    break;
                case 7:
                    scientificCalculation("sin", input);
                    break;
                case 8:
                    scientificCalculation("cos", input);
                    break;
                case 9:
                    scientificCalculation("tan", input);
                    break;
                case 10:
                    scientificCalculation("cbrt", input); // Corrected spelling
                    break;
                case 11:
                    scientificCalculation("square", input);
                    break;
                case 12:
                    scientificCalculation("cube", input);
                    break;
                case 13:
                    unitConversion("temperature", input);
                    break;
                case 14:
                    unitConversion("currency", input);
                    break;
                case 15:
                    unitConversion("time", input);
                    break;
                case 16:
                    unitConversion("length", input);
                    break;
                case 17:
                    unitConversion("mass and weight", input);
                    break;
                case 18:
                    unitConversion("area", input);
                    break;
                case 19:
                    unitConversion("cubic volume", input);
                    break;
                case 20:
                    System.out.println("Bye! See you next time.");
                    input.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }

    private static void display() {
        System.out.println("Enhanced Console-based Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Exponentiation");
        System.out.println("7. Sin");
        System.out.println("8. Cos");
        System.out.println("9. Tan");
        System.out.println("10. cbrt"); // Corrected spelling
        System.out.println("11. Square");
        System.out.println("12. Cube");
        System.out.println("13. Temperature Conversion");
        System.out.println("14. Currency Conversion");
        System.out.println("15. Time Conversion");
        System.out.println("16. Length Conversion");
        System.out.println("17. Mass and Weight Conversion");
        System.out.println("18. Area Conversion");
        System.out.println("19. Cubic Volume Conversion");
        System.out.println("20. Exit");
    }

    private static void ArithmeticCalculation(String operator, Scanner input) {
        try {
            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();

            switch (operator) {
                case "addition":
                    System.out.println("Result: " + (num1 + num2));
                    System.out.println("*************************************************************************");
                    break;
                case "subtraction":
                    System.out.println("Result: " + (num1 - num2));
                    System.out.println("*************************************************************************");
                    break;
                case "multiplication":
                    System.out.println("Result: " + (num1 * num2));
                    System.out.println("*************************************************************************");
                    break;
                case "division":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                        System.out.println("*************************************************************************");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    System.out.println("*************************************************************************");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
            input.next(); // Clear invalid input
        }
    }

    private static void scientificCalculation(String calculationType, Scanner input) {
        try {
            System.out.println("Enter a number: ");
            double num = input.nextDouble();

            switch (calculationType) {
                case "sqrt":
                    System.out.println("Result: " + Math.sqrt(num));
                    System.out.println("*************************************************************************");
                    break;
                case "exponentiation":
                    System.out.println("Result: " + Math.log(num));
                    System.out.println("*************************************************************************");
                    break;
                case "sin":
                    System.out.println("Result: " + Math.sin(Math.toRadians(num)));
                    System.out.println("*************************************************************************");
                    break;
                case "cos":
                    System.out.println("Result: " + Math.cos(Math.toRadians(num)));
                    System.out.println("*************************************************************************");
                    break;
                case "tan":
                    System.out.println("Result: " + Math.tan(Math.toRadians(num)));
                    System.out.println("*************************************************************************");
                    break;
                case "cbrt":
                    System.out.println("Result: " + Math.cbrt(num));
                    System.out.println("*************************************************************************");
                    break;
                case "square":
                    System.out.println("Result: " + Math.pow(num, 2));
                    System.out.println("*************************************************************************");
                    break;
                case "cube":
                    System.out.println("Result: " + Math.pow(num, 3));
                    System.out.println("*************************************************************************");
                    break;
                default:
                    System.out.println("Invalid Calculation Type!");
                    System.out.println("*************************************************************************");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
            input.next(); // Clear invalid input
        }
    }

    private static void unitConversion(String conversionType, Scanner input) {
        try {
            System.out.println("Enter a number: ");
            double num = input.nextDouble();

            switch (conversionType) {
                case "temperature":
                    System.out.println("Convert to (Celsius/Fahrenheit):");
                    String type = input.next().toLowerCase();

                    if (type.equals("celsius")) {
                        double celsius = (num - 32) * 5 / 9;
                        System.out.println("Converted Value: " + celsius + " °C");
                        System.out.println("*************************************************************************");
                    } else if (type.equals("fahrenheit")) {
                        double fahrenheit = (num * 9 / 5) + 32;
                        System.out.println("Converted Value: " + fahrenheit + " °F");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid temperature type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "currency":
                    System.out.println("Convert from (USD/EUR):");
                    String fromCurrency = input.next().toUpperCase();

                    System.out.println("Convert to (USD/EUR):");
                    String toCurrency = input.next().toUpperCase();

                    double convertedValue;

                    if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
                        convertedValue = num * 0.90;
                        System.out.println("Converted Value: " + convertedValue + " EUR");
                        System.out.println("*************************************************************************");
                    } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
                        convertedValue = num * 1.10;
                        System.out.println("Converted Value: " + convertedValue + " USD");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid currency type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "time":
                    System.out.println("Convert to (Minutes/Hours):");
                    String timeType = input.next().toLowerCase();

                    if (timeType.equals("minutes")) {
                        double minutes = num * 60;
                        System.out.println("Converted Value: " + minutes + " minutes");
                        System.out.println("*************************************************************************");
                    } else if (timeType.equals("hours")) {
                        double hours = num / 60;
                        System.out.println("Converted Value: " + hours + " hours");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid time type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "length":
                    System.out.println("Convert to (Meters/Kilometers):");
                    String lengthType = input.next().toLowerCase();

                    if (lengthType.equals("meters")) {
                        double meters = num * 1000;
                        System.out.println("Converted Value: " + meters + " meters");
                        System.out.println("*************************************************************************");
                    } else if (lengthType.equals("kilometers")) {
                        double kilometers = num / 1000;
                        System.out.println("Converted Value: " + kilometers + " kilometers");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid length type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "mass and weight":
                    System.out.println("Convert to (Grams/Kilograms):");
                    String massType = input.next().toLowerCase();

                    if (massType.equals("grams")) {
                        double grams = num * 1000;
                        System.out.println("Converted Value: " + grams + " grams");
                        System.out.println("*************************************************************************");
                    } else if (massType.equals("kilograms")) {
                        double kilograms = num / 1000;
                        System.out.println("Converted Value: " + kilograms + " kilograms");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid mass type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "area":
                    System.out.println("Convert to (Square Meters/Square Kilometers):");
                    String areaType = input.next().toLowerCase();

                    if (areaType.equals("square meters")) {
                        double squareMeters = num * 10000;
                        System.out.println("Converted Value: " + squareMeters + " square meters");
                        System.out.println("*************************************************************************");
                    } else if (areaType.equals("square kilometers")) {
                        double squareKilometers = num / 10000;
                        System.out.println("Converted Value: " + squareKilometers + " square kilometers");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid area type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                case "cubic volume":
                    System.out.println("Convert to (Cubic Meters/Cubic Kilometers):");
                    String volumeType = input.next().toLowerCase();

                    if (volumeType.equals("cubic meters")) {
                        double cubicMeters = num * 1000000;
                        System.out.println("Converted Value: " + cubicMeters + " cubic meters");
                        System.out.println("*************************************************************************");
                    } else if (volumeType.equals("cubic kilometers")) {
                        double cubicKilometers = num / 1000000;
                        System.out.println("Converted Value: " + cubicKilometers + " cubic kilometers");
                        System.out.println("*************************************************************************");
                    } else {
                        System.out.println("Error: Invalid volume type.");
                        System.out.println("*************************************************************************");
                    }
                    break;

                default:
                    System.out.println("Invalid Conversion Type!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numeric values.");
            input.next(); // Clear invalid input
        }
    }
}
