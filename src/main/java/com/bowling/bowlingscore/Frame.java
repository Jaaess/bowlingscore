package com.bowling.bowlingscore;

public class Frame {

	private int firstBall;
	private int secondBall;
	Game game;

	public Frame(int firstBall, int secondBall) {
		this.firstBall = firstBall;
		this.secondBall = secondBall;
		game = new Game();
	}

	public Frame(int i, int j, int k) {

	}

	// the score of a single frame
	public int score() {
		if (isStrike() == true)
			return firstBall + bonus();
		else if (isSpare() == true)
			return 10 + bonus();
		// return firstBall + secondBall + bonus();
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

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		if (game.frames.size() == 9)
			return true;
		return false;
	}

	// bonus throws
	public int bonus() {
		return game.actualbonus;
	}
}