package lcl.mm.pattern.decorator;

public class CofeeB extends Beverage{
    public CofeeB(){
        desc = "CofeeB";
    }

    @Override
    public int cost() {
        return 10;
    }
}
