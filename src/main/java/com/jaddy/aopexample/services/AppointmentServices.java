package com.jaddy.aopexample.services;

import com.jaddy.aopexample.domain.Client;
import com.jaddy.aopexample.repo.AppointmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Slf4j
public class AppointmentServices implements AppointmentRepo {
    private static Map<Long, Client> clientMap = new HashMap<>();

    public Client getClient(long id){
        if(null != clientMap.get(id)){
            return clientMap.get(id);
        }
        Client client = new Client(Long.valueOf(id), "John", "Adams", "Member",LocalDateTime.now(), LocalDateTime.now());
        clientMap.put(id, client);
        return client;
    }
}
