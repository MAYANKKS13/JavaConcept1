package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class App
{
    public static void main(String[] args) {

        ZonedDateTime asiaKolkataTime = ZonedDateTime.of(
                2000, 1, 1, 13, 0, 0, 0, ZoneId.of("Asia/Kolkata"));

        System.out.println("Options:");
        System.out.println("1. Equivalent Time in Europe Zone");
        System.out.println("2. Equivalent Time in America Zone");
        System.out.println("3. Equivalent Time in Africa Zone");

        int option = 1;

        ZoneConverter converter = null;
        String zoneName = "";

        switch(option) {
            case 1:
                converter = new EuropeTime();
                zoneName = "Europe";
                break;
            case 2:
                converter = new AmericaTime();
                zoneName = "America";
                break;
            case 3:
                converter = new AfricaTime();
                zoneName = "Africa";
                break;
            default:
                System.out.println("Invalid option.");
                return;
        }

        ZonedDateTime convertedTime = converter.convertToZone(asiaKolkataTime);

        System.out.println("Converted " + zoneName + " Time:");
        System.out.println(formatZonedDateTime(convertedTime));
    }

    private static String formatZonedDateTime(ZonedDateTime zonedDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return formatter.format(zonedDateTime);
    }
}
