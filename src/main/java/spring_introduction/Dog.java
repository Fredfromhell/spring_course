package spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {

//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
    public void init() {
        System.out.println("init method dog");
    }
//    @PreDestroy
    public void destroy () {
        System.out.println("destroy method dog");
    }
}
