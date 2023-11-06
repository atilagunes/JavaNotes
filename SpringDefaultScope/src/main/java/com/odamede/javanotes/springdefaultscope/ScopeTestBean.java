package com.odamede.javanotes.springdefaultscope;

import org.springframework.stereotype.Component;

@Component
// @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)  or @Scope("singleton") or nothing
public class ScopeTestBean {

    public ScopeTestBean() {
        System.out.println("Singleton scope test bean initialized");
    }

    private int exampleValue = 0;

    public int getExampleValue() {
        return this.exampleValue++;
    }
}
