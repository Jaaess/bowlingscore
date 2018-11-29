package com.bowling.bowlingscore;

import java.util.ArrayList;
import java.util.List;

public class Game {

	// a bowling game is made of 10 frames
	public List<Frame> frames = new ArrayList<Frame>();
	// 10 scores for 10 frames
	public List<Integer> scores = new ArrayList<Integer>();
	
	private int actualbonus = 0;
	// number of the ball to throw from 0 to 20
	private int thrownBalls = 0;

	public Game() {
		
	}

	public void addFrame(Frame frame) {
		frames.add(frame);
	}

	public void setBonus(int firstBall, int secondBall) {
		if (frames.get(frames.size() - 1).isStrike()) {
			actualbonus = firstBall + secondBall;
			setActualbonus(actualbonus);
		}
		if (frames.get(frames.size() - 1).isSpare()) {
			actualbonus = firstBall;
			setActualbonus(actualbonus);
		}
	}

	public boolean isThreeBallsRemaining() {
		thrownBalls = 0;
		return true;
	}

	// save the calculated scores in list<Integer> for each frame
	public void setScoreForFrame(int i) {
		scores.add(i, score());
	}

	public int score() {

		// get the last frame's score (calculated with old bonuses)
		int score = scores.size() > 0 ? score = scores.get(scores.size() - 1) : 0;

		// calculate the score with the actual bonus
		score += frames.get(frames.size() - 1).score();

		return score;
	}
	
	public int scoreLastFrame(int firstBall, int secondBall){
		if (frames.get(9).isStrike() == true || frames.get(9).isSpare() == true )
			return 10;
		else
			return firstBall + secondBall;
	}
	
	// check if there is a bonus 
	public boolean isBonusToGetFromTheNextFrameExist() {
		if (frames.get(frames.size() - 1).isStrike() || frames.get(frames.size() - 1).isSpare())
			return true;
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		if (frames.size() == 9)
			return true;
		return false;
	}

	public int getActualbonus() {
		return actualbonus;
	}

	public void setActualbonus(int actualbonus) {
		this.actualbonus = actualbonus;
	}

}
