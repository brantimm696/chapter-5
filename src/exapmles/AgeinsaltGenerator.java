package exapmles;

import java.util.Scanner;

public class AgeinsaltGenerator
{
    public static void main (String[]args)
    {
int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age >>> ");
        age = input.nextInt();

        if(age < 12){
            System.out.println("you are a kid, go away");
        }

        }

        }
