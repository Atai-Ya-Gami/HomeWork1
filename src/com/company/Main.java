package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //1
//        String MyAge;
//        final int num = 15;
//        String word = "years old, and you?";
//        MyAge = "I'm " + " " + num + " " + word;
//        System.out.println(MyAge);
//        //2
//        if(num<0){
//            System.out.println("Вы сохранили отрицательное число.");
//        }else if(num>0){
//            System.out.println("Вы сохранили положительное число.");
//        }else{
//            System.out.println("Вы сохранили нуль");
//        }
//        //3
//        Scanner SomeWord = new Scanner(System.in);
//        System.out.println("Введите ваше имя :");
//        String UserName = SomeWord.nextLine();
//        System.out.println("Здравствуйте " + UserName);
        HoweTask DoSome = new HoweTask();
        int a = DoSome.GenerateRandomAge(100);
        int b = DoSome.GenerateRandomAge(100);
// тут крч я сделал метод который возвращает рандомные числа, но проблема в том,
// что метод WeatherAdvice берет в параметры только целочисленные значения, и когда я ставлю переменную a или b то функция перестает работать.
        DoSome.WeatherAdvice(50,50);
        DoSome.WeatherAdvice(5,25);
        DoSome.WeatherAdvice(25,30);
        DoSome.WeatherAdvice(46,20);
        DoSome.WeatherAdvice(46,-11);
        DoSome.WeatherAdvice(46,-11);
    }
}
class HoweTask{
    public static int GenerateRandomAge(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
        }
    public static void WeatherAdvice(int Age, int Weather) {
        if(Age > 20 && Age < 45) if (Weather > -20 && Weather < 30) {
            System.out.println("Можно идти гулять");
        }
        if(Age<20) if(Weather > 0 && Weather < 28){
            System.out.println("Можно идти гулять");
        }
        if(Age>45) if (Weather > -10 && Weather <25){
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома.");
        }

    }
    }



