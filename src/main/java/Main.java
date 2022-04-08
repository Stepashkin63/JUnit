public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c); /* Происходит деление на ноль. Здесь необходимо использовать либо тернарный оператор в (BinaryOperator<Integer> devide) либо
        полноценный многострочный код */
    }
}