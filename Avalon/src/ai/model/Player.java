package ai.model;

/**
 * Representa um jogador do jogo
 */
public abstract class Player
{
	//Um identificador para o jogador
	protected final Object id;
	
	protected Player(Object id)
	{
		super();
		this.id = id;
	}

	/**
	 * Cria um jogador do tipo passado como parâmetro
	 * @param isGood Se o jogador deve ser bom
	 * @param playerId O identificador do jogador
	 * @return Uma instância de jogador do tipo passado como parâmetro
	 */
	public static Player create(final boolean isGood, final Object playerId)
	{
		return isGood ? new GoodPlayer(playerId) : new BadPlayer(playerId); 
	}

	/**
	 * Escolhe um número de jogadores para ir numa missão, a partir do rooster (time)
	 * @param players O time de jogadores do qual pode-se escolher
	 * @param numToChoose O número de jogadores a serem escolhidos
	 * @return Um time a ser enviado para a missão
	 */
	public abstract MissionTeam chooseTeam(final Rooster players, final int numToChoose);
	
	/**
	 * Decide se uma determinada missão deve ou não ir
	 * @param mission A missão a ser votada
	 * @return Um boolean com a informação do voto para a missão prosseguir (ou não)
	 */
	public abstract boolean voteForMission(final MissionTeam mission);
	
	/**
	 * Vai, efetivamente, para uma missão
	 * @param mission A missão a ser ida
	 * @return O resultado de uma missão
	 */
	public abstract MissionResult goMission(final MissionTeam mission);
	
	/**
	 * Retorna o identificador para o jogador
	 * @return O identificador do jogador
	 */
	public Object getId()
	{
		return id;
	}
}
