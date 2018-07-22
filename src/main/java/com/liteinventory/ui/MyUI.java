package com.liteinventory.ui;

import javax.servlet.annotation.WebServlet;

import com.liteinventory.utils.Views;
import com.liteinventory.views.LoginView;
import com.liteinventory.views.MainView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@Theme("mytheme")
@Title("liteinventory")
@SuppressWarnings("serial")
@PreserveOnRefresh
public class MyUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = MyUI.class)
	public static class Servlet extends VaadinServlet {
	}
	
	public MyUI getMyUI() {
		return (MyUI) UI.getCurrent();
	}
	
	@Override
	protected void init(VaadinRequest request) {
		Navigator navi = new Navigator(this, this);
		navi.addView(Views.MAIN, MainView.class);
		navi.addView(Views.LOGIN, LoginView.class);

		UI.getCurrent().getNavigator().navigateTo(Views.LOGIN);
		
	}

}
