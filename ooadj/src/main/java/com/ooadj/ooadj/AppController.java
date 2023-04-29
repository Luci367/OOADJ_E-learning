package com.ooadj.ooadj;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@org.springframework.beans.factory.annotation.Autowired(required=true)
	private LearnerService service;
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<learner> listLearner = service.listAll();
		model.addAttribute("listLearner", listLearner);
		return "index";
	}
	@RequestMapping("/cert_gen/{id}")
	public ModelAndView showCertPage(@PathVariable(name = "id") Long id) {
	    ModelAndView mav = new ModelAndView("cert_gen");
	    learner learner = service.get(id);
	    mav.addObject("learner", learner);
	    return mav;
	}
}





