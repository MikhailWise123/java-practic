package ProjectJS;

import java.util.ArrayList;
import java.util.Scanner;

public class FindToy {
    public static void main(String[] args) {
        ArrayList<String> toy1 = new ArrayList<String>();
        toy1.add("мягкая игрушка");
        toy1.add("10 штук");


        ArrayList<String> toy2 = new ArrayList<String>();
        toy2.add("машинка");
        toy2.add("20 штук");


        ArrayList<String> toy3 = new ArrayList<String>();
        toy3.add("кукла");
        toy3.add("30 штук");


        ArrayList<String> toy4 = new ArrayList<String>();
        toy4.add("конструктор");
        toy4.add("15 штук");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Команды для магазина: 1 - весь каталог, 2 - выбрать игрушку по критериям");

        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(String.valueOf(toy1));
            System.out.println(String.valueOf(toy2));
            System.out.println(String.valueOf(toy3));
            System.out.println(String.valueOf(toy4));
        } else if (num == 2) {


            System.out.println("Фильтры: 1 - мягкая игрушка, 2 - машинки, 3 - куклы, 4 - конструкторы");
            int NUM = scanner.nextInt();
            if (NUM == 1) {
                System.out.println(toy1);
            }

            if (NUM == 2) {
                System.out.println(toy2);
            }

            if (NUM == 3) {
                System.out.println(toy3);
            }

            if (NUM == 4) {
                System.out.println(toy4);
            }

        }

        else {
            System.out.println("Таких игрушук в каталоге нет");
        }
    }
}
