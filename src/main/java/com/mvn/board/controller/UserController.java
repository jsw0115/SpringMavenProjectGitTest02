package com.mvn.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvn.board.HomeController;
import com.mvn.board.service.BoardService;
import com.mvn.board.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService usersv;

	@Autowired
	private BoardService boardsv;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// 로그인 화면
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView ModelAndView(RedirectAttributes redirect) {
		System.out.println("index() controller 들어옴");
		ModelAndView mv = new ModelAndView("user/login");
		if (redirect.addAttribute("msg") != null) {
			mv.addObject("msg", redirect.addAttribute("msg"));
		}

		return mv;
	}
}
