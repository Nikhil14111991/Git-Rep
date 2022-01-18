package com.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class ClockService extends RuntimeException {
	
	public String ClockConverter(int hr, int mnt) throws Exception{
		
		if(hr > 23) {
			throw new Exception("Hours cannot be more that 23");
		}
		
		if(hr < 0 ) {
			throw new Exception("Hours cannot be less than 0");
		}
		
		if(mnt > 59) {
			throw new Exception("Minutes cannot be more that 59");
		}
		
		if(mnt < 0) {
			throw new Exception("Minutes cannot be less than 0");
		}
		
        String[] clock = {"zero","one","two", "three", "four","five", "six", "seven", "eight", "nine","ten", 
        		          "eleven", "twelve", "thirteen","fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen", "twenty", 
        		          "twenty on","twenty two", "twenty three", "twenty four","twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty",
                          "thirty one", "thirty two", "thirty three", "thirty four", "thirty five", "thirty six", "thirty seven","thirty eight", "thirty nine", "forth",
                          "forty one", "forty two", "forty three", "forty four", "forty five", "forty six", "forty seven", "forty eight", "forty nine", "fifty",
                          "fifty one", "fifty two", "fifty three", "fifty four", "fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine", "sixty",
                          "sixty one", "sixty two", "sixty three", "sixty four","sixty five", "sixty six", "sixty seven", "sixty eight", "sixty nine"
                          };
		
		return "It's " +clock[hr]+" "+clock[mnt];
		
	}
	
}
