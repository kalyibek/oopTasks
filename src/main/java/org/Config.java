package org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public SHA256 SHA256() {
        return new SHA256();
    }

    @Bean
    public Ethash Ethash() {
        return new Ethash();
    }

    @Bean
    public Message Message() {
        return new Message();
    }
}
