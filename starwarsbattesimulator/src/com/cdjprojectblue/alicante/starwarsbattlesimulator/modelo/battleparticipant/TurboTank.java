package com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdjprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClases.EarthMachine;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Factions;

public class TurboTank extends EarthMachine{

	public TurboTank() {
		super();
		this.setPower(BattleConstants.EARTH_POWER);
		this.setFaction(Factions.REBELS);
		this.setHealth(BattleConstants.EARTH_HEALTH);
		this.setPointCost(BattleConstants.EARTH_COST);
	}

	
}
