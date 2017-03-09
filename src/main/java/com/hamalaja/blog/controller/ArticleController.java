package com.hamalaja.blog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hamalaja.blog.om.Article;

@RestController
public class ArticleController {
	private @Value("${foo}") int foo;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Article index() {
		Article article = new Article();
		article.setId("series-angular-2");
		article.setTitle("Series Angular 2");
		return article;
	}
}
