package main;

import javax.xml.ws.Endpoint;

import com.volkan.ws.MessageWriterImpl;

public class WebServicePublisher {

	private static String WEB_SERVICE_URL = "http://localhost:8882/volkan";

	public static void main(String[] args) {
		Endpoint.publish(WEB_SERVICE_URL, new MessageWriterImpl());
		System.out.println("Web Service is started.");
	}

}
