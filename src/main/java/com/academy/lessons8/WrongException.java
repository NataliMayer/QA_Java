package com.academy.lessons8;

class WrongAgeException extends Exception {
    private int wrongAge;


    public WrongAgeException(int wrongAge) {
        this.wrongAge = wrongAge;
    }

    public int getWrongAge() {
        return wrongAge;
    }
}
