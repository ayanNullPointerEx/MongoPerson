package com.example.MongoPerson.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document
public class Address {
    List<String> line;
    String pin;
    String state;

    public Address() {}

    public Address(List<String> line, String pin, String state) {
        this.line = line;
        this.pin = pin;
        this.state = state;
    }

    public List<String> getLine() {
        return line;
    }

    public void setLine(List<String> line) {
        this.line = line;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "line=" + line +
                ", pin='" + pin + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
