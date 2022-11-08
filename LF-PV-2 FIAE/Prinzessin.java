package drachental;

import java.util.ArrayList;

public class Prinzessin extends Opfer
{
	ArrayList<Verehrer> vliste = new ArrayList<>();
	public Prinzessin(String n)
	{
		name =n;
	}

	@Override
	public void schreie(Drache derVerursacher)
	{
		System.out.println(name + " sagt: "+ derVerursacher.getName()+ " ... du bist blöd...");
		System.out.println(name + " sagt:ich rufe meine Verehrer!!");
		for(Verehrer v : vliste)
		{
			v.schlagDenDrachen(derVerursacher);
		}

	}

}
