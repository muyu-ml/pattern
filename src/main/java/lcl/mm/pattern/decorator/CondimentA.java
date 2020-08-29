package lcl.mm.pattern.decorator;

public class CondimentA extends Beverage {
    Beverage beverage;
    public CondimentA(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDesc(){
        return beverage.getDesc() + ",加调味料CondimentA";
    }

    @Override
    public int cost() {
        return 2 + beverage.cost();
    }
}
