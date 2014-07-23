package net.adamsmolnik.model.dataimport;

import net.adamsmolnik.model.ServiceMessage;

/**
 * @author ASmolnik
 *
 */
public class ImportRequest extends ServiceMessage {

    public String srcObjectKey;

    public String destObjectKey;

    public ImportRequest() {

    }

    public ImportRequest(String srcObjectKey, String destObjectKey) {
        this.srcObjectKey = srcObjectKey;
        this.destObjectKey = destObjectKey;
    }

}
