package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	static int countPearls(List<Boolean> oysters) {
		int oysterWithPearl = 0;
		for (int i = 0; i < oysters.size(); i++) {
			Boolean oyster = oysters.get(i);
			if (oyster == true) {
				oysterWithPearl++;
			}
		}
		return oysterWithPearl++;
	}

	static double findTallest(List<Double> peeps) {
		Double max = peeps.get(0);
		for (int i = 1; i < peeps.size(); i++) {
			Double peep = peeps.get(i);
			if (peep > max) {
				max = peep;
			}
		}
		return max;
	}

	static String findLongestWord(List<String> words) {
		String max = words.get(0);
		for (int i = 1; i < words.size(); i++) {
			String word = words.get(i);
			if (word.length() > max.length()) {
				max = word;
			}
		}
		return max;
	}

	static Object containsSOS(List<String> messages) {
		Boolean contains = true;
		for (int i = 0; i < messages.size(); i++) {
			String message = messages.get(i);
			if (message.contains("... --- ...")) {
				return contains;
			}
		}
		return contains = false;
	}

	static List<Double> sortScores(List<Double> results) {
		Collections.sort(results);
		return results;
	}

	static Object sortDNA(List<String> unsortedSequences) {
		unsortedSequences.sort(Comparator.comparingInt(String::length));
		return unsortedSequences;
	}

	static List<String> sortWords(List<String> words) {
		words.sort(String::compareTo);
		return words;
	}
}
