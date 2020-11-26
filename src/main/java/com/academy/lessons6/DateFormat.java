package com.academy.lessons6;

public class DateFormat {
    private int day;
    private int month;
    private int year;


    public enum TimeZones {
       /* RU("DD,MM,YYYY"),
        USA("MM,DD,YYYY"),
        UK("DD,MM,YYYY"),
        ENG("DD/MM/YYYY"),
        CUSTOM("DD MMMM YYYY");*/


    }

    public DateFormat() {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", day, month, year);
    }

   /* public int hasCode

    {
        return Object.hash(day,month,year);
    }*/
    }
