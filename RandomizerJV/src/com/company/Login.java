package com.company;
import java.util.Scanner;

public class Login {

    private final Scanner scanner;
    private String input;

    public Login() {
        scanner = new Scanner(System.in);
        this.input = "";
        this.login();
    }

    private void login() {
        int counter = 0;
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your password:");
        input = scanner.nextLine();

        while (!input.equals("haha")) {
            System.out.println("Wrong password!!");
            counter++;
            if (counter > 2) {
                System.out.println("Hint: Sound you make when you laugh..");
            }
            input = scanner.nextLine();
        }
        System.out.println("Welcome " + name +  "!!");
        System.out.println("_________________________________________");
    }
}
