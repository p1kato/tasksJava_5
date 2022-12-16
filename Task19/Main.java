package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String bla1 = ""+s.charAt(0);
        String bla2 = ""+s.charAt(1);
        int x = Integer.parseInt(bla1);

        System.out.print(bla2 + x * 2);
    }
}