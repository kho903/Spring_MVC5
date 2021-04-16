package kr.co.softcampus.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softcampus.beans.DataBean1;
import kr.co.softcampus.beans.DataBean2;

@Controller
public class TestContoller {

	@Autowired
	@Lazy
	DataBean1 requestBean1;

	@Resource(name="requestBean2")
	@Lazy
	DataBean2 requestBean2;
	
	@GetMapping("/test1")
	public String test1() {
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");

		requestBean2.setData3("문자열3");
		requestBean2.setData4("문자열4");

		return "forward:/result1";
	}

	@GetMapping("/result1")
	public String result1(Model model) {

		System.out.printf("requestBean1.data1 : %s\n", requestBean1.getData1());
		System.out.printf("requestBean1.data2 : %s\n", requestBean1.getData2());
		System.out.printf("requestBean2.data3 : %s\n", requestBean2.getData3());
		System.out.printf("requestBean2.data4 : %s\n", requestBean2.getData4());

		model.addAttribute("requestBean1", requestBean1);
		
		return "result1";
	}
}
