package com.volkan.ws;

import javax.jws.WebService;

@WebService(endpointInterface="com.volkan.ws.MessageWriter")
public class MessageWriterImpl implements MessageWriter {

	@Override
	public String getWelcomeMessage(String name, String surname) {
		return "Welcome , " + name + " " + surname + ". This message is sent by MessageWriterImpl#getWelcomeMessage.";
	}

}
