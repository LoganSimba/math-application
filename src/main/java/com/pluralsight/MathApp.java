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

        //spacing
        System.out.println();


        // computing the lowest salary using min and print  it
        int carPrice = 25000;
        int truckPrice = 90000;

        int lowestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The car's price is " + carPrice + "$");
        System.out.println("The truck's price is " + truckPrice + "$");
        System.out.println("The lower price between truck and car is " + lowestPrice + "$");

        //space
        System.out.println();

        //step 3, calculating the area of a circe and printing it
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println("Radius = " + radius);
        System.out.println("Area of a circle is " + area);

        //space
        System.out.println();


        // 4.square root and print it
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square root of 5.0: " + squareRoot);

        //spacing
        System.out.println();


        // 5. Distance between (5, 10) and (85, 50)
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // formula for calculating the distanced and print it
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between the points (5,10) and (85,82) is %.2f%n " , distance);

        //spacing
        System.out.println();


        // 6. use absolute(positive) value of a variable
        double negativeNumber = -3.8;
        double absNegativeNumber = Math.abs(negativeNumber);
        System.out.println("Absolute value of " +negativeNumber + " is " + absNegativeNumber);


        System.out.println();


        //7. add random number between 0 and 1
        double randomNumber = Math.random();
        System.out.printf("Random number is %.2f%n" , randomNumber);

        //spacing
        System.out.println();


        // 8. calulate how many minutes in 24 days and print it
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int hours = days * hoursPerDay;
        int minutes = hours * minutesPerHour;
        System.out.println("Minutes in 24 days: " + minutes);


        // BONUS, Milliseconds in 24 days and print it
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        long seconds = (long) minutes * secondsPerMinute;
        long milliseconds = seconds * millisecondsPerSecond;
        System.out.println("There are " + milliseconds + " in 24 days");


    }
}
