package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AfricaTime implements ZoneConverter {
    @Override
    public ZonedDateTime convertToZone(ZonedDateTime input) {
        return input.withZoneSameInstant(ZoneId.of("Africa/Nairobi"));
    }
}
