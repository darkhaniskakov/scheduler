package darkhan.camel.scheduler.resource;

import darkhan.camel.scheduler.resource.response.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> getHello() {
        return ResponseEntity.ok(new HelloResponse("hello message", ZonedDateTime.now()));
    }

}
