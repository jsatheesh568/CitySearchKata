package com.kata.citynamesearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author : Satheeshkumar S
 *
 */
public class CityNameSearchTest {

	private List<String> cities = new ArrayList<>();

	@Test
	public void testSearchWithLessThanTwoChars() {
		CityNameSearch cityNameSearch = new CityNameSearch();
		List<String> result = cityNameSearch.search("a");
		assertEquals(Arrays.asList(), result);

	}

	@Test
	public void testSearchWithThreeChars() {
		CityNameSearch cityNameSearch = new CityNameSearch();
		List<String> result = cityNameSearch.search("bud");
		assertEquals(Arrays.asList("Budapest"), result);
	}

	@Test
	public void testSearchCaseInsensitive() {
		CityNameSearch cityNameSearch = new CityNameSearch();
		List<String> result = cityNameSearch.search("SYD");
		assertEquals(Arrays.asList("Sydney"), result);
	}

	@Test
	public void testSearchWithAsterisk() {
		CityNameSearch cityNameSearch = new CityNameSearch();
		cityNameSearch.setCities(cities);
		List<String> result = cityNameSearch.search("*");
		assertEquals(cities.size(), result.size());
		assertTrue(result.containsAll(cityNameSearch.getCities()));
		assertTrue(cityNameSearch.getCities().containsAll(result));
	}
}
