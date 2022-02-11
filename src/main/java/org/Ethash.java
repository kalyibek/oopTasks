package org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Ethash")
public class Ethash implements IAlgorism {
    String code;

    @Override
    public void print() {
        System.out.println("Ethash");
    }

    @Value("Java Code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void coder() {
        System.out.println(this.code + " coded with Ethash");
    }
}
