package com.gov.usa.ssn.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gov.usa.ssn.model.SsnProviderModel;
import com.gov.usa.ssn.service.SsnProviderService;

@Controller
public class SsnController {

	@Autowired
	private SsnProviderService ssnService;

	@RequestMapping("/")
	public String showForm(SsnProviderModel udata, Model model) {
		System.out.println("SsnController.showForm()");
		model.addAttribute("userdata", udata);
		return "register";

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("userdata") SsnProviderModel udata, Model model) {
		System.out.println("SsnController.registerUser()");
		String result = null;
		System.out.println(udata);
		result = ssnService.saveSsnNo(udata);
		if (result != null)
			model.addAttribute("result1", "registeratiopn done");
		else
			model.addAttribute("result2", "registeratiopn fail");
		return "register";

	}
}
