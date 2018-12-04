package com.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.Cust;

@Controller
public class MainController {

	@Resource(name = "cbiz")
	Biz biz;

	@RequestMapping("/main.dh")
	public String main() {
		return "main";
	}

	@RequestMapping("/first.dh")
	public String first() {
		return "first";
	}

	@RequestMapping("/insert.dh")
	public String insert() {
		Cust cust = new Cust("id15", "LEE", "pw14", "hair", "f", 33, new Date());
		try {
			biz.register(cust);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}

	}

	@RequestMapping("/login.dh")
	public ModelAndView loginimp(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Cust dbcust = null;
		try {
			dbcust = (Cust) biz.get(id);
			if (dbcust.getC_pw().equals(pw)) {
				HttpSession session = request.getSession();
				session.setAttribute("login_cust", dbcust);
				mv.addObject("center", "loginok");
			} else {
				mv.addObject("center", "loginfail");
			}
		} catch (Exception e) {
			mv.addObject("center", "loginfail");
			e.printStackTrace();
		}

		return mv;
	}

}
