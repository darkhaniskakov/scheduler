package darkhan.camel.scheduler.service;

import darkhan.camel.scheduler.client.HelloClient;
import darkhan.camel.scheduler.resource.response.HelloResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class HelloClientService {

    private final HelloClient helloClient;

    public HelloResponse hello() {
        return helloClient.hello();
    }

}
