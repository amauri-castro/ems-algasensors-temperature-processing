package com.amauri.algasensors.temperature.processing;

import com.amauri.algasensors.temperature.processing.common.IdGenerator;
import com.amauri.algasensors.temperature.processing.common.UUIDV7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UUIDv7Test {

    @Test
    void shouldGeneratedUUIDv7() {
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidDateTime = UUIDV7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);

    }
}
