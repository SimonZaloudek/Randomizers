package com.company;
import java.util.Scanner;

public class DateGeneration {

    private final Generators generator;
    private final Scanner scanner;
    private String input2;
    private int year;
    private String month;
    private int day;

    public DateGeneration() {
        this.generator = new Generators();
        this.scanner = new Scanner(System.in);
        this.core();
    }

    public void core() {
        System.out.println("What do you want to randomize?: |year|year,month|year,month,day|month|month,day|day|");
        input2 = scanner.nextLine();
        while (!input2.equals("year")
            && !input2.equals("year,month")
            && !input2.equals("year,month,day")
            && !input2.equals("month")
            && !input2.equals("month,day")
            && !input2.equals("day")) {
            System.out.println("Wrong input.. |year|year,month|year,month,day|month|month,day|day|");
            input2 = scanner.nextLine();
        }
        switch (input2) {
            case "year" -> this.yearGen();
            case "year,month" -> {
                this.yearGen();
                this.monthGen();
                System.out.println("\nConclusion: " + month + " " + year);
            }
            case "year,month,day" -> {
                this.yearGen();
                this.monthGen();
                this.dayGen();
                System.out.println("\nConclusion: " + day + ". " + month + " " + year);
            }
            case "month,day" -> {
                this.monthGen();
                this.dayGen();
                System.out.println("\nConclusion: " + day + ". " + month);
            }
            case "month" -> this.monthGen();
            default -> this.dayGen();
        }
    }

    private void yearGen() {
        do {
            System.out.println("Enter the desired margin |0| - |3000| 'input one, then another'");
            int botN = scanner.nextInt();
            int topN = scanner.nextInt();
            scanner.nextLine();
            while (botN < 0 && topN > 3000) {
                System.out.println("Wrong input..");
                botN = scanner.nextInt();
                topN = scanner.nextInt();
                scanner.nextLine();
            }
            this.year = generator.randomInt(topN, botN);
            System.out.println("\n" + year);
            generator.rollDetection();
            input2 = generator.getInput();
        } while (!input2.equals("n"));
    }

    private void monthGen() {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        do {
            System.out.println("Generating random month..");
            month = months[generator.randomInt(months.length - 1, 0)];
            System.out.println("\n" + month);
            generator.rollDetection();
            input2 = generator.getInput();
        } while (!input2.equals("n"));
    }

    private void dayGen() {
        do {
            System.out.println("Generating random day..");
            if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("August") || month.equals("Oktober") || month.equals("December") || month.equals("")) {
                day = generator.randomInt(31, 1);
            } else {
                day = generator.randomInt(30, 1);
            }
            System.out.println("\n" + day + ". ");
            generator.rollDetection();
            input2 = generator.getInput();
        } while (!input2.equals("n"));
    }
}
