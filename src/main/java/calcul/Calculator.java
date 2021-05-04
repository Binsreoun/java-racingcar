package calcul;

public class Calculator {
    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {

        return a - b;
    }

    public int multi(int a, int b) {

        return a * b;
    }

    public int division(int a, int b) {

        return a / b;
    }

    public void nullCheck(String input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("입력값이 null입니다.");
        }
    }

    public void operCheck(String input) throws IllegalArgumentException {
        if (!input.contains("+") || !input.contains("-") || !input.contains("*") || !input.contains("/")) {
            throw new IllegalArgumentException("입력값에 사칙연산이 없습니다.");
        }
    }
}
