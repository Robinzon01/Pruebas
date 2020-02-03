package com.cdsi.pven.app.common;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.cdsi.pven.app.model.Articulo;
import com.cdsi.pven.app.service.IArticuloService;

@Component
public class PageInitPagArticulo {
  
  @Autowired
  private IArticuloService artiService;
  
    //pagination
	private static final int BUTTONS_TO_SHOW = 3;
	private static final int INITIAL_PAGE = 0;
	private static final int INITIAL_PAGE_SIZE = 10;
	private static final int[] PAGE_SIZES = { 10, 15 };
	
	public  ModelAndView initPagination(Optional<Integer> pageSize, Optional<Integer> page, String url) {
		ModelAndView initModelView = new ModelAndView(url);
		// If pageSize == null, return initial page size
		int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
		
		int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;

		Page<Articulo> artiList = artiService.findAll(PageRequest.of(evalPage, evalPageSize));
		PagerModel pager = new PagerModel(artiList.getTotalPages(), artiList.getNumber(), BUTTONS_TO_SHOW);

		initModelView.addObject("artiList", artiList);
		initModelView.addObject("selectedPageSize", evalPageSize);
		initModelView.addObject("pageSizes", PAGE_SIZES);
		initModelView.addObject("pager", pager);
		return initModelView;
	}
	
	
	
}
