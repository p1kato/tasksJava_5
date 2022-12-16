package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // ask to agai

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String js = "";

        System.out.print(Character.toUpperCase(s.charAt(0)));

        for (int i = 1; i < s.length(); i++)//
        {
            if (" ".equals(s.substring(i-1, i)))
                js = js + s.substring(i, i+1).toUpperCase();
            else
                js = js + s.charAt(i);
        }
        System.out.print(js);

    }
}