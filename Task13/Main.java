package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String res = "";

        for (int i = 0; i < word.length(); i++) {
            res = word.charAt(i) + res;
        }
        System.out.print(res);
    }
}
