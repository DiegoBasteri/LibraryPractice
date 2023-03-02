package com.example.IronLibrary.Commands.Commands;

import com.example.IronLibrary.Commands.Enums.CommandList;

import java.util.Scanner;

public class CommandsMethods {

public static void commandMenu(Scanner scanner){

    boolean test = false;
    CommandList commands = null;
    while(!test){
        System.out.println("introduce uno de los siguientes comandos :"
                +"\n "+ "1.-ADD A BOOK: This command will add a book to the library."
                +"\n "+ "2.-SEARCH BOOK BY TITLE: This command will help you search a book by title."
                +"\n "+ "3.-SEARCH BOOK BY CATEGORY: This command will help you search a book by category."
                +"\n "+ "4.-BOOK LIST: This command will display a list of books with the author's name."
                +"\n "+ "5.-SEARCH BOOK BY AUTHOR: this command will help you find a book by author"
                +"\n "+ "6.-ISSUE BOOK TO STUDENT: This command will add a issue"
                +"\n "+ "7.-BOOK LIST BY [USN]: This command will display a list of books by usn"
                +"\n "+ "8.-EXIT: This command will exit command menu"
        );

        int opcion = scanner.nextInt();
        if(opcion >8 || opcion <1){
            System.err.println("comando no valido");
        }else{
            switch (opcion){
                case 1 : commands = CommandList.ADDBOOK; break;
                case 2 : commands = CommandList.SEARCH_BOOK_BY_TITLE; break;
                case 3 : commands = CommandList.SEARCH_BOOK_CATEGORY; break;
                case 4 : commands = CommandList.BOOK_LIST; break;
                case 5 : commands = CommandList.SEARCH_BOOK_BY_AUTHOR; break;
                case 6 : commands = CommandList.ISSUE_BOOK_STUDENT; break;
                case 7 : commands = CommandList.BOOK_LIST_BY_USN; break;
                case 8 : commands = CommandList.EXIT; break;

            }
            test = true;
        }
    }

    switch (commands){
        case ADDBOOK:
        CommandAddBook.addBook(scanner);
    }

}

}
