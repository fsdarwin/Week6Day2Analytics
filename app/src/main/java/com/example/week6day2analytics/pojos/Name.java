package com.example.week6day2analytics.pojos;

public class Name {
    private String first;
    private String middle;
    private String last;
    private String prefix;

    public Name() {
    }

    public Name(String first, String middle, String last, String prefix) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.prefix = prefix;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
