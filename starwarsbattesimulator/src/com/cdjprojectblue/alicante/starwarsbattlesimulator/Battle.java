package com.cdjprojectblue.alicante.starwarsbattlesimulator;


import java.util.List;

import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClases.BattleParticipant;

public class Battle {
	private List<BattleParticipant> empire;
	private List<BattleParticipant> rebels;
	public List<BattleParticipant> getEmpire() {
		return empire;
	}
	public List<BattleParticipant> getRebels() {
		return rebels;
	}
	
	
}
