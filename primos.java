public class Primos
{
	public static void main(String[] args)
	{
		int i=453;
		int contador=1;
		int div=0;

		for(i=453; i<=3500; i++)
		{
			for(contador=1; contador<=i; contador++)
			{
				if(i%contador==0)
				{
					div++; //de aquí saco cuántos divisores tiene el número (se debe probar con todos los del for)
				}
			}
			if(div==2)
			{
				System.out.println(i);
			}
			div=0; //reiniciar la cuenta 
		}
	}
}



