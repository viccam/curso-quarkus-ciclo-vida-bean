package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BeanHello {

    public String hello() {

        System.out.print("inicio++++++++++++++++++");

        return "hello ++++++++++++++++++++++++++++++++++++++++";
    }

    public String bye() {

        System.out.print("fin");
        return "bye bye ******************************************";
    }

}