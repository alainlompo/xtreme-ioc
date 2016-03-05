package org.hypernovae.apps.models.support.web;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class MessageHelperTest {
	
	@Test
	public void addAttributesTest() {
		RedirectAttributes mockRedirectAttributes=Mockito.mock(RedirectAttributes.class);
		MessageHelper.addWarningAttribute(mockRedirectAttributes, "Test", new Object[]{"Test"});
		Mockito.verify(mockRedirectAttributes).addFlashAttribute(anyString(), any(Message.class));
		
	}

}
