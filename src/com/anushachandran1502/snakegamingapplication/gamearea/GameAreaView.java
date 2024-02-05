package com.anushachandran1502.snakegamingapplication.gamearea;

import java.util.Scanner;

public class GameAreaView {
	private GameAreaViewModel viewModel;
	public GameAreaView()
	{
		this.viewModel=new GameAreaViewModel(this);
	}
	public void gameStart(int noOfPlayers, int m, int n) {
		boolean terminated=true;
		boolean win=false;
		while(terminated)
		{
			System.out.println("anu");
			for(int i = 0; i <noOfPlayers; i++)
			{
		        int randomNumber = (int) (Math.random() * 6) + 1;
				System.out.println("Player"+(i+1) +":  " +  randomNumber);
				win=viewModel.gameLogic(i+1,randomNumber,m,n);
				if(win)
				{
					terminated=false;
					break;
				}
			}
		}
	}
	

}
