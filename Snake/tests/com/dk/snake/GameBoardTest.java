package com.dk.snake;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GameBoardTest {
	
	// Test premier ligne
	GameBoard gb = new GameBoard(5, 5);
	Wall wall = new Wall("w");

	@Test
	void testGameBoard0_0_Wall() {
		Block actual = gb.playGround[0][0];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard0_1_Wall() {
		Block actual = gb.playGround[0][1];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard0_2_Wall() {
		Block actual = gb.playGround[0][2];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard0_3_Wall() {
		Block actual = gb.playGround[0][3];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard0_4_Wall() {
		Block actual = gb.playGround[0][4];
		assertTrue(actual instanceof Wall);
	}
	
	// Test premier col
	@Test
	void testGameBoard1_0_Wall() {
		Block actual = gb.playGround[1][0];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard2_0_Wall() {
		Block actual = gb.playGround[2][0];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard3_0_Wall() {
		Block actual = gb.playGround[3][0];
		assertTrue(actual instanceof Wall);
	}
	@Test
	void testGameBoard4_0_Wall() {
		Block actual = gb.playGround[4][0];
		assertTrue(actual instanceof Wall);
	}
	
	// Test dernier ligne
	
}
