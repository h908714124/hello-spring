package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {

    @Bean
    public Bohn1 getBohn() {
        return () -> "hi";
    }
}
