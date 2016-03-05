package org.hypernovae.apps.models.error;

import java.text.MessageFormat;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

public class CustomErrorControllerTest {
	
	@Test
	public void generalError_with_throwable_null_and_uri_null_Test() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		request.setAttribute("javax.servlet.error.status_code", 503);
		request.setAttribute("javax.servlet.error.exception", null);
		request.setAttribute("javax.servlet.error.request_uri", null);
		Model model = new ExtendedModelMap();
		HttpServletResponse response = new MockHttpServletResponse();
		String reasonPhrase = "Service Unavailable";
		
		CustomErrorController controller = new CustomErrorController();
		String gE = controller.generalError(request, response, model);
		Map<String, Object> attrs = model.asMap();
		assertTrue(attrs.containsKey("errorMessage"));
		String errorMessage =(String) attrs.get("errorMessage");
		assertNotNull(errorMessage);
		assertEquals(
				MessageFormat.format("{0} returned for {1} with message {2}", 
						"503", "Unknown", reasonPhrase
					) 
				,
				
				errorMessage
				);
		
		
		
	}

}
