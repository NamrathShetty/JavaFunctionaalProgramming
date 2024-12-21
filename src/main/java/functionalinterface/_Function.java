package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increament = increamentByOne(1);
        System.out.println(increament);

        Integer increament2 = incrementByOneFunction.apply(1);
        System.out.println(increament2);

        Integer multiply10 = multiplyByTenFunction.apply(2);
        System.out.println(multiply10);

        Integer incrementAndMultiply = increamentByOneAndMultiply(4, 100);
        System.out.println(incrementAndMultiply);

        Integer incrementAndMultiply4 = incrementByOneAndMultiplyFunction.apply(4, 100);
        System.out.println(incrementAndMultiply4);

    }

    // Function takes 1 argument and produces 1 result
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;

    // BiFunction takes 2 arguments and produces 1 result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction = (numToIncrementByOne, numToMultiply) -> (numToIncrementByOne + 1) * numToMultiply;

    static int increamentByOne(int number) {
        return number + 1;
    }

    static int increamentByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}
