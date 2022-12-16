package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bit = "BITLAB";
        String word = in.next();

        if(word.equals(bit))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
