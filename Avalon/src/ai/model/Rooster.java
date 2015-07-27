package ai.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Contém todos os jogadores atualmente numa partida
 */
public class Rooster
{
	private List<Player> players;
	
	
	/**
	 * Retorna uma cópia da lista de jogadores numa partida
	 * @return
	 */
	public List<Player> getPlayers()
	{
		return new ArrayList<Player>(players);
	}

}
