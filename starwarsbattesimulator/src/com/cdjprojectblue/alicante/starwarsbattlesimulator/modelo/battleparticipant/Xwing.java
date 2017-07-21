package com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdjprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClases.AirMachine;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Factions;

public class Xwing extends AirMachine{

	public Xwing() {
		super();
		this.setPower(BattleConstants.AIR_POWER);
		this.setFaction(Factions.REBELS);
		this.setHealth(BattleConstants.AIR_HEALTH);
		this.setPointCost(BattleConstants.AIR_COST);
	}
	
}
