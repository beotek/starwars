package com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.abstractClases;

import com.cdjprojectblue.alicante.starwarsbattlesimulator.modelo.enums.Factions;

public abstract class  BattleParticipant {
	
	private int power;
	private int pointCost;
	private Factions faction;
	private int health;
	
	int getPower() {
		return this.power;
	}
	boolean isAlive() {
		return this.health>0;
	}
	Factions getFaction() {
		return this.faction;
	}
	public int getPointCost() {
		return this.pointCost;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void receiveDamage(int damage) {
	this.health-=damage;
	}
	protected void setPower(int power) {
		this.power = power;
	}
	protected void setPointCost(int pointCost) {
		this.pointCost = pointCost;
	}
	protected void setFaction(Factions faction) {
		this.faction = faction;
	}
	
	
}
