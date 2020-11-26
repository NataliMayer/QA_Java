package com.academy.lessons4;

public class Abonent {

        private String firstName ;
        private String lastName;
        private int age;
        private char gender;
        private int id;

    public Abonent(String maleName) {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Abonent() {

    }

    public void book(String firstName, String lastName, int age, char gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;

    }
    public String getFirstName(){
            return firstName;
    }
    public void setFirstName(String firstName){
            this.firstName = firstName;
    }
    public String getLastName(){
            return lastName;
    }
    public void setLastName(String lastName){
            this.lastName = lastName;
    }
    public Integer getAge(){
            return age;
    }

    public void setAge(Integer age){
            this.age = age;
    }
    public char getGender(){
            return gender;
    }
    public void setGender(Character gender){

            this.gender = gender;
    }
    public void print (){

        return ;

    }
    @Override
    public String toString() {
        return firstName + ":" + gender + ":" + age;
    }


    public void setGender(Gender male) {
    }
}