package com.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;
import java.util.List;

/**
 * Created by trainer11 on 4/15/17.
 */
public class FlightService {

    private Date departs;
    private List<TicketService> tickets;

    @JsonGetter("Tickets")
    public List<TicketService> getTickets() {
        return tickets;
    }

    @JsonSetter("tickets")
    public void setTicket(List<TicketService> tickets) {
        this.tickets = tickets;
    }


    @JsonGetter("Departs")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public Date getDeparts() {
        return departs;
    }

    public void setDeparts(Date departs) {
        this.departs = departs;
    }
}