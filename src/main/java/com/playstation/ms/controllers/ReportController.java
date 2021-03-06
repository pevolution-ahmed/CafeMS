package com.playstation.ms.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.playstation.ms.models.Item;
import com.playstation.ms.models.ItemForm;

@Controller
public class ReportController {

//	@GetMapping(value = { "/admin/dashboard/products", "/admin/dashboard/products/{page_number}" })
//	String mainProductsDashboardView(Model model, @PathVariable(value = "page_number") Optional<Integer> page) {
////		model.addAttribute("loggedInUser", this.principal);
//		int currentPage = page.orElse(1);
//		Page<Item> itemPages = itemService.getItemsPerPage(currentPage);
//		model.addAttribute("items", itemPages.getContent());
//		model.addAttribute("has_next", itemPages.hasNext());
//		model.addAttribute("has_prev", itemPages.hasPrevious());
//		model.addAttribute("current_page", currentPage);
//		if (itemPages.getTotalPages() > 0) {
//			List<Integer> pageNumbers = IntStream.rangeClosed(1, itemPages.getTotalPages()).boxed()
//					.collect(Collectors.toList());
//
//			model.addAttribute("pageNumbers", pageNumbers);
//		}
//
//		// TODO: add the lists to the model-view
//		return "admin-dashboard";
//	}
//
//	@GetMapping(value = { "/admin/dashboard/products/create", "/admin/dashboard/products/{id}/update" })
//	String createAndUpdateItemView(Model model, @ModelAttribute ItemForm itemForm, @PathVariable Optional<Integer> id) {
//		System.out.println("GET:::::::::::::::");
//		if (id.isPresent()) {
//			model.addAttribute("item_obj", itemService.getOne(id.get()));
//			model.addAttribute("item_obj_id", itemService.getOne(id.get()).getId());
//
//		}
//		model.addAttribute("categories", categoryRepository.findAll());
//		return "create-item-form";
//
//	}
//
//	@PostMapping(value = { "/admin/dashboard/products/create" })
//	String createItemData(Model model, @Valid @ModelAttribute ItemForm item) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		Set<ConstraintViolation<ItemForm>> violations = validator.validate(item);
//		for (ConstraintViolation<ItemForm> violation : violations) {
//			System.out.println(violation.getMessage());
//		}
//		
//		System.out.println("im in create mode!!!!!!");
//		itemService.saveItem(item);
//		return "redirect:/admin/dashboard/products/";
//
//	}
//
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
//	@ExceptionHandler({BindException.class })
//	public ModelAndView handleValidationExceptions(HttpServletRequest req,BindException ex) {
//		Map<String, String> errors = new HashMap<>();
//		ModelAndView mav = new ModelAndView();
////		System.out.println("---------"+ex.getAllErrors());
//		ex.getBindingResult().getAllErrors().forEach((error) -> {
//			String fieldName = ((FieldError) error).getField();
//			String errorMessage = error.getDefaultMessage();
//			if(((FieldError) error).isBindingFailure()) {
//				errorMessage = fieldName+" must be a number ";
//			}
//			mav.addObject(fieldName+"Error", errorMessage);
//			errors.put(fieldName, errorMessage);
//		});
//		mav.setViewName("create-item-form");
//		mav.addObject("categories", categoryRepository.findAll());
//
//		return mav;
//	}
//
//	@GetMapping("/admin/dashboard/products/{id}/delete")
//	String deleteItemFromView(@PathVariable int id) {
//		itemService.deleteItem(id);
//
//		return "redirect:/admin/dashboard/products/";
//	}
//
//	@PostMapping("/admin/dashboard/products/{id}/update")
//	String updateItemData(Model model, @ModelAttribute ItemForm item, @PathVariable int id) {
//		System.out.println("Update mode");
//		itemService.updateItem(id, item);
//		return "redirect:/admin/dashboard/products/";
//
//	}
}
