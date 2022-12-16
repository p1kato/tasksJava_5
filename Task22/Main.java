package Task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                System.out.print("0");
            }else{
                System.out.print(s.charAt(i)+"");
            }

        }
    }
}
