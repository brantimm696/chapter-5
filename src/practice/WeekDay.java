package practice;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day;
        String result;
        System.out.println("Enter the day of the week");
        day = input.next();

        Switch(day){
                case "monday";
                result= "reserve room for friday meeting";
                break;
                case"tuesday";
                result= "prepair power slides";
                break;
                case "wednesday";
                result= "send out meeting reminder";
                break;
                case"thursday";
                result="where spirit gear";
                break;
                case"friday";
                result="where your jursyes day";
                break;


        }
    }

