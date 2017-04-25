package com.example;

import com.example.FlightService;
import com.example.PassengerService;
import com.example.TicketService;
import com.example.TotalService;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/flights")
public class FlightsController {

    @GetMapping("/flight")
    public FlightService getFlight() {

        PassengerService passenger = new PassengerService();
        passenger.setFirstName("Bittu");
        passenger.setLastName("Joju");

        TicketService ticket = new TicketService();
        ticket.setPrice(200);
        ticket.setPassenger(passenger);

        FlightService flight = new FlightService();

        Date date = new Date();


        flight.setDeparts(date);
        flight.setTicket(Arrays.asList(ticket));


        return flight;
    }

    @GetMapping("")
    public List<FlightService> getFlights() {

        PassengerService passenger = new PassengerService();
        TicketService ticket = new TicketService();
        Date date = new Date();

        passenger.setFirstName("Sai");

        ticket.setPrice(200);
        ticket.setPassenger(passenger);

        FlightService flight = new FlightService();

        flight.setDeparts(date);
        flight.setTicket(Arrays.asList(ticket));

        PassengerService passenger2 = new PassengerService();
        TicketService ticket2 = new TicketService();

        passenger2.setFirstName("Siva");


        ticket2.setPrice(100);
        ticket2.setPassenger(passenger2);

        FlightService flight2 = new FlightService();

        flight2.setDeparts(date);
        flight2.setTicket(Arrays.asList(ticket2));


        return Arrays.asList(flight,flight2);
    }

    @PostMapping(value = "/tickets/total")
    public TotalService computeTicketsTotal(@RequestBody FlightService input){
        TotalService total = new TotalService();
        double sum = 0;
        for (int i=0;i<input.getTickets().size();i++){
            sum = sum + input.getTickets().get(i).getPrice();
        }
        total.setResult(sum);
        return total;
    }
}
