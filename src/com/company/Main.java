package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a word to be encrypted!");
        EncryptWord abc = new EncryptWord("word");
        System.out.println(abc.getEncryptIt());
    }
}