package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
	
	public static void main(String[] args) {
		String a[]={"33","3","4","5"};
		
		List<String> strings = Arrays.asList(a);


	 strings.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().map(e->e.getValue().stream().reduce(String::concat)).map(Optional::get).forEach(System.out::println);

	}
	

}


class Sa{
	
	private String ad;
	
	Sa(String ad){
		this.setAd(ad);
	}

	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}

	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
}