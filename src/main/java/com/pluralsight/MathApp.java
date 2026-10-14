package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 100000;
        int garySalary = 120000;

        // highest salary of our two variables
        int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("Bob's salary is " + bobSalary + "$");
        System.out.println("garySalary is " + garySalary + "$");
        System.out.println("The highest salary is " + highestSalary + "$");



        int carPrice = 25000;
        int truckPrice = 90000;

        // computing the lowest salary using min
        int lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The car's price is " + carPrice + "$");
        System.out.println("The truck's price is " + truckPrice + "$");
        System.out.println("The lower price is between truck and car is " + lowestPrice + "$");







    }
}
