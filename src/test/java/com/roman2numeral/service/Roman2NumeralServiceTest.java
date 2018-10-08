package com.roman2numeral.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Roman2NumeralServiceTest {

	private Roman2NumeralService service;

	@Before
	public void setUp() {
		service = new Roman2NumeralServiceImpl();
	}

	@Test
	public void shouldReturnResultForAdditiveInput() {
		// Given
		String input = "MMVI"; // 1000+500+100+50+10+1
		// when/Then
		MatcherAssert.assertThat(2006, Matchers.is(service.convert(input)));
	}
	
	@Test
	public void shouldReturnResultForSubtractiveInput() {
		// Given
		String input = "MCMXLIV"; // 1000-5
		// when/Then
		MatcherAssert.assertThat(1944, Matchers.is(service.convert(input)));
	}
}
