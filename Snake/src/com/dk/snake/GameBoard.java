package com.dk.snake;

import java.util.Arrays;

public class GameBoard {
	Block[][] playGround;

	int nbLine;
	int nbCol;
	
	public GameBoard(int nbLine, int nbCol) {
		playGround = new Block[nbLine][nbCol];
		Wall wall = new Wall("w");

		// Remplir premier ligne
		for (int i = 0; i < nbCol; i++) {
			playGround[0][i] = wall;
		}

		// Remplir dernier ligne
		for (int i = 0; i < nbCol; i++) {
			playGround[nbLine - 1][i] = wall;
		}

		// Remplir premier col
		for (int j = 0; j < nbLine; j++) {
			playGround[j][0] = wall;
		}

		// Remplir dernier col
		for (int j = 0; j < nbLine; j++) {
			playGround[j][nbCol - 1] = wall;
		}
	}

	public Block[][] getPlayGround() {
		return playGround;
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < nbCol; i++) {
			
		}
		
		
		return res;
	}
}
