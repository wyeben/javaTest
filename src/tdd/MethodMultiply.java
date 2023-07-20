package tdd;

public class MethodMultiply {
        public static int multiply(int a, int b) {
            boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);

            a = Math.abs(a);
            b = Math.abs(b);

            int result = 0;


            for (int i = 0; i < b; i++) {
                result += a;
            }

            if (isNegative) {
                result = -result;
            }

            return result;
        }

        public static void main(String[] args) {
            int num1 = 5;
            int num2 = -3;
            int result = multiply(num1, num2);
            System.out.println("Result: " + result);
        }
    }