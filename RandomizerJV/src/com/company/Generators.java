package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Generators {

    private final Random rndm;
    private final Scanner scanner;
    private final ArrayList<String> list;
    private String input;

    public Generators() {
        this.scanner = new Scanner(System.in);
        this.list = new ArrayList<>();
        this.rndm = new Random();
    }

    public void StringGenerator() {
        do {
            System.out.println("Type anything u cant decide about, then type |decide|");
            input = scanner.nextLine();
            System.out.println("\nGo on: " + this.randomString());
            list.clear();
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void IntGenerator() {
        int bottomN;
        int topN;
        System.out.println("Type the smallest number");
        bottomN = scanner.nextInt();
        System.out.println("Type the biggest number");
        topN = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.println("Random number is : " + this.randomInt(topN, bottomN) + "\n");
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void CharGenerator() {
        String alphabet = "ABCDEFGH1IJKLMNOPQRSTUVWXYZ";
        System.out.println("Printing random letter between |A| - |Z|");
        System.out.println("________________________________________");
        do {
            char pismeno = (alphabet.charAt(rndm.nextInt(26)));
            if (pismeno == '1') {
                System.out.println("CH\n");
            } else {
                System.out.println("\n" + pismeno + "\n");
            }
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void TestGenerator() {
        int pocet;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Type the number of test options |2| - |99|");
        System.out.println("________________________________________");
        pocet = scanner.nextInt();
        scanner.nextLine();
        while (pocet < 2 || pocet > 99) {
            System.out.println("Wrong input.. |2| - |99|");
            pocet = scanner.nextInt();
            scanner.nextLine();
        }
        do {
            char pismeno = (alphabet.charAt(rndm.nextInt(pocet)));
            System.out.println("\n" + pismeno + "\n");
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void BoolGenerator() {
        do {
            System.out.println("Enter your question: ");
            scanner.nextLine();
            System.out.println();
            list.add("Yes");
            list.add("No");
            System.out.println(list.get(rndm.nextInt(2)));
            list.clear();
            this.rollDetection();
        } while (!input.equals("n"));
    }

    public void DateGenerator() {
        new DateGeneration();
    }

    public void rollDetection() {
        System.out.println("\nDo you want to roll again? |y|n|");
        input = scanner.nextLine();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.println("Wrong input |y|n|");
            input = scanner.nextLine();
        }
        if (input.equals("n")) {
            System.out.println("Enjoy\n___________________");
        }
    }

    public int randomInt(int topN, int botN) {
        return rndm.nextInt(topN - botN + 1) + botN;
    }

    public String randomString() {
        while (!input.equals("decide")) {
            list.add(input);
            input = scanner.nextLine();
        }
        int cis = rndm.nextInt(list.size());
        return list.get(cis);
    }

    public String getInput() {
        return this.input;
    }
}


