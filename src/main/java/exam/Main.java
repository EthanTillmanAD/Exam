package exam;

import java.util.Scanner;

public class Main {

    public static void printFullName(String first, String last){
        System.out.println(first + " " + last);

    }
    public static void printOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the burger joint. Is it true or false that your order will be to go");
        boolean hereOrGo = scanner.nextBoolean();
        System.out.println("what type of burger would you like today? Cheese, ham or turkey");
        scanner.nextLine();
        String burger = scanner.nextLine();
        System.out.println("please enter tip amount: 0%, 5%, 10%, 15% or 20%");
        int tipAmount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the name for you order");
        String customerName = scanner.nextLine();
        int y = getPrice();
        if(tipAmount == 0){
            System.out.println("Total price will be " + y);
        }else if(tipAmount == 5){
            double j = (y * .05);
            double l = y + j;
            System.out.println("Total price will be " + l);

        } else if (tipAmount == 10) {
            double j = (y * .10);
            double l = y + j;
            System.out.println("Total price will be " + l);
        } else if (tipAmount == 15) {
            double j = (y * .15);
            double l = y + j;
            System.out.println("Total price will be " + l);
        } else if (tipAmount == 20) {
            double j = (y * .20);
            double l = y + j;
            System.out.println("Total price will be " + l);
        }


    }

    public static void main(String[] args) {
        String firstName = "Ethan";
        String lastName = "Tillman";

        char[] size = {'S', 'M', 'L'};
        final int EXPERATIONDATE = 19;

        printFullName(firstName, lastName);
        System.out.println(getPrice());
        printSizes(size);

       // printOrder();

        double[] productPrice = {20.00, 15.00, 45.99};

        System.out.println(priceAfterDiscount(productPrice, 5));
        rollDice();

    }

    public static void rollDice(){
        int dice1 = (int)(Math.random() * 6) + 1;
        int dice2 = (int)(Math.random() * 6) + 1;

        System.out.println(dice1 + "," + dice2);

    }

    public static void isPalindorne(){
        Scanner name = new Scanner(System.in);
        boolean x = false;
        String isName =
        while(!x){
            System.out.println("give me a word");
          String k = name.nextLine();
            if(k.)
        }

    }

public static int getPrice(){
        int x = (int)(Math.random() * 15) + 5 ;
        return x;
}

public static void printSizes(char[] sizes){

        for(int i = 0; i < sizes.length; i++){
            System.out.println(sizes[i]);
        }

}
public static double priceAfterDiscount(double[] productPrice, int discountAmount){


            double discount = productPrice[productPrice.length - 1];


        return (discount / discountAmount) + productPrice[productPrice.length - 1];
}

}
