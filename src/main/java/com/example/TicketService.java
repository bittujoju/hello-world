package com.example;

/**
 * Created by trainer11 on 4/15/17.
 */

import com.example.PassengerService;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonPropertyOrder({"passenger","price"})
public class TicketService{

    private PassengerService passenger;

    private double price;

    @JsonGetter("Passenger")
    public PassengerService getPassenger() {
        return passenger;
    }

    public void setPassenger(PassengerService passenger) {
        this.passenger = passenger;
    }

    @JsonProperty("Price")
    public double getPrice() {
        return price;
    }

    @JsonSetter("price")
    public void setPrice(double price) {
        this.price = price;
    }
}