package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EuropeTime implements ZoneConverter{
    @Override
    public ZonedDateTime convertToZone(ZonedDateTime input) {
        return input.withZoneSameInstant(ZoneId.of("Europe/Paris"));

    }
}
