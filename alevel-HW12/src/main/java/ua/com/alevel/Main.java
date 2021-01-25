package ua.com.alevel.secondPart;

import java.util.Scanner;

class Human {

}

class Man extends Human {

}

class Woman extends Human {

}

public class Main {

    public static void main(String[] args) {
        Human boy = new Human();
        Human girl = new Human();

        try {
            Man boy1 = (Man) girl;
        } catch (ClassCastException e) {
            System.out.println("\n" + e.toString());
        }

        int i = 0;
        int[] testArray1 = new int[5];

        while (true) {
            try {
                testArray1[i] = i;
            } catch (Exception e) {
                System.out.println("\n" + e.toString());
                break;
            }
            i++;
        }


        String str = null;
        try {
            if(str.equals("Test")) {
                System.out.println("str is Equals 'Test' ");
            }
        } catch (NullPointerException e) {
            System.out.println("\n" + e.toString());
        }


        int number = 0;
        String number2 = "";
        try {
            number = Integer.parseInt(number2);
        } catch (NumberFormatException e){
            System.out.println("\n" + e.toString());
        }












    }
}
