package item;

public class CerealFactory implements AbstractFactory {
    @Override
    public Product createVanilla() {
        Product vanillaCereal = new Cereal("vanilla cereal", 3.7, 32);
        return vanillaCereal;
    }

    @Override
    public Product createChocolate() {
        Product chocolateCereal = new Cereal("chocolate cereal", 2.2, 39);
        return chocolateCereal;
    }

    @Override
    public Product createStrawberry() {
        Product strawberryCereal = new Cereal("strawberry cereal", 2.3, 25);
        return strawberryCereal;
    }
}
