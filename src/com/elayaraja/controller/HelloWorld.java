/**
 * 
 */
package com.elayaraja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ElayarajaDhanapal
 *
 */
@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		String message = "<br><div style='text-align:center;'"
				+ "<h3>Hello World</h3>";
		
		return new ModelAndView("welcome", "message", message);
		
	}
	
}
