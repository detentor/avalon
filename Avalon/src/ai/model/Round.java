package ai.model;

/**
 * Um 'round' é um conjunto de seleção de times e votação, até que alguma missão seja
 * efetivamente aceita e o seu resultado conhecido 
 */
public class Round
{
	 //O líder do round
	private Player leader;
	
	//O time escolhido para ir na missão
	private MissionTeam missionTeam;
	
	//O resultado dos votos
	private boolean voteResult;
	
	//O resultado da missão. Haverá apenas se o resultado dos votos for 'true'
	private MissionResult result;

	
	public Player getLeader()
	{
		return leader;
	}

	public MissionTeam getMissionTeam()
	{
		return missionTeam;
	}

	public boolean isVoteResult()
	{
		return voteResult;
	}

	public MissionResult getResult()
	{
		if (!voteResult)
		{
			throw new IllegalStateException("Foi requisitado o resultado de uma missão que não foi aprovada");
		}
		return result;
	}
}
