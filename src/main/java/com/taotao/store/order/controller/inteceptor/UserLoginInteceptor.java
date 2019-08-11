package com.taotao.store.order.controller.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
*@author作者weilin
*@version 创建时间:2019年7月2日下午8:29:35
*类说明
*/
public class UserLoginInteceptor implements HandlerInterceptor{
	

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		//进入订单系统前判断用户是否登录
		
		return false;
	}

}
