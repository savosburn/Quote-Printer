package ex03;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String myQuote = myApp.readQuote();
        String myAuthor = myApp.readAuthor();

        String concatenation = myApp.concatenateOutput(myQuote, myAuthor);
        myApp.printOutput(concatenation);
    }

    public String readQuote() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    public String readAuthor() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }

    public String concatenateOutput(String quote, String author) {
        return String.format("%s says, \"%s\"", author, quote);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }
}
