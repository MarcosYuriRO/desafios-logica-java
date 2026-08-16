package inttostring;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            String numberToString = String.valueOf(number);
            System.out.println("Good job");
        } catch(Exception e) {
            System.out.println("Wrong answer");
        }
    }
}   