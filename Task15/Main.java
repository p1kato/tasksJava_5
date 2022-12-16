package Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        char[] symbols = {'a', 'e', 'u', 'i', 'o'};
        int sum = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < symbols.length; j++) {
                if(text.charAt(i) == symbols[j]){
                    sum += 1;
                }
            }
        }
        System.out.println(sum);
    }
}

