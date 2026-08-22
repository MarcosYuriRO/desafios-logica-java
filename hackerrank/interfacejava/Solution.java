package interfacejava;

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        AdvancedArithmetic calculator = new MyCalculator();

        System.out.println("I implemented: AdvancedArithmetic");

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            System.out.println(calculator.divisorSum(n));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                result += i;
            }
        }
        return result;
    }

}