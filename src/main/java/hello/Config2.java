package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean
    public Bohn2 getBohn() {
        return () -> "lo";
    }
}
