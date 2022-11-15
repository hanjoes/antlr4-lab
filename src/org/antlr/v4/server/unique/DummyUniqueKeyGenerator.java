package org.antlr.v4.server.unique;

import java.util.Optional;
import java.util.UUID;

public class DummyUniqueKeyGenerator implements UniqueKeyGenerator {
    @Override
    public Optional<String> generateKey(byte[] buffer) {
        return Optional.of(UUID.randomUUID().toString());
    }
}
