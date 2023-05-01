package ProjectJS;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите '1' если хотите поучавствовать в розыгрыше игрушки");
        int answer = scanner.nextInt();
        if (answer == 1) {
            System.out.println("Отлично! Выпавшее число означает выбор любой игрушки из этой категории. Напишите секретный пароль в чат чтобы крутить барабан(123)");
        }
        Scanner scanner1 = new Scanner(System.in);
        int answer1 = scanner1.nextInt();
        if (answer1 == 123){
            int a = (int) (1 + Math.random()*5);

            System.out.println("Поздравляем ваше число " + a + "! Можете выбрать любую игрушки из этих категорий: " +
                    "1-мягкие игрушки, " +
                    "2-машинки, 3-куклы, " +
                    "4-конструктор");
        }
        System.out.println("Ждём вас за призом");

    }
}
