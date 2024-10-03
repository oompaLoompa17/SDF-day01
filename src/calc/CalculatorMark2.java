package calc;

import java.io.Console;

public class CalculatorMark2 {

   // Constant
   public static final int CMD_POS= 0;

   public static void main(String[] args) {

      // declare an accumulator
      float acc = 0;
      float value = 0;

      boolean stop = false;

      Console cons = System.console();

      while (!stop) {

         // Read a line and trim it
         String cmd = cons.readLine("CMD> ").trim();

         // split into terms
         String[] terms = cmd.split(" ");

         switch (terms[CMD_POS].toUpperCase()) {
            // ADD 5 6 7 9
            case "ADD":
               for(int i=1; i < terms.length; i++){
               value = Float.parseFloat(terms[i]);
               acc += value;
               }
               break;
            
            // SUB 5 6 7 9
            case "SUB":
               for(int i=1; i < terms.length; i++){
               value = Float.parseFloat(terms[i]);
               acc -= value;
               }
               break;

            // MUL 5 6 7 9
            case "MUL":
               for(int i=1; i < terms.length; i++){
               value = Float.parseFloat(terms[i]);
               acc *= value;
               }
               break;

            // DIV 4
            case "DIV":
               for(int i=1; i < terms.length; i++){
               value = Float.parseFloat(terms[i]);
               acc /= value;
               }
               break;

            // initializes the accumulator to 0
            case "INIT":
               acc = 0;
               break;

            case "BRK":
               stop = true;
               break;

            case "SHOW":
               System.out.printf("> %3f\n", acc);
               break;

            default:

         }

      }

   }

}