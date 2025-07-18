package org.example.bigDecimalOperations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    // Redondea a la centésima (hundredth) y devuelve como double
    public static double roundToHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    // Invierte el signo, redondea a la décima (tenth) y devuelve como BigDecimal
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }
}

