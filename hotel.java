package Pentagon.java_programing;

import java.util.Scanner;

public class hotel {

    static int amount = 0;

    static int p1 = 123;
    static int p2 = 456;
    static int p3 = 987;
    static int p4 = 567;
    static int p5 = 678;

    static void dish1() {
        System.out.println("The dish to be served is -- Chicken Curry");
        System.out.println("The price of the dish is "+p1);
        amount = amount + p1;
    }
    static void dish2() {
        System.out.println("The dish to be served is -- Biriyani");
        System.out.println("The price of the dish is "+p2);
        amount = amount + p2;
    }
    static void dish3() {
        System.out.println("The dish to be served is -- Jamun");
        System.out.println("The price of the dish is "+p3);
        amount = amount + p3;
    }
    static void dish4(){
        System.out.println("The dish to be served is -- Pizza");
        System.out.println("The price of the dish is "+p4);
        amount = amount + p4;
    }
    static void dish5() {
        System.out.println("The dish to be served is -- Masala Dosa");
        System.out.println("The price of the dish is "+p5);
        amount = amount + p5;
    }

    static void dishes(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nThe menu card has the following items: ");
            System.out.println("1. Chicken Curry");
            System.out.println("2. Biriryani");
            System.out.println("3. Jamun");
            System.out.println("4. Pizza");
            System.out.println("5. Masala Dosa");
            System.out.println("6. Exit and show bill ");
            System.out.println("\nEnter the id of the order to be selected: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1: dish1(); break;
                case 2: dish2(); break;
                case 3: dish3(); break;
                case 4: dish4(); break;
                case 5: dish5(); break;
                case 6:
                    System.out.println("\nTotal bill amount is "+amount);
                    System.out.println("Thank you for visiting");
                    System.exit(0);
                default:
                    System.out.println("Enter the valid input");
            }
        }
    }
    public static void main(String[] args) {
            dishes();
    }
}

