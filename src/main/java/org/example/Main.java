package org.example;

import org.example.carInventorySystem.Car;
import org.example.carInventorySystem.Sedan;
import org.example.carInventorySystem.Truck;
import org.example.carInventorySystem.UtilityVehicle;

import org.example.videoStreamingService.Movie;
import org.example.videoStreamingService.TvSeries;

import java.math.BigDecimal;
import static org.example.bigDecimalOperations.BigDecimalOperations.reverseSignAndRoundToTenth;
import static org.example.bigDecimalOperations.BigDecimalOperations.roundToHundredth;

public class Main {
    public static void main(String[] args) {
        // BigDecimalOperations
        System.out.println("\n-------Task 1----------\n");
        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + roundToHundredth(num1)); // 4.25

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(num2)); // -1.2

        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(num3)); // 45.7

        //CarInventorySystem
        System.out.println("\n-------Task 2----------\n");
        Car sedan = new Sedan("1A2B3C", "Toyota", "Camry", 25000);
        Car suv = new UtilityVehicle("4D5E6F", "Subaru", "Outback", 40000, true);
        Car truck = new Truck("7G8H9I", "Ford", "F-150", 60000, 13000.5);

        System.out.println(sedan.getInfo());
        System.out.println("\n-----------------\n");
        System.out.println(suv.getInfo());
        System.out.println("\n-----------------\n");
        System.out.println(truck.getInfo());

        //VideoStreamingService
        System.out.println("\n-------Task 3----------\n");
        TvSeries breakingBad = new TvSeries("Breaking Bad", 60, 62);
        System.out.println(breakingBad.getInfo());
        Movie inception = new Movie("Inception", 148, 8.8);
        System.out.println(inception.getInfo());
    }
}