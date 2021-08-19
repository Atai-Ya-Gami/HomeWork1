package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1
        String MyAge;
        final int num = 15;
        String word = "years old, and you?";
        MyAge = "I'm " + " " + num + " " + word;
        System.out.println(MyAge);
        //2
        if(num<0){
            System.out.println("Вы сохранили отрицательное число.");
        }else if(num>0){
            System.out.println("Вы сохранили положительное число.");
        }else{
            System.out.println("Вы сохранили нуль");
        }
        //3
        Scanner SomeWord = new Scanner(System.in);
        System.out.println("Введите ваше имя :");
        String UserName = SomeWord.nextLine();
        System.out.println("Здравствуйте " + UserName);

    }
}
