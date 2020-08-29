package lcl.mm.pattern.decorator;

public class CofeeA extends Beverage{
    public CofeeA(){
        desc = "CofeeA";
    }

    @Override
    public int cost() {
        return 5;
    }
}
