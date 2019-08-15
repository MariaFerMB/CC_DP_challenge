package item;

public class MilkFactory implements AbstractFactory {
    @Override
    public Product createVanilla() {
        Product vanillaMilk = new Milk("vanilla milk", 3.6, 22);
        return vanillaMilk;
    }

    @Override
    public Product createChocolate() {
        Product chocolateMilk = new Milk("chocolate milk", 3.1, 54);
        return chocolateMilk;
    }

    @Override
    public Product createStrawberry() {
        Product strawberryMilk = new Milk("strawberry milk", 4.0, 36);
        return strawberryMilk;
    }
}
