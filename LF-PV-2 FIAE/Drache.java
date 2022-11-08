package drachental;

import java.util.ArrayList;

public class Drache
{

	private String name;
	public String getName()
	{
		return name;
	}

	private boolean hungrig = true;
	private int lebenskraft =10;
	public ArrayList<String> ungezieferListe = new ArrayList<>();

	public Drache(String n)
	{
		name =n;
	}

	public void zeigeDich()
	{
		grunze("ich bin ein Drache..");
		if(hungrig )
		{
			grunze("und ich bin HUNGRIG!!");
		}
		else
		{
			grunze("Kein Hunger... gaehhhn...");
		}
		
	}

	private void grunze(String text)
	{
		System.out.println(name + " grunz "+ text);
		
	}

	public void schnappeDich(Opfer dasArmeSchwein) throws DracheMausetotException
	{
		if(lebenskraft>0)
		{
			for(int i =0; i < ungezieferListe.size(); i++)
			{
				grunze("kratz kratz... verfluchte Ungeziefer!!");
			}
			grunze("Lecker... der " + dasArmeSchwein.name);
			grunze(dasArmeSchwein.name+ " .. du muss etwas schreien!.. so bist du noch leckerer!");
			dasArmeSchwein.schreie(this);
			grunze("RÜLPS... Mahlzeit!");
		}
		else
		{
			grunze("ich bin mausetot!");
			throw new DracheMausetotException();
		}
	}

	public void steckeSchlagEin(int i)
	{
		grunze("AUTCH!!");
		lebenskraft = lebenskraft -i;
		
	}

}
