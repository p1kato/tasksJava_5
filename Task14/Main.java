package Task14; // анализ этой задачи, не понял

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1= in.next();
        String s2= in.next();

        if(s1.indexOf(s2) == -1){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
