package diagcollector.diagutil.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiscoveryRequest {
    private String text;
}