package ProjectJS;

import lesson6.LAPTOP;

public class ToyInfo {
    public static void main(String[] args) {
        MainClass toy1 = new MainClass(1);
        toy1.description = "мягкая игрушка";
        toy1.amount = 1;
        toy1.percent = 1;

        MainClass toy2 = new MainClass(2);
        toy2.description = "машинка";
        toy2.amount = 2;
        toy2.percent = 2;

        MainClass toy3 = new MainClass(3);
        toy3.description = "кукла";
        toy3.amount = 3;
        toy3.percent = 3;

        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);
    }
}
