package lcl.mm.pattern.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class K8sDemoApi {
    @RequestMapping("test")
    public String test1(){
        return " test1 version 1.0 OK ~" ;
    }
}
