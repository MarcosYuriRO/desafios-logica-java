package inheritance2;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: ".concat(adder.getClass().getSuperclass().getName()));

        System.out.printf("%d %d %d", adder.add(36, 6), adder.add(-7, 20), adder.add(20, 0));
    }
}

class Arithmetic {

    int add (int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}

class Adder extends Arithmetic {

}