package Task8;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();

        if(text.equals("one")){
            System.out.println("1");

        }else if(text.equals("two")){
            System.out.println("2");

        }else if(text.equals("three")){
            System.out.println("3");

        }else if(text.equals("four")){
            System.out.println("4");

        }else if(text.equals("five")){
            System.out.println("5");

        }else if(text.equals("six")){
            System.out.println("6");

        }else if(text.equals("seven")){
            System.out.println("7");

        }else if(text.equals("eight")){
            System.out.println("8");

        }else if(text.equals("nine")){
            System.out.println("9");
        }else{
            System.out.println("0");
        }
    }
}



























//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        String text = in.next();
//        int amount = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//            amount = 0;
//            for (int j = 0; j < text.length(); j++) {
//                if(text.charAt(i) == text.charAt(j)){
//                    amount++;
//                }
//            }
//            System.out.println(text.charAt(i) + amount);
//        }
//    }
//}
