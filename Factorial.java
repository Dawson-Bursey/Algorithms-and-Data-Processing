
public class Factorial {
    public int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public int factorialRecursive(int n){
        if (n <= 1) return n;
        return n * factorialRecursive(n - 1);
    }

    public int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public String decimalToBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Iterative: " + factorial.factorialIterative(7));
        System.out.println("Recursive: " + factorial.factorialRecursive(7));
        System.out.println("Sum Recursive: " + factorial.sumRecursive(7));
        System.out.println("Decimal to Binary: " + factorial.decimalToBinary(7));
    }
}