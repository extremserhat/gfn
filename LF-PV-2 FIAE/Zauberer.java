package drachental;

public class Zauberer extends Opfer
{

	public Zauberer(String n)
	{
		name = n;
	}

	@Override
	public void schreie(Drache derVerursacher)
	{
		System.out.println(name + " sagt:"+ derVerursacher.getName()+ " ... du hast ein Fehler gemacht.. ich bin ein Zauberer!");
		System.out.println(name + " sagt: ABRAKADABRA!!");
		derVerursacher.ungezieferListe.add("einFloh");
		
	}

}
