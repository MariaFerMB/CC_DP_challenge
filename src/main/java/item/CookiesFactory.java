package item;


public class CookiesFactory implements AbstractFactory {
    @Override
    public Product createVanilla() {
        Product vanillaCookie = new Cookie("vanilla cookie", 1.5, 24);
        return vanillaCookie;
    }

    @Override
    public Product createChocolate() {
        Product chocolateCookie = new Cookie("chocolate cookie", 2.0, 17);
        return chocolateCookie;
    }

    @Override
    public Product createStrawberry() {
        Product strawberryCookie = new Cookie("strawberry cookie", 1.7, 30);
        return strawberryCookie;
    }
}
