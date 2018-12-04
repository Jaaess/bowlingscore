package com.bowlingkata.bowlingscore;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTests {

	public Game game = new Game();

	@Before
	public void setUp() {
	}

	public void rollMany(int pins, int n) {
		for (int i = 0; i < n; i++) {
			game.roll(pins);
		}
	}

	private void roleASpare() {
		rollMany(5, 2);
	}

	private void roleAStrike() {
		game.roll(10);
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
		rollMany(1, 2);
		assertEquals(2, game.score());
	}

	@Test
	public void rollingASpareThenAOneScoresTwelve() {
		roleASpare();
		game.roll(1);
		assertEquals(12, game.score());
	}

	@Test
	public void canScorePerfectGame() {
		
		game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
		assertEquals(300, game.score());
	}
}
