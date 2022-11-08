package drachental;

public class Samurai extends Opfer implements Verehrer
{

	public Samurai(String n)
	{
	  name = n;
	}

	@Override
	public void schreie(Drache derVerursacher)
	{
		System.out.println(name + " sagt:bloede "+ derVerursacher.getName());
		System.out.println(name + "sagt: du kriegst eine auf die Rübe!!");
		derVerursacher.steckeSchlagEin(5);
		
	}

	@Override
	public void schlagDenDrachen(Drache d)
	{
		System.out.println("FUER DIE PRINZESSIN!!");
		d.steckeSchlagEin(4);
	}

}
