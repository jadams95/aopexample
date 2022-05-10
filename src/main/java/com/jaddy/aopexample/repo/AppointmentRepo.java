package com.jaddy.aopexample.repo;

import org.springframework.stereotype.Repository;

public interface AppointmentRepo<Client, Long>  {
    Client getClient(long id);
}
