package com.odamede.javanotes.springbeanrequestscope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS) //@org.springframework.web.context.annotation.RequestScope
public class ScopeTestBean {

    public ScopeTestBean() {
        System.out.println("Request Scope Bean Created");
    }

    private int exampleValue = 0;

    public int getExampleValue() {
        return this.exampleValue++;
    }


}
