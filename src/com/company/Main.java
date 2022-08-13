package com.company;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myAge = 30;
        double x = 25.5;
        int y = (int)x + 25;
        String a = "5";
        int c = Integer.parseInt(a) + 5;
        long viewCount = 123456789L;
        float price = 10.99F;
        final float PI = 3.14F;
        double result = (double)10/(double)3;
        char letter = 'A';
        boolean isEligible = false;
        int firstResult = Math.round(1.2F);
        double secondResult = Math.ceil(1.5F);
        int thirdResult = (int)Math.floor(2.5F);
        int fourthResult = Math.max(1, 2);
        int fifthResult = Math.min(1, 2);
        int a = 1;
        int b = 2;
        int temperature = 18;
        boolean newTemperature = temperature >20 && temperature <30;
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean eligibility  = hasHighIncome || hasGoodCredit;
        boolean moreEligibility  = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        int income = 120_000;
        boolean hasHighCtc = (income > 100_000);
        String className = "Economy Class";
        if (income>100_000)
            className = "First Class";
        String newClassName = income > 100_000 ? "First Class" : "Economy CLass";
        double sixthResult = Math.round(Math.random() * 100);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultTwo = currency.format(123456.7890);
        String name = "Udit";
        String check = "Hello World" + "!";
        String test = "I am \"here\"";
        int [] numbers = {5, 2, 4, 3, 1};
        Arrays.sort(numbers);
        Date now = new Date();
        Long hiddenValue = now.getTime();
        System.out.println(now);
        System.out.println(check.replace("!", "!!"));
        System.out.println(check);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(firstResult);
        System.out.println(y);
        System.out.println(test);
        System.out.println(c);
        System.out.println(sixthResult);
        System.out.println(resultTwo);
        System.out.println(eligibility);
        System.out.println(moreEligibility);
        System.out.println(hasHighCtc);
        System.out.println(className);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String myName = input.nextLine().trim();
        System.out.print("Please enter your age: ");
        byte age = input.nextByte();
        System.out.println("My name is: " +myName);
        System.out.println("My age is: " +age);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
    }
}
