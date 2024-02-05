package com.anushachandran1502.snakegamingapplication.base;

import java.util.*;

import com.anushachandran1502.snakegamingapplication.dto.Ladder;
import com.anushachandran1502.snakegamingapplication.dto.Player;
import com.anushachandran1502.snakegamingapplication.dto.Snake;
import com.anushachandran1502.snakegamingapplication.gamearea.GameAreaView;
import com.anushachandran1502.snakegamingapplication.gamearea.GameAreaViewModel;
import com.anushachandran1502.snakegamingapplication.dto.Position;

public class Base {
	static Scanner scanner;
	private List<Player> players;
	private List<Snake> snakes;
	private List<Ladder> ladders;
   	public void start()
	{
		Base base=new Base();
		scanner=new Scanner(System.in);
		System.out.println("Enter the board Size");
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		int[][] board=new int[m][n];
		snakes=new ArrayList<>();
		ladders=new ArrayList<>();
		System.out.println("Enter the no of Snakes");
		int noOfSnakes=scanner.nextInt();
		snakes=base.positionSnakesInputGet(scanner,noOfSnakes,snakes);
		System.out.println("Enter the no of ladders");
		int noOfLadders=scanner.nextInt();
		ladders=base.positionLaddersInputGet(scanner,noOfLadders,ladders);
		System.out.println(m +  ""+ n);
		System.out.println(snakes);
		System.out.println(ladders);
		System.out.println("Enter the no of players");
		int noOfPlayers=scanner.nextInt();
		players=new ArrayList<Player>();	
		players=positionPlayersInputGet(m,noOfPlayers,players);
		System.out.println("vvvv");
		GameAreaViewModel viewModel=new GameAreaViewModel(players,ladders,snakes);
		GameAreaView view =new GameAreaView();
		view.gameStart(noOfPlayers,m,n);
	}
	private List<Player> positionPlayersInputGet(int m,int noOfPlayers, List<Player> players) {
		for(int i = 0;i < noOfPlayers; i++ )
		 {
			players.add(new Player(i+1,new Position(m,0)));
		 }
		return players;
	}
	private List<Ladder>  positionLaddersInputGet(Scanner scanner, int noOfLadders, List<Ladder> ladders) {
		 for(int i = 0;i < noOfLadders; i++ )
		 {
			System.out.println("Enter the head position"); 
			Position head=new Position(scanner.nextInt(),scanner.nextInt());
			System.out.println("Enter the head Tail"); 
			Position tail=new Position(scanner.nextInt(),scanner.nextInt());
			ladders.add(new Ladder(head,tail));
		 }
		return ladders;
	}
	private List<Snake> positionSnakesInputGet(Scanner scanner, int noOfSnake, List<Snake> snakes) {
		 for(int i = 0;i < noOfSnake; i++ )
		 {
			System.out.println("Enter the head position"); 
			Position head=new Position(scanner.nextInt(),scanner.nextInt());
			System.out.println("Enter the head Tail"); 
			Position tail=new Position(scanner.nextInt(),scanner.nextInt());
			snakes.add(new Snake(head,tail));
		 }
		return snakes;
	}
}
