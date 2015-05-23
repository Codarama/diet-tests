package org.codarama.diet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.commons.lang3.time.StopWatch;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	// we want this class here, because it is in the test package and we want to simulate
	// what would happen to dependencies in the test package. Ideally they should not be part
	// of the minimized deliverable.
	// TODO Check this
	StopWatch watch = new StopWatch();

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		watch.start();
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		watch.split();
		App app = new App();
		assertEquals("Capitalize me please oh please", app.toString());
		watch.stop();
	}
}
