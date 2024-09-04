package com.ordm.serv;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
	RestTemplate rt=new RestTemplate();
	private static final String list_url="http://localhost:8080/list";
	
	public ResponseEntity<String> listall()
	{
		HttpHeaders h=new HttpHeaders();
		h.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String>entity=new HttpEntity<String>("parameters",h);
		
		ResponseEntity<String> response=rt.exchange(list_url, HttpMethod.GET,entity,String.class);
		return response;
	}
}
