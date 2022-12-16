package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next(); // Almata
        String word2 = in.next(); // a

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        int count = 0;

        for (int i = 0; i < word1.length(); i++) {
            if(word1.charAt(i) == word2.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
