package bd.com.ronnie.springbootrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableBinding(Source.class)
public class SpringbootrabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootrabbitmqApplication.class, args);
    }

}
