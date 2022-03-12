package darkhan.camel.scheduler.route;

import darkhan.camel.scheduler.service.HelloClientService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloSchedulerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer://simpleTimer?period=1000")
                .bean(HelloClientService.class, "hello")
                .log("${body}");
    }

}
