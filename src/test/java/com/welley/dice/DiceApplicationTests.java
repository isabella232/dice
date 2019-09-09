package com.welley.dice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DiceApplicationTests {

	private Player test = new Player();
	private String state;

	@Test
	public void testCheckWinLoseContinue () {
		state = "win";
		state = test.setSecondState();
		String message = test.checkWinLoseContinue();
		assertTrue(message == "You win! Restarting...");
	}

}
