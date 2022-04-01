package ru.kubgu.techsupport.activity;

public class Request {
    private String requestField;

    public Request(String requestField) {
        this.requestField = requestField;
    }

    public String getText() {
        return requestField;
    }
}
