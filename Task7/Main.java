package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        word = word.trim();
        System.out.println("(" + word + ")");
    }
}