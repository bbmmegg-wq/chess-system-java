package application;

import boardgame.Board;
import boardgame.Position;

public class program {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Position position = new Position(3,5);
		
		Board board = new Board(8,8);

		System.out.println(board);
	}

}
