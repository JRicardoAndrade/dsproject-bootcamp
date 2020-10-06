package com.ricardo.dsproject.resource;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.dsproject.entities.Client;

/* 
 *Classe que implementa a camada Rest 
 */

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		Instant birthDate = Instant.parse("1984-03-31T20:35:00Z");
		list.add(new Client(1L, "Maria", "12345678901", 4500.0, birthDate, 2));
		list.add(new Client(2L, "João", "10987654321", 1000.0, birthDate, 0));
		
		return ResponseEntity.ok().body(list);
	}

}
