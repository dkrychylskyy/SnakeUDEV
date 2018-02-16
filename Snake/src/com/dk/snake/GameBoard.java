package com.dk.snake;

public class GameBoard {
	Block[][] playGround;
	Wall wall = new Wall("w");
	Fruit fruit = new Fruit("f");
	
	public GameBoard(int nbLine, int nbCol) {
		
		playGround = new Block[nbLine][nbCol];
		
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
		
		this.setFruit(fruit);
	}
	
	// Creation fruit
	public void setFruit(Fruit fruit) {
		Block[][] pg = this.getPlayGround();
		if (pg[1][1] == null) {
			pg[1][1] = fruit;
		}
	}
	
	public Block[][] getPlayGround() {
		return playGround;
	}

	public String toString() {
		String res = "";
		for (Block[] blocks : playGround) {
			for (Block block : blocks) {
				if (block != null) {
					res += block.getSymbol();
				}
			}
		}
		return res;
	}
}
