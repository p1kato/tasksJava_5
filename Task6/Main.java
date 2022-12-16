package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1 = in.next();
        String word2 = in.next();

        int index = word1.indexOf(word2);
        if (index == -1) {
            System.out.println("THERE IS NO SUCH LETTER");
        } else
            System.out.println(index);
    }
}










