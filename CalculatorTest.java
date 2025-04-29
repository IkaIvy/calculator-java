
public class CalculatorTest {

    public static void main(String[] args) {
        testCalculate();
    }

    public static void testCalculate() {
        String expression = "4+5";
        int expectedResult = 9;
        int actualResult = Calculator.calculate(expression);

        if (expectedResult == actualResult) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed for expression: " + expression);
        }
    }
}
