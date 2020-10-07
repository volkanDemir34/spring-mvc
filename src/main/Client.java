package main;

import java.net.MalformedURLException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


public class Client {
	
		
	   private static RestTemplate restTemplate = new RestTemplate();
	   
	
	

	public static void main(String[] args) throws MalformedURLException {
		String url="http://ikmvdtg.tcmb.gov.tr:8080/BFRMHAT/kullaniciBilgileriAl";
			

		try {
	         restTemplate.getForEntity(url, String.class);
	    } catch (RestClientResponseException e) {
	    	System.out.println(e.getRawStatusCode());
	    	System.out.println(e.getResponseBodyAsString());
	        System.out.println( ResponseEntity
	            .status(e.getRawStatusCode())
	            .body(e.getResponseBodyAsString()));
	    }
	}

}
