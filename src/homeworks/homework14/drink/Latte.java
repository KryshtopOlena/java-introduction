package homeworks.homework14.drink;

public class Latte extends Drink {

    public Latte(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Лате");
    }

}
