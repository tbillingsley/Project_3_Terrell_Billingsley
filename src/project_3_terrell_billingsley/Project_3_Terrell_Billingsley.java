/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_3_terrell_billingsley;

/**
 *
 * @author Terrell
 */
import java.util.Scanner; //console input
public class Project_3_Terrell_Billingsley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        int num, squared, cubed;
        String table = "";
        table += "Number\t\tSquared\t\tCubed\n";
        table += "======\t\t=======\t\t=====\n";
        Scanner sc = new Scanner(System.in);
        //prompt user for input
       
        //call getIntWithinRange method
        num = getIntWithinRange(sc, "Enter an integer: ",0,10);
        //start a for loop
        for (int i=1; i<=num; i++) //computes the entered integer
        {
            //calculate number squared and number cubed
            squared = (int) Math.pow(i, 2);
            cubed = (int) Math.pow(i, 3);
            //append (+=) each row to the existing tbl
            table+=i+"\t\t" + squared + "\t\t" + cubed + "\n";
            
        }
        //display table
        System.out.print(table);
    } //end of main method
        public static int getValidInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false; //assign isValid to false
        while (isValid == false) //compare isValid is false?
        { //start of while loop
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
               i=sc.nextInt(); //if input is an integer, assign the integer to i
               isValid = true;
            }
            else
            {
                System.out.println("Invalid input. Integer must be between 0-10!!. Try again. \n");
            }
            //clear user input from memory
            sc.nextLine(); //discard invalid input
        }
        
        return i;
    } //end of isValidInt method
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid==false)
        {
         //call getValidInt method
            i=getValidInt(sc, prompt);
            if (i<min)
                System.out.println("Error!! Integer must be between 0-10! " + min + "\n");
            else if (i>max)
                System.out.println("Error!! Integer must be between 0-10! " + max + "\n");
            else
            isValid = true;
        }
            return i;
        }
}   //end of class