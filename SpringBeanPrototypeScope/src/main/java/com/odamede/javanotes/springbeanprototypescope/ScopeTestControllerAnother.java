package com.odamede.javanotes.springbeanprototypescope;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping(value = "/v1/prototype-scope-test-another")
@RestController
public class ScopeTestControllerAnother {

    private final ScopeTestBean scopeTestBean;

    public ScopeTestControllerAnother(ScopeTestBean scopeTestBean) {
        this.scopeTestBean = scopeTestBean;
    }

    @GetMapping(value = "/default")
    public ResponseEntity<Integer> beanVariableDon(){
        return ResponseEntity.of(Optional.of(scopeTestBean.getExampleValue()));
    }

}
