package me.jooncco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication  // 아래 세개와 동일.
@SpringBootConfiguration
@ComponentScan                      // #1
@EnableAutoConfiguration            // (Optional)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args); // 가변 인자는 주로 뒤에.

        /* Customizing 하기 */
//        SpringApplication app= new SpringApplication(Application.class);
//        app.run(args);

        /* 비 web application */
//        SpringApplication app = new SpringApplication(Application.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);
    }

//    @Bean
//    @ConditionalOnMissingBean  // Autoconfiguration 후에도 해당 Bean이 없을 때만.
//    public Holoman holoman() {
//        Holoman holoman= new Holoman();
//        holoman.setName("junha");
//        holoman.setHowLong(60);
//        return holoman;
//    }
}