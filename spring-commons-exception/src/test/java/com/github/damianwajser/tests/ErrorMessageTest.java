package com.github.damianwajser.tests;

import com.github.damianwajser.exceptions.ExceptionFactory;
import com.github.damianwajser.exceptions.model.ErrorMessage;
import com.github.damianwajser.exceptions.model.ExceptionDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class ErrorMessageTest {

	@Test
	public void ErrorMessageTest() {
		//new ExceptionFactory().getException(null,null);
		HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
		ExceptionDetail detail = new ExceptionDetail("", "", Optional.empty());
		ErrorMessage errorMessage = new ErrorMessage(Arrays.asList(detail), request);
		ErrorMessage errorMessage1 = new ErrorMessage(Arrays.asList(detail), request);
		System.out.println(errorMessage);
		Assert.assertEquals(errorMessage.getDetails(), errorMessage1.getDetails());
		Assert.assertEquals(errorMessage.getPath(), errorMessage1.getPath());
		Assert.assertEquals(errorMessage.getDetails().get(0).getErrorCode(), errorMessage1.getDetails().get(0).getErrorCode());
		Assert.assertEquals(errorMessage.getDetails().get(0).getErrorDetail(), errorMessage1.getDetails().get(0).getErrorDetail());
		Assert.assertEquals(errorMessage.getDetails().get(0).getErrorMessage(), errorMessage1.getDetails().get(0).getErrorMessage());
		Assert.assertEquals(errorMessage.getDetails().get(0).getMetaData(), errorMessage1.getDetails().get(0).getMetaData());

	}

	@Test
	public void ErrorMessage() {
		try {
			throw ExceptionFactory.getException(getDetails(), HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private List<ExceptionDetail> getDetails() {
		return Arrays.asList(new ExceptionDetail("error", "a", Optional.of("algo")));
	}
}
