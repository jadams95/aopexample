package com.jaddy.aopexample;

import com.jaddy.aopexample.domain.Client;
import com.jaddy.aopexample.repo.AppointmentRepo;
import com.jaddy.aopexample.services.AppointmentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class AopexampleApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		AppointmentRepo appointmentRepo = (AppointmentRepo) context.getBean("appointmentRepo");

		System.out.println(appointmentRepo.getClient(1));
		context.close();
	}

}
