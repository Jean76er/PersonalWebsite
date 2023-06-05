package com.example.demo.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class UserService {
    public List<User> getUsers() {
		return List.of(new User(1L,
		 "Jean",
		  "jean.hello@gmail.com",
		   LocalDate.of(2003, Month.APRIL, 19),
		    21));
	}
}
