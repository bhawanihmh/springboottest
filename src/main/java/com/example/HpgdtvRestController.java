package com.example;

//import javax.enterprise.inject.Any;
//import javax.inject.Inject;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author bhawani
 */
// @Path("/hpgdtv")

@RestController
@RequestMapping("/hpgdtv")
public class HpgdtvRestController {

	/*
	 * @Inject
	 * 
	 * @Any private LoggingFraction fraction;
	 */

	HpgdtvRestController() {
		System.out.println("@@@@@@@@@@@@@@@@@   HpgDtvController.HpgDtvController()");
	}

	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(HpgdtvRestController.class.getName());
	/*
	 * @GET
	 * 
	 * @Consumes({"application/xml", "application/json"}) public Response
	 * getDtvList() { System.out.println( "Hello World!" ); String str =
	 * "Hello World!"; //JsonObject jsonObject = Json.createReader(new
	 * StringReader(str)).readObject(); return Response.ok(str).build(); }
	 */

	@RequestMapping(value = "/hpgdtvChannels", method = RequestMethod.GET)
	@ResponseBody
	public String getHpgdtvChannels() {
		// log
		LOG.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   getHpgdtvChannels");
		return " getHpgdtvChannels Hello Bhawani required dtvChannels ????";
	}

	@RequestMapping(value = "/satendar", method = RequestMethod.GET)
	@ResponseBody
	public String getList() {
		// log
		LOG.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   getList");

		return " getList Hello Bhawani required dtvChannels ????";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("hello").addObject("name", "Bhawani");
	}

}
