package HomeWork;

import java.util.Scanner;

public class HomeWork1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter your name");
         String name = scanner.nextLine();
         System.out.println("Please enter your hobby");
         String hobby = scanner.nextLine();
         System.out.println("Hello " + name + " your hobby " + hobby + " is exciting and very interesting!");
    }
}
