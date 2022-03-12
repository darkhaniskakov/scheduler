package darkhan.camel.scheduler.client;

import darkhan.camel.scheduler.resource.response.HelloResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "helloClient", url = "http://localhost:8080")
public interface HelloClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    HelloResponse hello();

}
