package com.japaneixxx.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateFormatterTest {
    @Test
    void formatDateRemoveBars() {
        DateFormatter dateFormatter = new DateFormatter();
        String date = "07/09/2006";
        String formattedDate = dateFormatter.formatDateRemoveBars(date);
        assertEquals("07092006", formattedDate);
    }
    @Test
    void formatDateRemoveBarsWithoutBarsInput() {
        DateFormatter dateFormatter = new DateFormatter();
        String date = "07092006";
        String formattedDate = dateFormatter.formatDateRemoveBars(date);
        assertEquals("07092006", formattedDate);
    }
    @Test
    void formatDateAddBarsDMY(){
        DateFormatter dateFormatter = new DateFormatter();
        String date = "07092006";
        String formattedDate = dateFormatter.formatDateAddBarsDMY(date);
        assertEquals("07/09/2006", formattedDate);
    }
    @Test
    void formatDateAddBarsYMD(){
            DateFormatter dateFormatter = new DateFormatter();
            String date = "20060907";
            String formattedDate = dateFormatter.formatDateAddBarsYMD(date);
            assertEquals("2006/09/07", formattedDate);

    }
    @Test
    void DMYToYMD(){
        DateFormatter dateFormatter = new DateFormatter();
        String date = "07/09/2006";
        String formattedDate = dateFormatter.formatDMYToYMD(date);
        assertEquals("20060907", formattedDate);

    }
    @Test
    void YMDToDMY(){
        DateFormatter dateFormatter = new DateFormatter();
        String date = "2006/09/07";
        String formattedDate = dateFormatter.formatYMDToDMY(date);
        assertEquals("07092006", formattedDate);

    }
    void YMDToDMYAndFormat(){
        DateFormatter dateFormatter = new DateFormatter();
        String date = "2006/09/07";
        String formattedDate = dateFormatter.formatYMDToDMY(date);
        assertEquals("07/09/2006", dateFormatter.formatDateAddBarsDMY(formattedDate));

    }
}
