package net.adamsmolnik.model.dataimport;

import net.adamsmolnik.model.ServiceMessage;

/**
 * @author ASmolnik
 *
 */
public class ImportResponse extends ServiceMessage {

    public String version;

    public ImportResponse() {

    }

    public ImportResponse(String version) {
        this.version = version;
    }

}
