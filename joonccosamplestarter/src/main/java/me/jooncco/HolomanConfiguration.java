package me.jooncco;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {

    // application 프로젝트에 Bean이 정의되어있지 않다면,
    // application 프로젝트의 properties만 이용해서 Bean을 정의해줌.
    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HolomanProperties props) {
        Holoman holoman = new Holoman();
        holoman.setName(props.getName());
        holoman.setHowLong(props.getHowLong());
        return holoman;
    }
}
