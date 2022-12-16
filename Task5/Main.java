package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if(word1.equals(word2))
            System.out.println("THEY ARE EQUAL");
        else
            System.out.println("THEY ARE NOT EQUAL");
    }
}

