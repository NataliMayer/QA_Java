package com.academy.lessons8;

public class WrongMonthException extends Exception{
    private int wrongMonth;
    public WrongMonthException(int wrongAge) {
        this.wrongMonth = wrongAge;
    }
    public int getWrongMonth() {
        return wrongMonth;
    }
}
