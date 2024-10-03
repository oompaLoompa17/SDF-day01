package calc;

import java.io.Console;

public class Calculator {

    public static void main (String[] args){

        Console cons = System.console();

        double x = 0;
        String input = cons.readLine();

        while (!input.equals("BRK")){

            if (input.equals("INIT")){
                x = 0;
            } else if (input.equals("ADD")){
                double addInput = Double.parseDouble(cons.readLine());
                x += addInput;
            } else if (input.equals("MUS")){
                double musInput = Double.parseDouble(cons.readLine());
                x -= musInput;
            } else if (input.equals("MUL")){
                double mulInput = Double.parseDouble(cons.readLine());
                x *= mulInput;
            } else if (input.equals("DIV")){
                double divInput = Double.parseDouble(cons.readLine());
                x /= divInput;
            } else {
                System.out.println("Command not received, try again.");
            }
            System.out.println(x);
            input = cons.readLine();
            
        }
        System.exit(0);
    }

}

//dev a calculator program with the following commands:
//INIT - iniitializes stored value as 0
//ADD - prompts for terminal value to +
//MUL - prompts for terminal value to x
//DIV - prompts for terminal value to /
//BRK - exits all calculations
