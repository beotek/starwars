package com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.battleparticipant;

import com.cdjprojectblue.alicante.starwarsbattlesimulator.constants.BattleConstants;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClases.Infantry;
import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Factions;

public class Sith extends Infantry {

	public Sith() {
		super();
		// TODO Auto-generated constructor stub
		this.setPower(BattleConstants.INFANTRY_POWER);
		this.setFaction(Factions.EMPIRE);
		this.setHealth(BattleConstants.INFANTRY_HEALTH);
		this.setPointCost(BattleConstants.INFANTRY_COST);
	}

}
