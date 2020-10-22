public class Zodiac
{
	public static void main(String[] args)
	{
		byte dia, mes;
		dia=22;
		mes=4;

		if (dia<=0 || dia>31 || mes<=0 || mes>12)
		{
			System.out.println("Ingrese una fecha válida");
		}

		switch(mes)
		{
			case 1: if(dia>=21 && mes==3 || dia<=20 &&mes==4);
						System.out.println("Signo Aries");
					break;
			case 2: if(dia>=21 && mes==4 || dia<=20 &&mes==5);
				
						System.out.println("Signo Tauro");
					break;

		
		}


	}
}