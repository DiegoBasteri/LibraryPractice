package com.example.IronLibrary.InitialMenu;

import com.example.IronLibrary.Commands.Commands.CommandsMethods;

import java.util.Scanner;

public class Menu {

    public static void initialMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean test = false;
        while (!test) {

            System.out.println("\n"+"\n"+"\n"+"HELLO WELCOME TO YOUR LIBRARY MENU"+"\n");
            System.out.println("\n"+"\n"+"PRESS 'c' TO COMMAND MENU" + "\n" +
                    "PRESS 'e' -- To EXIT" + "\n"
            );
            String choice = scanner.next().toLowerCase();
            while (!choice.equals("c") && !choice.equals("e") && !choice.equals("b")) {

                System.out.println("Invalid input. Please enter 'C' back to Commands Menu, 'E' to exit ");
                choice = scanner.next().toLowerCase();
            }
            switch (choice) {
                case ("c"):
                    CommandsMethods.commandMenu(scanner);
                    break;
                case ("e"):
                    System.out.println("FIN DE LA APLICACION");
                    test = true;
                    break;

            }

        }
    }
}
