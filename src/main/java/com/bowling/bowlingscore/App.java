package com.bowling.bowlingscore;

public class App {

	public static void main(String[] args) {

		Game game = new Game();

		game.addFrame(new Frame(Integer.parseInt(args[0]), Integer.parseInt(args[1]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		game.setScoreForFrame(0);

		// frame 2
		game.addFrame(new Frame(Integer.parseInt(args[2]), Integer.parseInt(args[3]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[4]), Integer.parseInt(args[5]));
		game.setScoreForFrame(1);

		// frame 3
		// spare
		game.addFrame(new Frame(Integer.parseInt(args[4]), Integer.parseInt(args[5]), game));
		// check if the current frame spare or strike and get the bonus from the next
		// frame
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[6]), Integer.parseInt(args[7]));
		game.setScoreForFrame(2);

		// frame 4
		// spare
		game.addFrame(new Frame(Integer.parseInt(args[6]), Integer.parseInt(args[7]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[8]), Integer.parseInt(args[9]));
		game.setScoreForFrame(3);

		// frame 5
		// strike
		game.addFrame(new Frame(Integer.parseInt(args[8]), Integer.parseInt(args[9]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[10]), Integer.parseInt(args[11]));
		game.setScoreForFrame(4);

		// frame 6
		game.addFrame(new Frame(Integer.parseInt(args[10]), Integer.parseInt(args[11]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[12]), Integer.parseInt(args[13]));
		game.setScoreForFrame(5);

		// frame 7
		// spare
		game.addFrame(new Frame(Integer.parseInt(args[12]), Integer.parseInt(args[13]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[14]), Integer.parseInt(args[15]));
		game.setScoreForFrame(6);

		// frame 8
		// spare
		game.addFrame(new Frame(Integer.parseInt(args[14]), Integer.parseInt(args[15]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[16]), Integer.parseInt(args[17]));
		game.setScoreForFrame(7);

		// frame 9
		// strike
		game.addFrame(new Frame(Integer.parseInt(args[16]), Integer.parseInt(args[17]), game));
		if (game.isBonusToGetFromTheNextFrameExist())
			game.setBonus(Integer.parseInt(args[18]), Integer.parseInt(args[19]));
		game.setScoreForFrame(8);

		// frame 10
		// last frame
		game.addFrame(new Frame(Integer.parseInt(args[18]), Integer.parseInt(args[19]), game));
		if (game.isLastFrame()) {
			if (game.isThreeBallsRemaining()) {
				System.out.println("------------------------------FINALE SCORE:----------------------------------\n ");
				System.out.println( "----- \t" +  game.scores.get(8) + game.scoreLastFrame(Integer.parseInt(args[18]), Integer.parseInt(args[19]))
								+ Integer.parseInt(args[20]));
				System.out.println("-----------------------------------------------------------------------------\n ");
			}
		}

		System.out.println("------------------------------FINALE SCORE:----------------------------------\n ");
		System.out.println( "----- \t" +  game.scores.get(8) + game.scoreLastFrame(Integer.parseInt(args[18]), Integer.parseInt(args[19]))
						+ Integer.parseInt(args[20]));
		System.out.println("-----------------------------------------------------------------------------\n ");

	}
}
