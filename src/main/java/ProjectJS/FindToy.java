package ProjectJS;

import java.util.ArrayList;
import java.util.Scanner;

public class FindToy {
    public static void main(String[] args) {
        ArrayList<String> toy1 = new ArrayList<String>();
        toy1.add("мягкая игрушка");
        toy1.add("10 штук");
        toy1.add("1");

        ArrayList<String> toy2 = new ArrayList<String>();
        toy2.add("машинка");
        toy2.add("20 штук");
        toy2.add("2");

        ArrayList<String> toy3 = new ArrayList<String>();
        toy3.add("кукла");
        toy3.add("30 штук");
        toy3.add("3");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Команды для магазина: 1 - весь каталог, 2 - выбрать игрушку по критериям");

        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(String.valueOf(toy1));
            System.out.println(String.valueOf(toy2));
            System.out.println(String.valueOf(toy3));
        } else if (num == 2) {


            System.out.println("Фильтры: 1 - мягкая игрушка, 2 - машинки, 3 - куклы");
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

        }

        else {
            System.out.println("Такого игрушки в каталоге нет");
        }
    }
}
