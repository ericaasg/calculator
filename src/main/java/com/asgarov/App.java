package com.asgarov;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        printHeading("Welcome to Erica's super calculator");

        List<String> options = List.of("joke", "calculator", "quit");
        printOptions(options);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("you have selected '" + input + "'");

        if (input.equals("1")) {
            System.out.println("Erica doesn't like shopping");
        } else if (input.equals("3")) {
            System.exit(0);
        } else if (input.equals("2")) {
            int a = promptForNumber();
            int b = promptForNumber();
            String sign = promptForSign();
            if(sign.equals("+")){
                System.out.println("equals: " + (a + b));
            } else if( sign.equals("-")){
                System.out.println("equals: " + (a - b));
            } else if (sign.equals("*")){
                System.out.println("equals: " + a * b);
            } else if (sign.equals("/")){
                System.out.println("equals: " + a / b);
            }


        } else {
            System.out.println("unknown option");
        }
    }

    private static String promptForSign() {
        System.out.println("please enter a sign: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    private static int promptForNumber() {
        System.out.println("please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    private static void printOptions(List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println("press " + (i + 1) + " for " + options.get(i));
        }
    }

    private static void printHeading(String heading) {
        System.out.println("-".repeat(heading.length()));
        System.out.println(heading);
        System.out.println("-".repeat(heading.length()));
    }
}
