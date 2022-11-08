package drachental;

public class Spiel
{
	public static void main(String[] args)
	{
		Drache tabaluga = new Drache("Tabaluga der Schreckliche");
		tabaluga.zeigeDich();
		
		Opfer hansilein = new Feigling("Hans der Hansilein");
		Opfer merlin = new Zauberer("Merlin der Magier");
		Samurai katzushiro = new Samurai("Katzushiro Watanabe");
		Prinzessin maria = new Prinzessin("Maria die Hübsche");
		maria.vliste.add(katzushiro);

		Oger schreck = new Oger();
		maria.vliste.add(schreck);
		try
		{
			System.out.println("-------------------------");
			tabaluga.schnappeDich(maria);
			System.out.println("-------------------------");
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(merlin);
			
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(hansilein);
			tabaluga.schnappeDich(hansilein);
		}
		catch(DracheMausetotException e)
		{
			System.out.println("SPIEL ENDE WEIL DRACHE PFUTCH!!");
		}
	}
}
