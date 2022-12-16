package Task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==' '){

                for (int j = i - 1; j >= count; j--) {
                    System.out.print(text.charAt(j));
                }
                count = i + 1;
                System.out.print(' ');
            }
        }

        for(int i = text.length() - 1; i >= 0; i--) {
            if(text.charAt(i) == 32) {
                break;
            } else {
                System.out.print(text.charAt(i));
            }
        }


    }
}
