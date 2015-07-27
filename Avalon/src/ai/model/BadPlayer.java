package ai.model;

/**
 * Essa classe representa um jogador que está aliado a Mordred.
 */
public class BadPlayer extends Player
{
	public BadPlayer(Object id)
	{
		super(id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Os jogadores do mal podem saber a qualquer momento qual é a aliança de um determinado jogador
	 * @param player O jogador cuja aliança será consultada
	 * @return A aliança do jogador passado como parâmetro
	 */
	public Allegiance queryAllegiance(final Player player)
	{
		return player instanceof GoodPlayer ? Allegiance.ARTHUR : Allegiance.MORDRED;
	}

	/**
	 * O jogador do mal pode votar o resultado que desejar para uma determinada missão
	 */
	@Override
	public MissionResult goMission(final MissionTeam mission)
	{
		return null;
	}

	@Override
	public MissionTeam chooseTeam(Rooster players, int numToChoose)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean voteForMission(MissionTeam mission)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
