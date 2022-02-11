package org;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);

        IAlgorism IAlgorismSHA256 = context1.getBean("SHA256", IAlgorism.class);
        IAlgorismSHA256.coder();

        IAlgorism IAlgorismEthash = context1.getBean("Ethash", IAlgorism.class);
        IAlgorismEthash.coder();

        Message message = context1.getBean("Message", Message.class);
        message.print();


    }
}
