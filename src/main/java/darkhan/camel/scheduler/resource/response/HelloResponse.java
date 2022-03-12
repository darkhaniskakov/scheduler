package darkhan.camel.scheduler.resource.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloResponse {
    private String message;
    private ZonedDateTime time;
}
