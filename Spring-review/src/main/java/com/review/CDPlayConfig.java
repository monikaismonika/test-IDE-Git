package com.review;

import com.review.PC.lenovo;
import com.review.cd.gameCd;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource()
public class CDPlayConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public lenovo lenovo(){
        return new lenovo(gameCD());
    }

    @Bean
    public gameCd gameCD(){
        return new gameCd();
    }
}
