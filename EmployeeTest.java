package com.surer;

public class EmployeeTest {
//this is the employeetest codes here

    private String firstName; //instance variable
    private String lastName;
    private String title;
    private int socialSecurityNumber;
    private double salary;

    //set
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //get
    public String getFirstName() {
        return firstName;
    }

    //set
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //get
    public String getLastName() {
        return lastName;
    }

    //set
    public void setTitle(String title) {
        this.title = title;
    }

    //get
    public String getTitle() {
        return title;
    }

    //set
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //get
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //set
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //get
    public double getSalary() {
        return salary;
    }
//test of giveRaise function
    public void getGiveRaise(double giveRaise) {
        this.salary = this.salary + (this.salary * 10/100);
    }
}
//i hope you like my type of coding


