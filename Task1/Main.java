package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String word = in.next();
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        System.out.println(count);

    }
}
