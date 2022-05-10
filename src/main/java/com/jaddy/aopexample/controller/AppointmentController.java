package com.jaddy.aopexample.controller;

import com.jaddy.aopexample.domain.Client;
import com.jaddy.aopexample.services.AppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @Autowired
    private AppointmentServices appointmentServices;


    @PostMapping("/client")
    public ResponseEntity<Client> createClient(Client client){
        Client client1 = new Client();
        client1.setClientId(client.getClientId());
        client1.setClientType(client.getClientType());
        client1.setDateCreated(client.getDateCreated());
        client1.setDateUpdated(client1.getDateUpdated());
        return new ResponseEntity<Client>(client1, HttpStatus.ACCEPTED);
    }

}
