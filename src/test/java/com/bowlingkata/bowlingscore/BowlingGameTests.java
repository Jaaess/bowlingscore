package com.bowlingkata.bowlingscore;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTests {

	public Game game = new Game();

	@Before
	public void setUp() {
	}

	@Test
	public void rollingOneScoresOne() {
		game.roll(1);
		assertEquals(1, game.score());
	}

	@Test
	public void rollingTwoScoresTwo() {
		game.roll(2);
		assertEquals(2, game.score());
	}

	@Test
	public void rollingOneThenOneScoresTwo() {
		for (int i = 0; i < 2; i++)
			game.roll(1);
		assertEquals(2, game.score());
	}

	@Test
	public void rollingASpareThenAOneScoresTwelve() {
		game.roll(5);
		game.roll(5);
		game.roll(1);
		assertEquals(12, game.score());
	}

}
