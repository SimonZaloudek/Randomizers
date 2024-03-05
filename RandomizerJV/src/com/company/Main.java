package com.company;

import java.util.Scanner;

public class Main {
    private final Generators generator;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Inic.
        this.generator = new Generators();
        //Login method
        new Login();
        //Body
        this.menu();
    }

    private void menu() {
        String input;
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            System.out.println("|String| randomizer, |Char| randomizer, |Int| randomizer, |Test| randomizer, |Bool| or |Date| randomizer? ..|end| to stop the program");
            input = scanner.nextLine();
            while (!input.equals("String") && !input.equals("string")
                   && !input.equals("Int") && !input.equals("int")
                   && !input.equals("Char") && !input.equals("char")
                   && !input.equals("test") && !input.equals("Test")
                   && !input.equals("bool") && !input.equals("Bool")
                   && !input.equals("date") && !input.equals("Date")
                   && !input.equals("end")) {
                System.out.println("Wrong input.. type |String|, |Int|, |Char|, |Date|, |Bool| or |Test| ..|end| to stop the program)");
                input = scanner.nextLine();
            }
            switch (input) {
                case "end":
                    break loop;
                case "Int":
                case "int":
                    this.generator.IntGenerator();
                    break;
                case "String":
                case "string":
                    this.generator.StringGenerator();
                    break;
                case "Char":
                case "char":
                    this.generator.CharGenerator();
                    break;
                case "Test":
                case "test":
                    this.generator.TestGenerator();
                    break;
                case "Bool":
                case "bool":
                    this.generator.BoolGenerator();
                    break;
                case "date":
                case "Date":
                    this.generator.DateGenerator();
                    break;
            }
        }
    }

}


