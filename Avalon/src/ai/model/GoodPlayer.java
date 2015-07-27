package ai.model;

/**
 * Essa classe representa um jogador que está aliado a Arthur
 */
public class GoodPlayer extends Player
{
	public GoodPlayer(Object id)
	{
		super(id);
		// TODO Auto-generated constructor stub
	}

	/**
	 * O jogador 'bom' somente pode votar sucesso para missões
	 */
	@Override
	public MissionResult goMission(MissionTeam mission)
	{
		return MissionResult.SUCCESS;
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
