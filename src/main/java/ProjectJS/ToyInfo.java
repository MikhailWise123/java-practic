package ProjectJS;

public class ToyInfo {


    public static void main(String[] args) {
        MainClass toy1 = new MainClass(1);
        toy1.description = "мягкая игрушка";
        toy1.amount = 10;
        toy1.age = 0;


        MainClass toy2 = new MainClass(2);
        toy2.description = "машинка";
        toy2.amount = 20;
        toy2.age = 3;


        MainClass toy3 = new MainClass(3);
        toy3.description = "кукла";
        toy3.amount = 30;
        toy3.age = 0;


        MainClass toy4 = new MainClass(4);
        toy4.description = "конструктор";
        toy4.amount = 15;
        toy4.age = 8;

        System.out.println(toy1);
        System.out.println(toy2);
        System.out.println(toy3);
        System.out.println(toy4);


    }
}
