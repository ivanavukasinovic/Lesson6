package exercises;

import java.util.ArrayList;

public class Decorator {

	public static void main(String[] args) {

		ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();

		for (int i = 0; i < 10; i++) {
			Ornament ornament = new Ornament();
			boxOfDecorations.add(ornament);
			boxOfDecorations.get(i).hang();
		}

	}

}
