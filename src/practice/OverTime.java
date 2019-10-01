package practice;

import java.util.Scanner;

public class OverTime
{
    public static void main (String[]args)
    {
        double employeeHours;
        double total;
        double pay =10.50;
        double otHours;
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours did ypu work? ");
        employeeHours =input.nextDouble();

        if(employeeHours > 40){
            otHours= employeeHours -40;
            total = (pay * 40) + (otHours * (pay*1.5));
            System.out.println("Gross pay equals " + total);
        }
else{
            total = pay * employeeHours;
            System.out.println("Gross pay equals " + total);
        }
    }
}
