package com.academy.lessons5;

public class DateTime extends Date {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year,hour);
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

}
