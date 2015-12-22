package org.hypernovae.apis;

import org.springframework.context.ApplicationContext;

public class AppManager {
	
	private static  ApplicationContext appContext;
	private static AppManager instance;
	public  static ApplicationContext getAppContext() {
		return appContext;
	}
	
	public static AppManager getAppManager(ApplicationContext context) {
		if (instance == null) {
			instance =new AppManager();
			appContext = context;
		}
		
		return instance;
	}
	
	public static AppManager getAppManager() {
		if (instance != null) {
			return instance;
		} else {
			throw new IllegalArgumentException("Must configure the App context first...");
		}
	}
	
	private AppManager() {
		
	}

}
