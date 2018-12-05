package com.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.Cart;
import com.vo.Cust;

@Controller
public class MainController {

	@Resource(name = "cbiz")
	Biz biz;

	@Resource(name = "cartbiz")
	Biz cartbiz;

	@RequestMapping("/main.dh")
	public String main() {
		return "main";
	}

	@RequestMapping("/main_login.dh")
	public String main_login() {
		return "main_login";
	}

	@RequestMapping("/first.dh")
	public String first() {
		return "first";
	}

	@RequestMapping("/login.dh")
	public String login() {
		return "login";
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

	@RequestMapping("/loginimp.dh")
	public ModelAndView loginimp(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		Cust dbcust = null;
		Cart cart = null;
		int cnt = 0;
		try {
			dbcust = (Cust) biz.get(id);
			cart = (Cart) cartbiz.get(dbcust.getC_id());
			cnt = cart.getCart_qty();
			if (dbcust.getC_pw().equals(pw)) {
				HttpSession session = request.getSession();
				session.setAttribute("login_cust", dbcust);
				mv.setViewName("main");
				mv.addObject("cart_cnt", cnt);
				System.out.println(cnt);

			} else {
				mv.setViewName("loginfail");
			}
		} catch (Exception e) {
			mv.setViewName("loginfail");
			e.printStackTrace();
		}

		return mv;
	}

	@RequestMapping("/logout.dh")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		return "main";
	}

}
