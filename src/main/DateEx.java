package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;


public class DateEx {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
	try {
		br = Files.newBufferedReader(Paths.get("volkan.txt"));
		String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
	}
	catch(Exception e){
		
	}finally {
		System.out.println(sb);
		

     	}
	

	}
}

class Volkan {
	private Date volkan;

	/**
	 * @return the volkan
	 */

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone=JsonFormat.DEFAULT_TIMEZONE)
	public Date getVolkan() {
		return volkan;
	}

	/**
	 * @param volkan the volkan to set
	 */
	public void setVolkan(Date volkan) {
		this.volkan = volkan;
	}

}
