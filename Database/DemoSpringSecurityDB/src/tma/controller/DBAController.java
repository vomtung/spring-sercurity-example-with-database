package tma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/dba**")
public class DBAController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String welcome(ModelMap modelMap) {
		modelMap.addAttribute("message", "This is protected page - DBA Page!");
		return "dba";
	}

}