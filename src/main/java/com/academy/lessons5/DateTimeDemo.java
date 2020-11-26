package com.academy.lessons5;

public class DateTimeDemo {
    public static void main(String[] args) throws Exception {
        Date date = new Date(18, 8, 2020);
        System.out.println(date);
        System.out.println();




        Date date1 = new Date(1, 8, 2020);
        Date date2 = new Date( 11, 12, 1020);
        Date date3 = new Date( 21, 4, 2000);
        Date[] dateArr = {date1, date2, date3};

        for (int i = 0; i < dateArr.length; i++) {
            System.out.println(dateArr[i]);
        }

        Date[] dates = new Date[3];
        dates[0] = new Date(23, 3, 1990);
        dates[1] = new Date( 24, 3, 2000);
        dates[2] = new Date(3, 13, 1992);

        for (int i = 0; i < date.length; i++) {
            System.out.println(dates[i]);

        }
    }

}