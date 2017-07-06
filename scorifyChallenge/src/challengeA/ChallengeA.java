package challengeA;

import java.io.BufferedReader;
import java.io.FileReader;

public class ChallengeA {

	public static void main(String[] args)throws Exception {
		try{
	        BufferedReader br = new BufferedReader(new FileReader("inA.txt"));//new InputStreamReader(System.in));
	        //byte nbr = Byte.parseByte();
	        br.readLine();
	        while (br.ready()) {
				//System.out.println(br.readLine());
				String ligne=br.readLine();
				int heure=Integer.parseInt(ligne.split(":")[0]);
				String tz=ligne.split("\\s+")[1];
				if (tz.length()>1) 
				{
					int ajust=Integer.parseInt(""+tz.charAt(1));
					String display = ":"+ligne.split(":")[1]+":"+ligne.split(":")[2].substring(0,2);
					if (tz.charAt(0)=='+') 
					{
						heure=heure+ajust;
						if (heure<=9) {
							System.out.println("0"+heure+display);
						}
						if(heure>9 && heure<24)
						{
							System.out.println(heure+display);
						}
						if (heure>=24) {
							heure=heure%24;
							System.out.println("0"+heure+display);
						}
						
					}
					if (tz.charAt(0)=='-') {
						heure=heure-ajust;
						if (heure<0) 
						{
							heure=24-heure;
							if (heure>=0 && heure<10)
							{
								System.out.println("0"+heure+display);
							}
							else
							if(heure>10)
							{
								System.out.println(heure+display);
							}
						}
						else
						{
							if (heure>23) {
								heure=heure-24;	
							}
							if (heure>=0 && heure<10)
							{
								System.out.println("0"+heure+display);
							}
							else
							if(heure>10)
							{
								System.out.println(heure+display);
							}
						}
					}
				}
				else
				{
					System.out.println(ligne.substring(0, 8));
				}
			}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
