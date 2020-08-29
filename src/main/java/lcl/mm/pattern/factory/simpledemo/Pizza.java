package lcl.mm.pattern.factory.simpledemo;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList topping = new ArrayList();

    public void prepare(){
        log.info("准备pizza");
        log.info("揉面");
        log.info("加酱");
        log.info("添加调料");
    }

    public void bake(){
        log.info("烤pizza");
    }

    public void cut(){
        log.info("切pizza");
    }

    public void box(){
        log.info("打包pizza");
    }


}
