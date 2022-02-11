package org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SHA256")
public class SHA256 implements IAlgorism {

    String code;

    @Override
    public void print() {
        System.out.println("SHA256");
    }

    @Value("Java Code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void coder() {
        System.out.println(this.code + " coded with SHA 256");
    }
}
