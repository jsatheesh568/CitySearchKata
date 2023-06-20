package com.kata.citynamesearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Satheeshkumar.s
 *
 */
public class CityNameSearch {

	private List<String> cities;

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public CityNameSearch() {
		cities = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valencia", "Vancouver", "Amsterdam",
				"Vienna", "Sydney", "New York City", "London", "Bangkok", "Hong Kong", "Dubai", "Rome", "Istanbul");
	}

	public CityNameSearch(List<String> cities) {
		this.cities = cities;
	}

	public List<String> search(String searchText) {
		if (searchText.length() < 2) {
			return new ArrayList<>();
		}

		if (searchText.equals("*")) {
			return new ArrayList<>(cities);
		}

		return cities.stream().filter(city -> city.toLowerCase().contains(searchText.toLowerCase()))
				.collect(Collectors.toList());
	}

}
