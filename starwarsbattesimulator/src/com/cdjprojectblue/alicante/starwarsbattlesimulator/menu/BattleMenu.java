package com.cdjprojectblue.alicante.starwarsbattlesimulator.menu;

import java.util.Scanner;

public class BattleMenu {

	private final String insertTheOptionYouWant = "Insert the option you want?";
	private final String separator = "************************************************************";

	private static BattleMenu battleMenu;

	public static BattleMenu getInstance() {
		if (battleMenu == null) {
			battleMenu = new BattleMenu();
		}
		return battleMenu;
	}

	private BattleMenu() {
	}

	public String play() {
		final StringBuilder option = new StringBuilder(BattleMenu.getInstance().getMainOption());
		switch (option.toString()) {
		case "0":
		case "4":
			return option.toString();
		default:
			final String submenuOption = BattleMenu.getInstance().getSubmenuOption(option.toString());
			if ("0".equals(submenuOption)) {
				this.play();
			} else {
				return option.append(".").append(submenuOption).toString();
			}

		}
		return option.toString();
	}

	private String getMainOption() {
		BattleMenu.getInstance().printMainMenu();
		Scanner in = new Scanner(System.in);
		Integer mainOption = in.nextInt();
		if (mainOption < 0 || mainOption > 4) {
			this.printError();
			return this.getMainOption();
		}
		return mainOption.toString();
	}

	private String getSubmenuOption(final String mainOption) {
		BattleMenu.getInstance().buildSubMenu(mainOption);
		Scanner in = new Scanner(System.in);
		Integer subMenuOption = in.nextInt();
		if (subMenuOption < 0 || subMenuOption > 2) {
			this.printError();
			return this.getSubmenuOption(mainOption);
		}
		return subMenuOption.toString();
	}

	private void printMainMenu() {
		this.clearScreen();
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(separator).append("\n");
		stringBuilder.append("MAIN MENU").append("\n");
		stringBuilder.append(separator).append("\n");
		stringBuilder.append("1. Create Teams").append("\n");
		stringBuilder.append("2. Show Teams").append("\n");
		stringBuilder.append("3. Delete Teams").append("\n");
		stringBuilder.append("4. FIGHT").append("\n");
		stringBuilder.append("0. Exit").append("\n");
		stringBuilder.append(separator).append("\n");
		stringBuilder.append(insertTheOptionYouWant).append("\n");
		System.out.println(stringBuilder.toString());
	}

	private void printError() {
		System.out.println("ERROR!!");
	}

	private void buildSubMenu(final String subMenu) {
		switch (subMenu) {
		case "1":
			createTeamsMenu();
			break;
		case "2":
			printTeamsMenu();
			break;
		case "3":
			deleteTeamMenu();
			break;
		case "4":
			System.out.println("mete la opci�n");
			break;
		default:
			printError();
			break;
		}
	}

	private void createTeamsMenu() {
		this.printSubMenu("CREATE TEAMS");
	}

	private void printTeamsMenu() {
		this.printSubMenu("MOSTRAR EQUIPO");
	}

	private void deleteTeamMenu() {
		this.printSubMenu("BORRAR EQUIPO");
	}

	private void clearScreen() {
		// try {
		// Runtime.getRuntime().exec("cls");
		// } catch (IOException e) {
		// throw new RuntimeException(e);
		// }
	}

	private void printSubMenu(final String subMenu) {
		this.clearScreen();
		final StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(separator).append("\n");
		stringBuilder.append(subMenu.toUpperCase()).append("\n");
		stringBuilder.append(separator).append("\n");
		stringBuilder.append("1. REBEL").append("\n");
		stringBuilder.append("2. EMPIRE").append("\n");
		stringBuilder.append("0. Out").append("\n");
		stringBuilder.append(separator).append("\n");
		stringBuilder.append(insertTheOptionYouWant).append("\n");
		System.out.println(stringBuilder.toString());
	}

}
