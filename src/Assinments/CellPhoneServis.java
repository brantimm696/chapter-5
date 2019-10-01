package Assinments;

import java.util.Scanner;

public class CellPhoneServis
{
    public static void main (String[]args)
    {
        int textSent;
        int gbUsed;
        int minUsed;
        String  result = null;
        Scanner input = new Scanner(System.in);

        System.out.println(" how many minutes are you going to use? >>> ");
        minUsed = input.nextInt();

        System.out.println(" how many text messages are you going to send? >>> ");
        textSent = input.nextInt();

        System.out.println(" haw many Gigabytes are you going to use? >>> ");
        gbUsed = input.nextInt();

        if(minUsed < 500 && textSent == 0 && gbUsed == 0 ){
            result = "plan A";
        }
        else if (minUsed < 500 && textSent >= 1 && textSent <= 99 && gbUsed == 0 ){
            result = "plan B";
        }
        else if( minUsed >= 500 && textSent >= 1 && textSent <= 100 && gbUsed == 0){
            result = " plan C";
        }
        else if(minUsed >= 500 && textSent >= 1 && textSent >= 100 && gbUsed == 0 ){
            result = "plan D";

        }
        else if (minUsed > 500 && textSent > 100 && gbUsed >= 1){
            if ( gbUsed < 2){
                result = " plan E $87";
            }

        }


        System.out.println(" the plan you need is" + result);

    }
}
