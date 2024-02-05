package com.anushachandran1502.snakegamingapplication.dto;

public class Ladder {
	private Position head;
	private Position tail;

	public Position getHead() {
		return head;
	}
	public void setHead(Position head) {
		this.head = head;
	}
	public Position getTail() {
		return tail;
	}
	public void setTail(Position tail) {
		this.tail = tail;
	}
	public Ladder(Position head, Position tail) {
		this.head=head;
		this.tail=tail;
	}
	public String toString()
	{
		return head.getX() +" "+ head.getY() +" "+tail.getX() +" "+tail.getY();
	}
	
	
}
