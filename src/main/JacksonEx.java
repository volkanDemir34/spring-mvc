package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonEx {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Car car = new Car();
		car.setBrandwS("car");
		car.setDoorswS(2);

		objectMapper.writeValue(
		    new FileOutputStream("volkan.json"), car);
		/*Car car =objectMapper.readValue(new File("volkan.json"), Car.class);
		System.out.println(objectMapper.writeValueAsString(car));*/

	}

}

class Car {
    private String brand = null;
    private int doors = 0;

    public String getBrandwS() { return this.brand; }
    public void   setBrandwS(String brand){ this.brand = brand;}

    public int  getDoorswS() { return this.doors; }
    public void setDoorswS (int doors) { this.doors = doors; }
}