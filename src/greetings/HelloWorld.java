package myapp;

import java.io.Console;

public class Greetings {

    public static void main(String[] args){
        
        //declare a variableb of type COnsole
        // and get the console
        Console cons = System.console();

        //Prompt the user for something, then result is
        // assigned to the variable called input
        String input = cons.readLine("What is your name? ");
        String input2 = cons.readLine("How old are you? ");

        // print the input
        System.out.printf("Hello. You said %s . You also said this: %s\n", input, input2);
    }

}