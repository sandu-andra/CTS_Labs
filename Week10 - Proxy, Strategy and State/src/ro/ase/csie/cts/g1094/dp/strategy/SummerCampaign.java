package ro.ase.csie.cts.g1094.dp.strategy;

public class SummerCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += (1.5 * points);
		
	}

}
