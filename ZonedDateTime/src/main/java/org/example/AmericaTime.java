package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AmericaTime implements ZoneConverter{
    @Override
    public ZonedDateTime convertToZone(ZonedDateTime input) {
        return input.withZoneSameInstant(ZoneId.of("America/New_York"));
    }
}
