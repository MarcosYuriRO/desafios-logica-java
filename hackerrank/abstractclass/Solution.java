package abstractclass;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Book book = new MyBook();
            book.setTitle(scanner.nextLine());

            System.out.println("The title is: ".concat(book.getTitle()));
        } catch(RuntimeException e) {
            throw new RuntimeException(e);
        }
        
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }
    
}