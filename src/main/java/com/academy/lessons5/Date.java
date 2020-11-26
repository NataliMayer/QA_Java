package com.academy.lessons5;

import com.academy.lessons8.WrongMonthException;

public class Date {
    public int length;
    protected int day;
    protected int month;
    protected int year;


    public Date(int day, int month, int year) throws Exception { // проверка ексепшина
        this.day = day;
        if (month>12)
            throw new WrongMonthException(month);
        this.month = month;
        this.year = year;


    }

    public Date(int day, int month, int year, int hour) {
    }


    public int getDay() {
        return day;
    }

    public void setDay() {
        this.day = day;
    }

    public void setMonth(int i) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }



    @Override
    public String toString() {

        return String.format("%02d.%02d.%d", day, month, year);
    }
}
