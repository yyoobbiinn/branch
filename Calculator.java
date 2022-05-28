import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        String operator;
        Scanner in = new Scanner(System.in);

        System.out.println("a, b 값을 입력하시오:");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println("연산자를 입력하시오:");
        operator = in.next();

        if (operator.equals("+")) {
            Add.add(a, b);
        }
        else if (operator.equals("-")) {
            Sub.sub(a, b);
        }
        else if (operator.equals("*")) {
            Mul.mul(a, b);
        }
        else if (operator.equals("/")) {
            Div.div(a, b);
        }
        else {
            System.out.println("Wrong input.");
        }
    }
}
