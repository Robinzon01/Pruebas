package com.cdsi.pven.app.common;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.servlet.ModelAndView;

import com.cdsi.pven.app.model.Usuario;
import com.cdsi.pven.app.service.IUsuarioService;

public class PageInitPagUsuario {
	
	private IUsuarioService usuService;
	
    //pagination
	private static final int BUTTONS_TO_SHOW = 3;
	private static final int INITIAL_PAGE = 0;
	private static final int INITIAL_PAGE_SIZE = 10;
	private static final int[] PAGE_SIZES = { 10, 15 };
	
	public  ModelAndView initPagination(Optional<Integer> pageSize, Optional<Integer> page, String url) {
		ModelAndView initModelView = new ModelAndView(url);
		int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
		int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
		Page<Usuario> usuList = usuService.findAll(PageRequest.of(evalPage, evalPageSize));
		PagerModel pager = new PagerModel(usuList.getTotalPages(), usuList.getNumber(), BUTTONS_TO_SHOW);
		initModelView.addObject("usuList", usuList);
		initModelView.addObject("selectedPageSize", evalPageSize);
		initModelView.addObject("pageSizes", PAGE_SIZES);
		initModelView.addObject("pager", pager);
		return initModelView;
	}

}
