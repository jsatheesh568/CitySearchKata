package com.kata.citynamesearch;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author : Satheeshkumar S
 *
 */
public class CityNameSearchTest {
	
	@Test
    public void testSearchWithLessThanTwoChars() {
        CityNameSearch cityNameSearch = new CityNameSearch();
        List<String> result = cityNameSearch.search("a");
        assertEquals(Arrays.asList(), result);

}
}
