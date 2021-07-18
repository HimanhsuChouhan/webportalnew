package com.pms.webportal.dao;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;

import com.pms.webportal.model.UserData;

public interface WebportalServiceDao {

	public String postLogin(UserData user, HttpSession session, ModelMap warning);

	public String getPensionerDetailForm(String token);

	public Boolean isSessionValid(String token);
}
