import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    static void main() {
        /*
            Data-hora local:
                - LocalDate
                - LocalDateTime

            Data-hora global:
                - Instant

            Duração:
                - Duration

            Outros:
                - Zoneld
                - ChronoUnit
        */

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();


        LocalDate d04 = LocalDate.parse("2026-04-01");
        LocalDateTime d05 = LocalDateTime.parse("2026-04-01T01:30:26");
        Instant d06 = Instant.parse("2026-04-01T01:30:26Z");


        Instant d07 = Instant.parse("2026-04-01T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("01/04/2026", formatter1);
        LocalDateTime d09 = LocalDateTime.parse("02/07/2026 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2026, 7, 25);
        LocalDateTime d11 = LocalDateTime.of(2026, 7, 25, 1, 30);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatter6 = DateTimeFormatter.ISO_INSTANT;

        System.out.printf("d01 = %s%n", d01);
        System.out.printf("d02 = %s%n", d02);
        System.out.printf("d03 = %s%n", d03);
        System.out.printf("d04 = %s%n", d04);
        System.out.printf("d05 = %s%n", d05);
        System.out.printf("d06 = %s%n", d06);
        System.out.printf("d07 = %s%n", d07);
        System.out.printf("d08 = %s%n", d08);
        System.out.printf("d09 = %s%n", d09);
        System.out.printf("d10 = %s%n", d10);
        System.out.printf("d11 = %s%n", d11);

        System.out.println();

        System.out.printf("d04 + format = %s%n", d04.format(formatter2));
        System.out.printf("format + d04 = %s%n", formatter2.format(d04));
        System.out.printf("d05 + format = %s%n", d05.format(formatter3));
        System.out.printf("d05 + ISO = %s%n", d05.format(formatter5));
        System.out.printf("d06 + format = %s%n", formatter4.format(d06));
        System.out.printf("d06 + ISO = %s%n", formatter6.format(d06));

        System.out.println();

        // d06 - horario de londres
        LocalDate resultado1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.printf("resultado1 = %s%n", resultado1);
        System.out.printf("resultado2 / Portugal = %s%n", resultado2);
        System.out.printf("resultado3 = %s%n", resultado3);
        System.out.printf("resultado4 / Portugal = %s%n", resultado4);

        System.out.println();

        System.out.printf("d04 dia = %s%n", d04.getDayOfMonth());
        System.out.printf("d04 mes = %s%n", d04.getMonthValue());
        System.out.printf("d04 ano = %s%n", d04.getYear());
        System.out.printf("d05 hora = %s%n", d05.getHour());
        System.out.printf("d05 minuto = %s%n", d05.getMinute());

        System.out.println();

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        Instant pastWeekInstant= d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.printf("d04 menos 1 semana = %s%n", pastWeekLocalDate);
        System.out.printf("d04 mais 1 semana = %s%n", nextWeekLocalDate);
        System.out.printf("d05 menos 1 semana = %s%n", pastWeekLocalDateTime);
        System.out.printf("d05 mais 1 semana = %s%n", nextWeekLocalDateTime);
        System.out.printf("d06 menos 1 semana = %s%n", pastWeekInstant);
        System.out.printf("d06 mais 1 semana = %s%n", nextWeekInstant);

        System.out.println();

        Duration tempo1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration tempo2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration tempo3 = Duration.between(pastWeekInstant, d06);

        System.out.printf("tempo1 dias = %s%n", tempo1.toDays());
        System.out.printf("tempo2 dias = %s%n", tempo2.toDays());
        System.out.printf("tempo3 dias = %s%n", tempo3.toDays());
    }
}
