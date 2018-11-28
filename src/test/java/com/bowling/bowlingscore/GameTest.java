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
	public void testScoreClaculation_given_scenario() {

		//frame 1
		game.addFrame(new Frame(1, 4, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(4, 5);
		Assert.assertTrue("score ", game.score() == 5);
		game.setScoreForFrame(0);

		//frame 2
		game.addFrame(new Frame(4, 5, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(6, 4);
		Assert.assertTrue("score ", game.score() == 14);
		game.setScoreForFrame(1);

		//frame 3
		// spare
		game.addFrame(new Frame(6, 4, game));
		// check if the current frame spare or strike and get the bonus from the next frame
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(5, 5);
		Assert.assertTrue("score ", game.score() == 29);
		game.setScoreForFrame(2);

		//frame 4
		// spare
		game.addFrame(new Frame(5, 5, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(10, 0);
		Assert.assertTrue("score ", game.score() == 49);
		game.setScoreForFrame(3);

		//frame 5
		// strike
		game.addFrame(new Frame(10, 0, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(0, 1);
		Assert.assertTrue("score ", game.score() == 60);
		game.setScoreForFrame(4);
		
		//frame 6
		game.addFrame(new Frame(0, 1, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(7, 3);
		Assert.assertTrue("score ", game.score() == 61);
		game.setScoreForFrame(5);

		//frame 7
		// spare
		game.addFrame(new Frame(7, 3, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(6, 4);
		Assert.assertTrue("score ", game.score() == 77);
		game.setScoreForFrame(6);

		//frame 8
		// spare
		game.addFrame(new Frame(6, 4, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(10, 0);
		Assert.assertTrue("score ", game.score() == 97);
		game.setScoreForFrame(7);

		//frame 9
		// strike
		game.addFrame(new Frame(10, 0, game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(2, 8);
		Assert.assertTrue("score ", game.score() == 117);
		game.setScoreForFrame(8);

		//frame 10
		// last frame
		game.addFrame(new Frame(2, 8, game));
		if (game.isLastFrame()) {
			if (game.isThreeBallsRemaining()) {
				Assert.assertTrue("score ", game.scores.get(8) + game.scoreLastFrame(2, 8) + /*third ball*/6  == 133);
			}
		}		
		game.setScoreForFrame(9);
	}
}
