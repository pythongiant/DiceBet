package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random Dice = new Random();
        Scanner UserIn=new Scanner(System.in);
        Scanner  Bet =new Scanner(System.in);
        int UserInput;
        int random_num;
        int bet_amount;
        String pound = "\u00a3";

        System.out.println("\t"+"roll a dice!!!!!!!!!!!!!");
        System.out.println("bet on the dice, Sire,What will be the outcome? ");
        UserInput=UserIn.nextInt();

        System.out.println("Place your bets");
        bet_amount=Bet.nextInt();

        random_num=1+Dice.nextInt(6);
        System.out.println("you have "+random_num);


        if (UserInput == random_num){
            System.out.println("you were right!!!!! You won "+ bet_amount+ pound);
        }
        else{
            System.out.println("Oi,You were wrong.Now give me my "+bet_amount+ pound);
        }
    }
}
