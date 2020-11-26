package com.academy.lessons6;

public class DateFormatDemo {
    public static void main(String[] args) throws Exception {
        com.academy.lessons5.Date date = new com.academy.lessons5.Date(24,01,2011);
        System.out.println(date);
        DateFormat dateFormat = new DateFormat();
        dateFormat.getDay();
        dateFormat.getMonth();
        dateFormat.getYear();
        /*date.print();
        date.print(DateFormat.CUSTOM)
        TimeZones timeZones = TimeZones.RU;

        TimeZones timeZones1 = TimeZones.USA;
        System.out.println(date);*/




    }

}
