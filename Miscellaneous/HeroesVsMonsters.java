package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class HeroesVsMonsters {
	public static List<Integer> findMonstersLeft(int monsters[][], int heroes[][]) {
		int numMonsters = 0;
		List<Integer> list = new ArrayList<>();
		for (int[] e : monsters) {
			for (int i = e[0]; i <= e[1]; i++) {
				numMonsters++;
			}
		}
		for (int i = 0; i < heroes.length; i++) {
			for (int j = 0; j < monsters.length; j++) {
				if (heroes[i][0] <= monsters[j][1] && heroes[i][1] > monsters[j][2]) {
					numMonsters--;
				}
			}
			list.add(numMonsters);
		}
		return list;
	}

	public static void main(String[] args) {
		int[][] monsters = { { 1, 3, 7 }, { 2, 5, 4 }, { 4, 8, 6 } };
		int[][] heroes = { { 3, 5 }, { 5, 8 } };
		System.out.println(findMonstersLeft(monsters, heroes));
	}

}
