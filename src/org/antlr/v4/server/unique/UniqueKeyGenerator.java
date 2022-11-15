package org.antlr.v4.server.unique;

import java.util.Optional;

public interface UniqueKeyGenerator {
    /**
     * Takes a buffer of content and generate a unique key.
     * @param buffer byte buffer
     * @return unique key
     */
    Optional<String> generateKey(byte[] buffer);
}
