package drachental;

public class Feigling extends Opfer
{

	public Feigling(String n)
	{
		name = n;
	}

	@Override
	public void schreie(Drache derVerursacher)
	{
		System.out.println(name +" sagt: MAMAAAA!!!  ICH HABE ANGST von "+ derVerursacher.getName()+ "!!");
		
	}

}
