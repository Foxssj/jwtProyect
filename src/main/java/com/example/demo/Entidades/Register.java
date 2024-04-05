package com.example.demo.Entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Register {
	String username;
	String password;
	String fistname;
	String lastname;
	String country;
	
	
	
}
