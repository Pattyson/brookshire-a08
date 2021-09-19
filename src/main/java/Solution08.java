/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */


import java.util.Scanner;

public class Solution08 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        int people, pizza, remainder, slices, x;

        System.out.println("How many people?");
        people = input.nextInt();

        System.out.println("How many pizzas do you have?");
        pizza = input.nextInt();

        System.out.println("How many slices per pizza?");
        slices = input.nextInt();
        slices *= 8;

        System.out.println(people + " people with " + pizza + " pizzas (" + slices + " slices)");

        int answer;

        answer = slices / people;
        remainder = slices % people;

        System.out.println("\r\nEach person gets " + answer + " pieces of pizza.");
        System.out.println("There are " + remainder + " leftover pieces.");
    }
}
