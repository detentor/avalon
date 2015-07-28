package ai.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Uma partida é uma sucessão de rounds
 */
public class Match
{
	//Guarda todos os rounds da partida
	private final List<Round> rounds = new ArrayList<Round>();
	
	//Guarda o vitorioso da partida
	private Allegiance victory;
	
	private Rooster rooster;
	
	public Match()
	{
		rooster = new Rooster();
		
		rooster.addPlayer(Player.create(true, 1));
		rooster.addPlayer(Player.create(true, 2));
		rooster.addPlayer(Player.create(true, 3));
		rooster.addPlayer(Player.create(false, 4));
		rooster.addPlayer(Player.create(false, 5));
	}
	
	//TODO:
	public Match generateRound()
	{
		
		return this;
	}
	
}

