package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First name: ");
        String firstname = scanner.nextLine().trim();
        System.out.println("Middle name: ");
        String middlename = scanner.nextLine().trim();
        System.out.println("Last name: ");
        String lastname = scanner.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        String fullname = firstname;
        if (!middlename.equals(" ")) {
            fullname = fullname + " " + middlename;
        }
        if (!suffix.equals(" ")){
            fullname=fullname+" "+ " "+lastname+" "+suffix;
        }
        System.out.println(fullname);



    }
}
