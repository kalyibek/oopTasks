package org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Message")
public class Message implements Printer {
    String message;

    @Override
    public void print() {
        System.out.println(message);
    }

    @Value("Some new message")
    public void setMessage(String message) {
        this.message = message;
    }
}
