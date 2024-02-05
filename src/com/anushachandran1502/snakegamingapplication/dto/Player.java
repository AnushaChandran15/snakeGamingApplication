package com.anushachandran1502.snakegamingapplication.dto;

public class Player {
	private  int player;
	private Position playerPosition;
		public Player(int i, Position position) {
		this.player=i;
		playerPosition=position;
	}
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public Position getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(Position playerPosition) {
		this.playerPosition = playerPosition;
	}
	public String toString()
	{
		return playerPosition.getX() +" "+ playerPosition.getY();
		
	}
}
