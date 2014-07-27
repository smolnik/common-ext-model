package net.adamsmolnik.model.extraction;

import java.util.List;
import net.adamsmolnik.model.ServiceMessage;

/**
 * @author ASmolnik
 *
 */
public class ExtractionResponse extends ServiceMessage {

    public List<String> objectKeys;

    public ExtractionStatus status;

    public ExtractionResponse() {

    }

    public ExtractionResponse(ExtractionStatus status, List<String> objectKeys) {
        this.status = status;
        this.objectKeys = objectKeys;
    }

    @Override
    public String toString() {
        return "ExtractionResponse [objectKeys=" + objectKeys + ", status=" + status + "]";
    }

}
