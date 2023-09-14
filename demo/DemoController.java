package com.example.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/middle/teste")
	public String teste() {
		String result = "Metodo de teste";
		System.out.println(result);
		
		final String endereco = "http://localhost:8081/treinamento/primeiroservlet";
		
		try {
			URL url = new URL(endereco);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			int status = con.getResponseCode();
			System.out.println();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
