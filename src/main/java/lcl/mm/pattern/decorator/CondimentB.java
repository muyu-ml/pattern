package lcl.mm.pattern.decorator;

public class CondimentB extends Beverage {
    Beverage beverage;
    public CondimentB(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDesc(){
        return beverage.getDesc() + ",加调味料CondimentB";
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }
}
