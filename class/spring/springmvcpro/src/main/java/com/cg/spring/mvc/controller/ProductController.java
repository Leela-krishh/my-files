package com.cg.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.mvc.beans.Product;
import com.cg.spring.mvc.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService service;
	
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public ModelAndView getAllProducts() {
		ModelAndView mv=new ModelAndView("showall");
		mv.addObject("products",service.getAllProducts());
		return mv;
	}
	
	@RequestMapping(value="/addp", method=RequestMethod.GET)
	public ModelAndView addProduct() {
		ModelAndView mv=new ModelAndView("add");
		mv.addObject("command", new Product());
		return mv;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView searchProduct(@RequestParam("id") int id) {
		ModelAndView mv=new ModelAndView("showone");
		mv.addObject("product", service.searchById(id));
		return mv;
	}
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String add(Product p) {
		service.add(p);
		return "redirect:/getall";
	}
}

