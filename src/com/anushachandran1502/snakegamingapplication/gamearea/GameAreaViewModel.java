package com.anushachandran1502.snakegamingapplication.gamearea;

import java.util.ArrayList;
import java.util.List;

import com.anushachandran1502.snakegamingapplication.base.Base;
import com.anushachandran1502.snakegamingapplication.dto.Ladder;
import com.anushachandran1502.snakegamingapplication.dto.Player;
import com.anushachandran1502.snakegamingapplication.dto.Snake;

public class GameAreaViewModel {
	private GameAreaView view;
    private List<Player> players;
    private List<Snake> snakes;
    private List<Ladder> ladders;
	public GameAreaViewModel(GameAreaView gameAreaView) {
		this.view=gameAreaView;
	}
	public GameAreaViewModel(List<Player> players, List<Ladder> ladders, List<Snake> snakes) {
		this.snakes=snakes;
		this.ladders=ladders;
		this.players=players;
		System.out.println(snakes);
		System.out.println(ladders);
	}
	public boolean gameLogic(int player, int randomNumber, int m, int n) {
		System.out.println(snakes);
		System.out.println(ladders);
		System.out.println(players);
		return false;
	}

}
