
public class Bandera{
	public static void main(String[] args)
	{
		char matriz1[][]; //Declaración
		matriz1= new char[4][12]; //Inicialización

		//Haremos  la primera franja
		for(int i=0; i<matriz1.length; i++)

		{
			System.out.print(ConsoleColors.YELLOW_BACKGROUND );
			for(int j=0; j<matriz1[0].length; j++)
			{
					
			}
			System.out.println("");
		}



		char matriz2[][]; //Declaración
		matriz2 = new char[4][12]; // Inicialización

		//Haremos  la segunda franja

				//matriz2[0][5]='*';
				//matriz2[0][6]='*';
				//matriz2[1][4]='*';
				//matriz2[1][7]='*';
				//matriz2[2][3]='*';
				//matriz2[2][8]='*';
				//matriz2[3][2]='*';
				//matriz2[3][9]='*';
			for(int i=0; i<matriz2.length; i++)

			{
				System.out.print(ConsoleColors.BLUE_BACKGROUND);
				for(int j=0; j<matriz2[0].length; j++)
				{
					matriz2[i][j]='R';
				}
					System.out.println("");
			}


			 for (int i=0;i<matriz2.length ;i++ ) 
			 {

		 		for (int j=0;j<matriz2[0].length ;j++ ) 
		 		{
			 		//System.out.print(matriz[i][j]+" ");
			 		if(matriz2[i][j]=='R')
			 		{
			 			System.out.print("*");
			 		}
			 	}
			}


			char matriz3[][]; //Declaración
			matriz3 = new char[4][12]; // Inicialización

		//Haremos la tercera franja
		for(int i=0; i<matriz3.length; i++)

		{
			System.out.print(ConsoleColors.RED_BACKGROUND );
			for(int j=0; j<matriz3[0].length; j++)
			{
					
			}
			System.out.println("");

		}
		System.out.print(ConsoleColors.RESET);
	}
}