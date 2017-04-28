package com.example;


import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bhawani.singh
 */
@RestController
public class HelloRestController {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(HelloRestController.class.getName());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
    public String hello(){
        return ("Hello...... Spring Boot delpoyed on Wildfly");
    }

}
