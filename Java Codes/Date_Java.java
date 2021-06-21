import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Month;

class Date_Java
{
    public static void main(String[] args)
    {
        LocalDate d = LocalDate.of(2019, Month.JANUARY,1);
        LocalDate e =LocalDate.of(2019,Month.DECEMBER,31);
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("d.M.yyyy");

        for (LocalDate date = d; date.isBefore(e); date = date.plusDays(1))
             if(date.getDayOfWeek().equals(DayOfWeek.SATURDAY) || date.getDayOfWeek().equals(DayOfWeek.SUNDAY))
                 System.out.println(date.format(newPattern));

    }
}

------------------------------------------------------------------
