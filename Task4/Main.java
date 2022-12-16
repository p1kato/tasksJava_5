package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cons = "java";
        String word = in.next();
        word = word.toLowerCase();

        if(word.equals(cons))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
