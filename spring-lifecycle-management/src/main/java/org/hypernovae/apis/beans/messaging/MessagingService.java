package org.hypernovae.apis.beans.messaging;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessagingService {
	private String initMessage;
	private String promptMessage;
	private String promptPostFix;
	public String getPromptMessage() {
		return promptMessage;
	}
	public void setPromptMessage(String promptMessage) {
		this.promptMessage = promptMessage;
	}
	public String getPromptPostFix() {
		return promptPostFix;
	}
	public void setPromptPostFix(String promptPostFix) {
		this.promptPostFix = promptPostFix;
	}
	public String getInitMessage() {
		return initMessage;
	}
	public void setInitMessage(String initMessage) {
		this.initMessage = initMessage;
	}
	
	@SuppressWarnings("restriction")
	@PostConstruct
	public void initMessagingService() throws Exception {
		System.out.println(initMessage);
		System.out.println(promptMessage+":" + promptPostFix);
		
	}
	
	@SuppressWarnings("restriction")
	@PreDestroy
	public void cleanUpMessagingService() throws Exception {
		System.out.println("Clean up time after container is destroyed...");
	}
	

}
