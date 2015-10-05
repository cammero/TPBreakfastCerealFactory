package com.cameoEugeneJessy;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (Cereal c : allCereals){
        System.out.println("How many boxes of " + c.getName() + " to order");
        int boxes =  Integer.parseInt(s.nextLine());
    }

    }


}
