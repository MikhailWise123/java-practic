package ProjectJS;

import lesson6.LAPTOP;

public class MainClass {
    int id;
    String description;
    int amount;
    int age;
    public MainClass(int id, int RAM, String VideoCard, String color) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.age = age;
    }
    public MainClass(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return String.format("%d %s %d %d", id, description, amount, age);

    }
    @Override
    public boolean equals(Object o){
        var t = (MainClass) o;
        return id == t.id;
    }

    @Override
    public int hashCode(){
        return id;
    }


}
