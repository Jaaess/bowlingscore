package com.bowlingkata.bowlingscore;

public class Game {

	public int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;

	public void roll(int... rolls) {
		for (int pinsdown : rolls)
			roll(pinsdown);
	}

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++) {
			if (isStrike(rollIndex)) {
				score += 10 + strikeBonus(rollIndex);
				rollIndex++;
			} else if (isSpare(rollIndex)) {
				score += 10 + spareBonus(rollIndex);
				rollIndex += 2;
			} else {
				score += sumOfBallsInFrame(rollIndex);
				rollIndex += 2;
			}
		}
		return score;
	}

	private int sumOfBallsInFrame(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex + 1];
	}

	private int spareBonus(int rollIndex) {
		return rolls[rollIndex + 2];
	}

	private int strikeBonus(int rollIndex) {
		return rolls[rollIndex + 1] + rolls[rollIndex + 2];
	}

	private boolean isSpare(int rollIndex) {
		return sumOfBallsInFrame(rollIndex) == 10;
	}

	private boolean isStrike(int rollIndex) {
		return rolls[rollIndex] == 10;
	}

}
