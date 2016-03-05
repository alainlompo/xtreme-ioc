package org.hypernovae.apps.models.error;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@RunWith(MockitoJUnitRunner.class)
public class ExceptionHandlerTest {

	@Test
	public void exceptionTest() {
		ExceptionHandler handler = new ExceptionHandler();
		WebRequest wR = Mockito.mock(WebRequest.class);
		ModelAndView mAV = handler.exception(new IllegalArgumentException("Test"), wR);
		assertNotNull(mAV);
		Map<String, Object> objects = mAV.getModel();
		assertNotNull(objects);
		assertTrue(objects.containsKey("errorMessage"));
	}
}
