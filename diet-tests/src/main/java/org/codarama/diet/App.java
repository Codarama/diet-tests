package org.codarama.diet;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		App app = new App();
		System.out.println(app);
	}

	@Override
	public String toString() {
		// we want to see this class after the minimisation
		return StringUtils.capitalize("capitalize me please oh please");
	}
}
