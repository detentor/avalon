package ai.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Contém todos os jogadores atualmente numa partida
 */
public class Rooster
{
	private final List<Player> players = new ArrayList<Player>();
	
	/**
	 * Adiciona um jogador para um conjunto de jogadores
	 * @param player O jogador a ser adicionado
	 * @return A referência a esta classe, após a adição do jogador
	 */
	public Rooster addPlayer(final Player player)
	{
		players.add(player);
		return this;
	}
	
	/**
	 * Retorna uma cópia da lista de jogadores numa partida
	 * @return
	 */
	public List<Player> getPlayers()
	{
		return new ArrayList<Player>(players);
	}
}
