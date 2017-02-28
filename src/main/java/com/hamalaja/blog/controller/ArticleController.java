package com.hamalaja.blog.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ArticleController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		model.put("title", "Vi du");
		return "index";
	}
}