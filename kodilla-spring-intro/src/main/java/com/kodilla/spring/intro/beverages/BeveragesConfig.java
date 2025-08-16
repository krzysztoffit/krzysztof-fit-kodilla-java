package com.kodilla.spring.intro.beverages;

import com.kodilla.spring.intro.beverages.tastes.Sweet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeveragesConfig {

    @Bean
    public CocaCola cocaColaMaking() {
        return new CocaCola(sweetMaking());
    }

    @Bean(name = "sweet1")
    public Sweet sweetMaking() {
        return new Sweet();
    }

    @Bean(name = "sweet2")
    public Sweet sweetMaking2() {
        return new Sweet();
    }
}
