package nyc.pikaboy.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("nyc.pikaboy.springdemo")
@PropertySource("sports.properties")

public class AnnotatedConfigurationClass {



}
