package Lesson5;
/*
import Pages.BasePage;
import com.codeborne.selenide.Selenide;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Slf4j
public class NewYearTime {

    @Test
    public static void newYearTime() {

        //переменные для хранения даты и времени
        LocalDate today = null;
        LocalDate toNewYear = null;

        //шаблоны формата даты
        Locale locale = new Locale("ru");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM yyyy года, EEEE", locale);

        //данные которые мы получаем из сайта
        String dateToday = null;
        String dateToNewYear = null;

        Selenide.open(NewYearTimePage.URLToday);
        BasePage.longDelay();

        //сохраняем дату today
        dateToday = NewYearTimePage.today.getText();
        //сохраняем дату toNewYear
        dateToNewYear = NewYearTimePage.toNewYear.getText();

        //парсим строку даты в сущность даты
        today = LocalDate.parse(dateToday, dtf1);
        log.info("Parsed date " + today);

        //выводим дату dateToday и toNewYear
        log.info("dateToday " + dateToday + ", dateToNewYear " + dateToNewYear);
        log.info(dateToNewYear.replaceAll("[^0-9?!\\.]",""));
    }
}*/

