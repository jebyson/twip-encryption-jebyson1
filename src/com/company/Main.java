package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        EncryptWord extra = new EncryptWord("amazing");
        System.out.println("The encryption is listed below:");
        System.out.println(extra.encryptedWord());
        System.out.println("Enter 'yes' if you would like to find the original message. Enter 'no' if you want to leave.");
        Scanner input = new Scanner(System.in);
        String yesNo = input.nextLine();

        if(yesNo.equalsIgnoreCase("yes"))
        {
            System.out.print("Every letter in the encrypted word is two letters after the real letter. ");
            System.out.print("Uppercase letters are encrypted by capital letters only. ");
            System.out.print("Lowercase letters are encrypted by lowercase letters only. ");
        }
        else if(yesNo.equalsIgnoreCase("no"))
        {
            System.out.println("Thank you. Goodbye");
        }
        else
        {
            System.out.println("Invalid response. Goodbye");
        }
    }
}
