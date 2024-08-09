package com.tenco.bank.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tenco.bank.handler.exception.DataDeliveryException;
import com.tenco.bank.handler.exception.RedirectException;
import com.tenco.bank.handler.exception.UnAuthorizedException;

@ControllerAdvice
public class GlobalControllerAdvice {
	
	
	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {
		System.out.println("-------------");
		System.out.println(e.getClass().getName());
		System.out.println(e.getMessage());
		System.out.println("-------------");
	}
	
	@ResponseBody
	@ExceptionHandler(DataDeliveryException.class)
	public String dataDeliveryException(DataDeliveryException e) {
		StringBuffer sb=new StringBuffer();
		sb.append(" <script>");
		sb.append(" alert('"+e.getMessage()+"');");
		sb.append(" window.history.back();");
		sb.append(" </script>");
		return sb.toString();
	}
	
	@ResponseBody
	@ExceptionHandler(UnAuthorizedException.class)
	public String unAuthorizedException(UnAuthorizedException e) {
		StringBuffer sb=new StringBuffer();
		sb.append(" <script>");
		sb.append(" alert('"+e.getMessage()+"');");
		sb.append(" window.history.back();");
		sb.append(" </script>");
		return sb.toString();
	}
	
	@ExceptionHandler(RedirectException.class)
	public ModelAndView redirectException(RedirectException e) {
		ModelAndView modelAndView=new ModelAndView("errorPage");
		modelAndView.addObject("statusCode",e.getStatus().value());
		modelAndView.addObject("message",e.getMessage());
		return modelAndView;
	}
	
	
}
