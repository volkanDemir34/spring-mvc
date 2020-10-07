package com.volkan.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/*Service Endpoint Interface*/

@WebService
@SOAPBinding(style = Style.RPC)
public interface MessageWriter {
	
	@WebMethod
	public String getWelcomeMessage(@WebParam(name = "name") String name, 
					@WebParam(name = "surname") String surname);

}
