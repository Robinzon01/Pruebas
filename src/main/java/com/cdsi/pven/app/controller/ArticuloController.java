package com.cdsi.pven.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdsi.pven.app.common.PageInitPagArticulo;

@Controller
@RequestMapping({"/articles"})
public class ArticuloController {
	
	protected static final String ARTICLE_PAGE_VIEW = "articulo/allArticulo";
	
	@Autowired
	private PageInitPagArticulo pagInPagArti;
	
	
	@Secured({"ROLE_ADMIN","ROLE_VENDEDOR"})
	@GetMapping
	public ModelAndView getAllArticles(@RequestParam("pageSize") Optional<Integer> pageSize,@RequestParam("page") Optional<Integer> page) {
		ModelAndView modelAndView = pagInPagArti.initPagination(pageSize, page, ARTICLE_PAGE_VIEW);
		return modelAndView;
	}

}
