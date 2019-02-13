package com.example.week6day2analytics.pojos;

public class Employee {
    Name name;
    Address address;
    Timesheet timesheet;

    public Employee() {
    }

    public Employee(Name name, Address address, Timesheet timesheet) {
        this.name = name;
        this.address = address;
        this.timesheet = timesheet;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Timesheet getTimesheet() {
        return timesheet;
    }

    public void setTimesheet(Timesheet timesheet) {
        this.timesheet = timesheet;
    }
}
