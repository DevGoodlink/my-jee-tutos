package cards;

import java.io.BufferedReader;
import java.io.FileReader;

public class cardsBattle {
	public static void main(String[] args) {
		try {
			// System.out.println(Character.getNumericValue('A'));
			BufferedReader br = new BufferedReader(new FileReader("stdin.txt"));// System.in));
			int cases = Integer.parseInt(br.readLine());
			for (int j = 0; j < cases; j++) {
				int distributedCard = Integer.parseInt(br.readLine());
				String[] placedCardAmine = br.readLine().split(" ");
				String[] amalCards = br.readLine().split(" ");
				int gain = 0;
				for (int i = 0; i < distributedCard; i++) {
					for (int k = 0; k < distributedCard; k++) {
						
						if (amalCards[k].charAt(0)==placedCardAmine[i].charAt(0)) {
							if(conversion(amalCards[k].charAt(1)) > conversion(placedCardAmine[i].charAt(1))) gain++;

						}else{
							if (conversion(amalCards[k].charAt(0)) > conversion(placedCardAmine[i].charAt(0))) {
								gain++;
							}
						}
							
						

					}

				}
				System.out.println(gain);

			}
			//System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int conversion(char c) {
		switch (c) {
		case 'H':
			return 4;
		case 'S':
			return 3;
		case 'D':
			return 2;
		case 'C':
			return 1;
		case 'T':
			return 10;
		case 'J':
			return 11;
		case 'Q':
			return 12;
		case 'K':
			return 13;
		case 'A':
			return 14;

		}
		return Character.getNumericValue(c);
	}

}
