package exapmles;

import java.util.Scanner;

public class Triangle

{
    public static void main (String[]args)
    {
        Double choice;
        Scanner input = new Scanner(System.in);
        System.out.println("what are you solveing for? \n 1-  for right triangle \n "+
            "2 -for Isosceles"  );
        choice = input.nextDouble();
        if (choice == 1) {
            rightTriangle();
        }
        //else(choice == 2) {
           isoceles();
         }


    public static void rightTriangle(){
        String choice;
        Double side1;
        Double side2;

        Scanner input =new Scanner(System.in);
        System.out.println("Which side would you like to solve for? \n" +
        "A side\nB side\nC side");
        choice = input.next();

        if(choice.equalsIgnoreCase("A"))
        {
            System.out.println("Please enter for side B >>> ");
            side1 = input.nextDouble();
            System.out.println("PLease enter side C >>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else if(choice.equalsIgnoreCase("B"))
        {
            System.out.println("PLease enter for side A >>> ");
            side1 =input.nextDouble();
            System.out.println("PLease enter side c >>> ");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else
         {
            System.out.println("PLease enter side A >>> ");
            side1 = input.nextDouble();
            System.out.println("plese enter for side B");
            side2 = input.nextDouble();
             rightTriangleMathC(side1, side2, choice);
        }

    }
    public static void rightTriangleMathAB(Double side1, Double side2, String choice) {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("the side " + choice + " is " + notC);
    }
    public static void rightTriangleMathC(Double side1, Double side2, String choice) {
        double C;
        C = Math.sqrt((side2 * side2) + (side1 * side1));
        System.out.println("the side " + choice + " is " + C);
    }
    public static void isoceles(){
        //perimeter or height
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want the perimeter or the hight?");
    }
}