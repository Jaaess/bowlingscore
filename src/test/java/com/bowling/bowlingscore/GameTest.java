package com.bowling.bowlingscore;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void testScoreClaculation_scenario_1() {
		game.addFrame(new Frame(1, 4));
		Assert.assertTrue("Score without strike or spare", game.score() == 5);
		game.addFrame(new Frame(1, 8));
		Assert.assertTrue("score without strike or spare", game.score() == 5 + 9);
	}

	@Test
	public void testScoreClaculation_scenario_2() {
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(1, 2));
		Assert.assertTrue("first strike and no Bonus for the next 2 balls", game.score() == 10 + 3);
	}

	@Test
	public void testScoreClaculation_scenario_3() {
		game.addFrame(new Frame(10, 0));
		game.addFrame(new Frame(8, 2));
		Assert.assertTrue("first strike and spare for the next 2 balls", game.score() == 10 + 10);
	}

	@Test
	public void testScoreClaculation_scenario_4() {
		game.addFrame(new Frame(10, 0));
		game.setBonus(10, 0);
		Assert.assertTrue("bonus ", game.actualbonus == 10);
		
		game.addFrame(new Frame(10, 0));
		Assert.assertTrue("first strike and another strike for the next ball", game.score() == 10 + 10);
		game.setBonus(8, 1);
		Assert.assertTrue("bonus ", game.actualbonus == 9);
		
		game.addFrame(new Frame(8, 1));
		Assert.assertTrue("score ", game.score() == 10 + 10 + 9);
	}

	@Test
	public void testScoreClaculation_given_scenario() {
//		game.setBonus(10, 0);
		game.addFrame(new Frame(1, 4));
		Assert.assertTrue("score ", game.score() == 5);

		game.setBonus(4, 5);
		game.addFrame(new Frame(4, 5));
		Assert.assertTrue("score ", game.score() == 14);

		game.setBonus(6, 4);
		game.addFrame(new Frame(6, 4)); // spare
		Assert.assertTrue("score ", game.score() == 29);

		game.setBonus(5, 5);
		game.addFrame(new Frame(5, 5)); // spare
		Assert.assertTrue("score ", game.score() == 49);

		game.setBonus(10, 0);
		game.addFrame(new Frame(10, 0)); // strike
		Assert.assertTrue("score ", game.score() == 60);

		game.addFrame(new Frame(0, 1));
		game.setBonus(0, 1);
		Assert.assertTrue("score ", game.score() == 61);

		game.setBonus(7, 3);
		game.addFrame(new Frame(7, 3));
		Assert.assertTrue("score ", game.score() == 77);

		game.setBonus(6, 4);
		game.addFrame(new Frame(6, 4));
		Assert.assertTrue("score ", game.score() == 97);

		game.setBonus(10, 0);
		game.addFrame(new Frame(10, 0));
		Assert.assertTrue("score ", game.score() == 117);

		game.setBonus(2, 8);
		game.addFrame(new Frame(2, 8));
		
		
		Assert.assertTrue("score ", game.score() == 133 - 6 );

//		Assert.assertTrue("score ", game.score() == 10 + 10 + 9);
	}

	@Test
	public void testScoreClacu() {
		Assert.assertTrue(true);
	}

}
