package com.bowling.bowlingscore;

import java.util.ArrayList;
import java.util.List;

public class Game {

	// a bowling game is made of 10 frames
	public List<Frame> frames = new ArrayList<Frame>();
	private int bonus;
	public int actualbonus = 0;
	// number of the ball to throw: from 1 to 20
	private int actualBall = 0;

	public Game() {
	}

	public void addFrame(Frame frame) {
		frames.add(frame);
	}

	public void setBonus(int firstBall, int secondBall) {
		if (frames.get(frames.size() - 1).isStrike())
			actualbonus = firstBall + secondBall;
		if (frames.get(frames.size() - 1).isSpare())
			actualbonus = firstBall;
	}

	public int score() {
		int score = 0;
		for (int i = 0; i < frames.size(); i++) {
			score += frames.get(i).score();
		}
		return score;
	}

	public boolean isNextFrameBonus() {
		if (frames.get(frames.size() - 1).isStrike() || frames.get(frames.size() - 1).isSpare())
			return true;
		return false;
	}

}
