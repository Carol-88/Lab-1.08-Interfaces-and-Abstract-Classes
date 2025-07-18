package org.example;

import java.math.BigDecimal;
import static org.example.bigDecimalOperations.BigDecimalOperations.reverseSignAndRoundToTenth;
import static org.example.bigDecimalOperations.BigDecimalOperations.roundToHundredth;

public class Main {
    public static void main(String[] args) {
        // BigDecimalOperations

        BigDecimal num1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + roundToHundredth(num1)); // 4.25

        BigDecimal num2 = new BigDecimal("1.2345");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(num2)); // -1.2

        BigDecimal num3 = new BigDecimal("-45.67");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(num3)); // 45.7
    }
}