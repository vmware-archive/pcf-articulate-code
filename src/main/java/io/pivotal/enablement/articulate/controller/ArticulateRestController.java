package io.pivotal.enablement.articulate.controller;

import io.pivotal.enablement.articulate.service.EnvironmentHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author mborges
 *
 */
@RestController
public class ArticulateRestController {

	@Autowired
	private EnvironmentHelper environmentHelper;

	@SuppressWarnings("unchecked")
	@RequestMapping("/bluegreen-check")
	public String bluegreenRequest() throws Exception {
		return (String) environmentHelper.getVcapApplicationMap().
				getOrDefault("application_name", "no name environment variable");
	}
	
    @RequestMapping("/hello")
    public String hello() {
      return  "Hello! This is yjiang test";
    }

}
