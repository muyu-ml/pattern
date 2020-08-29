package lcl.mm.pattern.decorator;

public abstract class Beverage {
    String desc = "Unknow Beverge";
    public String getDesc(){
        return desc;
    }

    public abstract int cost();
}
