import java.util.Scanner;
public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int input;
      int output;
   
      System.out.println("Enter an integer:");
      input = scnr.nextInt();
      System.out.print("Sequence: ");
      for (output = (input * -1); output <= input; 
output++) { 
      }
      if (input < 0) {
         input = Math.abs(input);
}
     
 for (output = (input * -1); output <= input; output++) 
{ 
      System.out.print(output); 
      System.out.print(" ");
      }
      System.out.println();
   }
}
