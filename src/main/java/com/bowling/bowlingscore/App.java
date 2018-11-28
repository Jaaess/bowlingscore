package com.bowling.bowlingscore;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		Game game = new Game();
		game.addFrame(new Frame(1, 4));
		game.addFrame(new Frame(4, 5));
		game.addFrame(new Frame(6, 4)); // spare
		game.addFrame(new Frame(6, 4));
		game.addFrame(new Frame(10, 0)); // strike
		game.addFrame(new Frame(0, 1));
		game.addFrame(new Frame(7, 3)); // spare
		game.addFrame(new Frame(6, 4)); // spare
		game.addFrame(new Frame(10, 0)); // strike
		game.addFrame(new Frame(2, 8, 6)); // last frame with spare

	}
}
