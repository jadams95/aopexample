package com.jaddy.aopexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {
    private Long clientId;
    private String firstName;
    private String lastName;
    private String clientType;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
