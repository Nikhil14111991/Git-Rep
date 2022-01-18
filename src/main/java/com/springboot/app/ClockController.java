package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.app.ClockService;

@RestController
public class ClockController {
	@Autowired
	public ClockService clockservice;
	
	@GetMapping("/clock/{time}")
	public String getTime(@PathVariable String time) {
		String result = null;
		try{
		    int hr = Integer.parseInt(time.substring(0,2));
		    int mnt= Integer.parseInt(time.substring(3));
					
	        try {
	            result = clockservice.ClockConverter(hr, mnt);
	        }
	        catch(Exception e){
	    	    return e.getMessage();
	        }
	        result = result + "\n";
	        if(hr == 12 && mnt == 0)
	        result = result + "It's Midday";
	    
	        if(hr == 0 && mnt == 0)
	    	    result = result + "It's Midnight";   
		
	    	return result;
	    }
	    catch(Exception e) {
	    	return "Enter valid time";
		
	    }
	}

}
