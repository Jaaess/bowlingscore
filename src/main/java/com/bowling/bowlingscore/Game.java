package com.bowling.bowlingscore;

import java.util.ArrayList;
import java.util.List;

public class Game {

	// a bowling game is made of (at least) 10 frames
	public List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	public int actualbonus = 0;

	public Game() {
	}

	public void addFrame(Frame frame) {
		frames.add(frame);
	}

	public void setBonus(int firstThrow, int secondThrow) {
		if (frames.get(frames.size() - 1).isStrike())
			actualbonus = firstThrow + secondThrow;
		if (frames.get(frames.size() - 1).isSpare())
			actualbonus = firstThrow;
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
