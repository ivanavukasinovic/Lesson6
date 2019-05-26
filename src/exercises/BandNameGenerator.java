package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {

	public static void main(String[] args) {

		ArrayList<String> adjectives = new ArrayList<String>();
		adjectives.add("Wonderful");
		adjectives.add("Mad");
		adjectives.add("Lost");
		adjectives.add("Silent");
		adjectives.add("Majestic");
		adjectives.add("Wild");
		adjectives.add("Hypnotic");
		System.out.println(adjectives);

		ArrayList<String> nouns = new ArrayList<String>();
		nouns.add("Men");
		nouns.add("Angels");
		nouns.add("Devils");
		nouns.add("Voices");
		nouns.add("Rebels");
		nouns.add("Things");
		nouns.add("Whisperers");
		System.out.println(nouns);

		for (int i = 0; i < 20; i++) {
			int random1 = new Random().nextInt(adjectives.size());
			int random2 = new Random().nextInt(nouns.size());
			System.out.println(adjectives.get(random1) + " " + nouns.get(random2));
		}

	}

}
