package calculator_demo;

import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

    public static double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }

}
