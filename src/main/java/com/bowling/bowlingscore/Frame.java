package com.bowling.bowlingscore;

public class Frame {

	private int firstBall;
	private int secondBall;
	Game game;

	public Frame(int firstBall, int secondBall, Game game) {
		this.firstBall = firstBall;
		this.secondBall = secondBall;
		this.game = game;
	}


	// the score of a single frame
	public int score() {
		if (isStrike() == true || isSpare() == true )
			return 10 + bonus();
		else
			return firstBall + secondBall;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		if (firstBall == 10)
			return true;
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		if (firstBall + secondBall == 10 && firstBall != 10 && secondBall != 10)
			return true;
		return false;
	}

	// bonus throws
	public int bonus() {
		return game.getActualbonus();
	}
}