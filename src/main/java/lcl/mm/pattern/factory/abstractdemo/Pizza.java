package lcl.mm.pattern.factory.abstractdemo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public String[] veggies;
    public String cheese;
    public String pepperoni;
    public String clam;
    //public ArrayList topping = new ArrayList();

    public abstract void prepare();

    public void bake(){
        log.info("烤pizza");
    }

    public void cut(){
        log.info("切pizza");
    }

    public void box(){
        log.info("打包pizza");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
