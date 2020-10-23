//para interfaces y clases
	import java.util.*;
	import java.util.Arrays; 

public class Juego

{ public static void imprimirFila(String fila[]) //darle colores a las matrices de números que hicimos
	{
		for (int i=0;i<fila.length;i++) {
			
	 		if(fila[i].equals("1"))
	 		{
	 			System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("2"))
	 		{
	 			System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("3"))
	 		{
	 			System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
	 		}
	 		if(fila[i].equals("4"))
	 		{
	 			System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
	 		}		 		
		}
		System.out.println(ConsoleColors.RESET);
	}
	public static void imprimirGraficoBandera(String[] banderas, int indice)
	{
		for (int i=indice;i<indice+20;i++ ) //las matrices de las banderas avanzan de a 20
		{
			imprimirFila(banderas[i].split(";"));
		}
			
	}



	public static void separador()
	{
		
		System.out.println(ConsoleColors.BLUE+"_  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _ _  _  _  _  _  _ "+ConsoleColors.RESET);
		System.out.println();
		System.out.println(ConsoleColors.CYAN+"| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| /|| || /|| /|| /|| /|| "+ConsoleColors.RESET);
		System.out.println(ConsoleColors.BLUE+"_  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _  _"+ConsoleColors.RESET);
	}
	
	public static void correcto()
	{
		System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + "                            "+ConsoleColors.RESET);
		System.out.println(ConsoleColors.GREEN_BOLD+"########  #### ######## ##    ##");
		System.out.println(ConsoleColors.GREEN_BOLD+"##     ##  ##  ##       ###   ##");
		System.out.println(ConsoleColors.GREEN_BOLD+"##     ##  ##  ##       ####  ##");
		System.out.println(ConsoleColors.GREEN_BOLD+"########   ##  ######   ## ## ##");
		System.out.println(ConsoleColors.GREEN_BOLD+"##     ##  ##  ##       ##  ####");
		System.out.println(ConsoleColors.GREEN_BOLD+"##     ##  ##  ##       ##   ###");
		System.out.println(ConsoleColors.GREEN_BOLD+"########  #### ######## ##    ## "+ConsoleColors.RESET);
		System.out.println(ConsoleColors.GREEN_BACKGROUND_BRIGHT + "                            "+ConsoleColors.RESET);
	}

	public static void incorrecto()
	{
		System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "            "+ConsoleColors.RESET);
		System.out.println(ConsoleColors.RED+""+"##     ## ");
		System.out.println(ConsoleColors.RED+" "+"##   ##  ");
		System.out.println(ConsoleColors.RED+"  "+"## ##  ");
		System.out.println(ConsoleColors.RED+"   "+"###  ");
		System.out.println(ConsoleColors.RED+"  "+"## ## ");
		System.out.println(ConsoleColors.RED+""+" ##   ##");
		System.out.println(ConsoleColors.RED+""+"##     ##"+ConsoleColors.RESET);
		System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "             "+ConsoleColors.RESET);	
	}
	
	public static void jugar()
	{	
		
		
		
     
		System.out.print(ConsoleColors.CYAN_BACKGROUND+"                                         ");
		System.out.println(ConsoleColors.RESET);

		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"      _____                         ");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"    _|     |.--.--.-----.---.-.----.");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"   |       ||  |  |  _  |  _  |   _|");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"   |_______||_____|___  |___._|__|  ");
		System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"                  |_____|        ");
		System.out.println(ConsoleColors.RESET);
		System.out.print(ConsoleColors.CYAN_BACKGROUND+"                                         ");
		System.out.println(ConsoleColors.RESET);

		
		


		System.out.println();
		String banderas[] = ConsoleFile.read("info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);
		System.out.println();	
		System.out.println();	
		System.out.println();	
		System.out.println("Por ser tu primer intento, te dejaremos escoger el país");	
		System.out.println("que quieres visitar, puedes escoger uno de estos tres:");
		System.out.println("¿Qué país quieres visitar?");
		System.out.println("Selecciona: ");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ " Perú");
		imprimirGraficoBandera(banderas, indices[2]);
		System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ " Colombia");
		imprimirGraficoBandera(banderas, indices[1]);
		System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ " Noruega ");
		imprimirGraficoBandera(banderas, indices[7]);
		System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+ " Japon ");
		imprimirGraficoBandera(banderas, indices[11]);

		int centinela_;
		boolean bandera;
		boolean bandera3;
		do
		{	
			System.out.println("Ingresa un número: ");
			centinela_ = ConsoleInput.getInt();
			int centinela2;
				switch(centinela_)
			{
				
				case 1:	
						
						System.out.println("A la firme compadre, bienvenido a Perú. Empecemos suave," + ConsoleColors.RED+ConsoleColors.RESET);
						imprimirGraficoBandera(banderas, indices[2]);
						System.out.println("Estás en Machu Picchu y hace mucho calor, pasas por una heladería");
						System.out.println("después de 4 horas caminando,");
						System.out.println("¿Qué sabor de helado escoges para no morirte del calor?");
						System.out.println("Escoge uno: ");
						System.out.println("1. Mora");
						System.out.println("2. Fresa");
						
						do
						{	
							System.out.println("");
							centinela2= ConsoleInput.getInt();
							switch(centinela2)
							{
								case 1: correcto();
								break;
								case 2: incorrecto();
								break;
							}
							bandera3=false;
						}while(bandera3);
						break;
				case 2: 
						System.out.println("Que más pues parcero, bienvenido a Colombia."+ConsoleColors.GREEN+ConsoleColors.RESET);
						imprimirGraficoBandera(banderas, indices[1]);
						System.out.println("Vamos a empezar con una pregunta facilita");
						System.out.println("Estás en Santa Marta de paseo, son las 6 de la tarde y estás aburrido");
						System.out.println("¿Qué te pones a hacer?");
						System.out.println("1. Relajo");
						System.out.println("2. Jugar");


						do
						{	
							centinela2=ConsoleInput.getInt();
							switch(centinela2)
							{
								case 1: correcto();
										break;
								case 2:	incorrecto();
										break;
							}
							bandera3=false;
						}while(bandera3);
						break;
				case 3: 
						System.out.println("Bienvenido a Noruega");
						imprimirGraficoBandera(banderas, indices[7]);
						System.out.println("Te estás hospedando en un hotel en Oslo,");
						System.out.println("mañana tienes que viajar a una ciudad que queda a 7 horas de la capital");
						System.out.println("¿qué deberías hacer?");
						System.out.println("1. Vacilar");
						System.out.println("2. Preocuparte");
						
						do
						{	
							centinela2=ConsoleInput.getInt();
							switch(centinela2)
							{
								case 1: correcto();
										break;
								case 2: incorrecto();
										break;
							}
							bandera3=false;
						}while(bandera3);
						break;
				case 4: 
						System.out.println("Bienvenido a Japon"+ConsoleColors.RED+ConsoleColors.RESET);
						imprimirGraficoBandera(banderas, indices[11]);
						System.out.println("En Tokio hay un complejo sistema de transporte, y tu");
						System.out.println("como turista estas desubicado en la megaciudad, no sabes cual");
						System.out.println("es el autobus que tienes que tomar para regresar al hotel.");
						System.out.println("El gran problema es que no sabes hablar japonés");
						System.out.println("¿Qué haces para conseguir llegar al hotel?");
						System.out.println("1. Bebes");
						System.out.println("2. Bailas");
						
				        do
				        {
							centinela2=ConsoleInput.getInt();
							switch(centinela2)
				        	{
								case 1: correcto();
										break;
								case 2: incorrecto();
										break;
							}
							bandera3=false;
				        }while(bandera3);
						break;
				default: System.out.println("Opcion no disponible");
						break;
			}
			bandera=false;

		}while(bandera);
		separador();
		System.out.println();
		System.out.println("Siguiente destino");
		System.out.println("Escoge una actividad que quieras realizar después de turistear: ");
		System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ "Pedir un Uber");
		System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ "Ir al supermercado");
		System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ " "+ConsoleColors.RED+ "NETFLIX"+ConsoleColors.RESET+ " and chill");
		System.out.println();
		System.out.println("Ingresa un número");
		int entrada;
		boolean bandera_;
		entrada = ConsoleInput.getInt();
		int opcion;
		do
		{
			switch(entrada)
			{
				case 1:	
				
				
				imprimirGraficoBandera(banderas, indices[0]);
				System.out.println();	
				System.out.println();	
				System.out.println();
				System.out.println("Llegas a gran Gran Bretaña y cuentas con este gran problema");
				imprimirGraficoBandera(banderas, indices[0]);
				System.out.println("Tienes 11 % de batería en tu telefono" + ConsoleColors.GREEN);
				System.out.println("¿Que vas a hacer?: ");
				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Devolverse");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Comer trucha");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" Irse a caballo");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+" Preocuparte");
				
				boolean bandera2;
				do
				{	
					System.out.println("Ingresa: ");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: incorrecto();
								break;
						case 2: correcto();
								break;
						case 3: incorrecto();
								break;
						case 4: correcto();
								break;
						default: System.out.println("Opcion no permitida");
	
					}
					bandera2=false;
					
				}while(bandera2);
				   break;
				case 2: 

				
				imprimirGraficoBandera(banderas, indices[8]);
				System.out.println();	
				System.out.println();	
				System.out.println();
				System.out.println("Se te ha asignado la bandera de Isla de Pascua");
				System.out.println("Solo tienes $12 para comprar en el supermercado,"+ConsoleColors.RESET);
				System.out.println("tienes las siguientes opciones: ");

				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+ "Comprar arroz");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+ "Comprar leche");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+ "Comprar banano");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+ "Llorar porque no te alcanza el dinero");

				do
				{	

					System.out.println("¿Qué debes comprar?");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: correcto();
								break;
						case 2: correcto();
								break;
						case 3: incorrecto();
								break;
						case 4: incorrecto();
								break;
						default: System.out.println("Opcion incorrecta");
	
					}
					bandera2=false;
					
				}while(bandera2);
				   break;
				case 3:
				imprimirGraficoBandera(banderas, indices[12]);
				System.out.println();	
				System.out.println();	
				System.out.println();	
				System.out.println("Bienvenido a Aland. Como acabas de llegar a un pais") ;
				System.out.println("nuevo y no conoces a nadie, prefieres verte una película.");
				System.out.println("Solo tienes 5 películas para escoger:");
				System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Ironman");
				System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Duel");
				System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" 300");
				System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+"Antman");
				System.out.println(ConsoleColors.YELLOW+"5."+ConsoleColors.RESET+" Dumbo");
				

				do
				{	

					System.out.println("Ingresa: ");
					opcion = ConsoleInput.getInt();
					switch(opcion)
					{
						case 1: incorrecto();
								break;
						case 2: incorrecto();
								break;
						case 3: incorrecto();
								break;
						case 4: incorrecto();
								break;
					    case 5: correcto();
								break;
						default: System.out.println("Opcion no disponible");
								break;
					}
					bandera2=false;
					
				}while(bandera2);

				break;
				default: System.out.println("Opcion no disponible");
				break;
			}
			bandera_=false;
		}while(bandera_);
		separador();

		imprimirGraficoBandera(banderas, indices[18]);
		System.out.println();
		System.out.println("Siguiente destino");
		System.out.println();
		System.out.println("En este país asesinaron al presidente, ");
		System.out.println("son seis los sospechosos de haber cometido este crimen:");
		System.out.println("¿Quién mató al presidente?");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"1."+ ConsoleColors.RESET+" Sargento");
		System.out.println(ConsoleColors.YELLOW+"2."+ ConsoleColors.RESET+" Doctor");
		System.out.println(ConsoleColors.YELLOW+"3."+ ConsoleColors.RESET+" Abogado");
		System.out.println(ConsoleColors.YELLOW+"4."+ ConsoleColors.RESET+" Ingeniero");
		System.out.println(ConsoleColors.YELLOW+"5."+ ConsoleColors.RESET+" Xaca Rana");
		System.out.println(ConsoleColors.YELLOW+"6."+ ConsoleColors.RESET+" Felipe");


		do
		{		
			System.out.println("Ingresa un número");
			centinela_ = ConsoleInput.getInt();
				switch(centinela_)
				{
				case 1:	incorrecto();
						break;
				case 2: correcto();
						break;
				case 3: incorrecto();
						break;
				case 4: incorrecto();
						break;
				case 5: incorrecto();
						break;
				case 6: correcto();
						break;
				default: System.out.println("Opcion no disponible");
						break;
				}
				bandera = false;
		}while(bandera);

		separador();
		//Cuba penúltima pregunta
			imprimirGraficoBandera(banderas, indices[20]);
		System.out.println();
		System.out.println("Estamos por terminar el tour");
		System.out.println();
		System.out.println("Cuba es un país poco industrializado debido a su estructura política, ");
		System.out.println("incluso muchos insumos básicos no son fácil de conseguir,:");
		System.out.println("pero como buen viajero debes estar preparado para todo");
		System.out.println("Elige qué llevarías contigo para no morir en el intento");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"1."+ ConsoleColors.RESET+"Curitas, agua embotellada,botiquín de primeros auxilios,unguento antibiotico");
		System.out.println(ConsoleColors.YELLOW+"2."+ ConsoleColors.RESET+"Cables para pasar corriente, Vendas, Aspirinas, Paquete de datos");
		System.out.println(ConsoleColors.YELLOW+"3."+ ConsoleColors.RESET+"Agua oxigenada, Toallas de alcohol, Rollos de gaza, Pinzas");



		do
		{		
			System.out.println("Ingresa un número");
			centinela_ = ConsoleInput.getInt();
				switch(centinela_)
				{
				case 1:	correcto();
						break;
				case 2: incorrecto();
						break;
				case 3: incorrecto();
						break;
				default: System.out.println("Opcion no disponible");
						break;
				}
				bandera = false;
		}while(bandera);
		separador();
		//Seychelles última pregunta

		imprimirGraficoBandera(banderas, indices[14]);
		System.out.println();
		System.out.println("LLegamos a nuestro destino final");
		System.out.println();
		System.out.println("Esta isla se caracteriza por ser tierra de piratas");
		System.out.println("es el destino elegido para esconder tesoros invaluables");
		System.out.println("Cuál piedra es la que más predomina en Seychelles?");
		System.out.println();
		System.out.println(ConsoleColors.YELLOW+"1."+ ConsoleColors.RESET+"Rubi");
		System.out.println(ConsoleColors.YELLOW+"2."+ ConsoleColors.RESET+"Espinela");
		System.out.println(ConsoleColors.YELLOW+"3."+ ConsoleColors.RESET+"Ambar");
		System.out.println(ConsoleColors.YELLOW+"4."+ ConsoleColors.RESET+"Granate");



		do
		{		
			
			centinela_ = ConsoleInput.getInt();
				switch(centinela_)
				{
				case 1:incorrecto();
						break;
				case 2: correcto();
						break;
				case 3: incorrecto();
						break;
				case 4: incorrecto();
						break;
				default: System.out.println("Opcion no disponible");
						break;
				}

				if (centinela_==2)
				{
					System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"+-++-+ +-++-++-++-++-++-++-++-+"+ConsoleColors.RESET);
					System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"|L||O| |L||O||G||R||A||S||T||E|"+ConsoleColors.RESET);
					System.out.println(ConsoleColors.CYAN_BOLD_BRIGHT+"+-++-+ +-++-++-++-++-++-++-++-+ "+ConsoleColors.RESET);
				}
				else
				{
					menu();
				}

				bandera = false;
		}while(bandera);













		System.out.println("FIN DEL JUEGO");
		

	

		


		/*a = ConsoleInput.getString();
		b =	ConsoleInput.getString();
		c =	ConsoleInput.getString();
		d =	ConsoleInput.getString();*/

		

		//System.out.println(a); //
	}
	public static void instrucciones()
	{
		System.out.println("No todo es lo que parece");
		System.out.println();
		System.out.println("Piensa antes de responder");
		System.out.println("El juego acaba cuando descubras el acertijo");
		menu();

		
	}
	public static void acerca_de()
	{
	System.out.println(ConsoleColors.BLUE+"Los creadores son unos novatos, excusamos por la calidad"+ConsoleColors.RESET);
	System.out.println(ConsoleColors.CYAN+"No es mucho, pero es trabajo honesto :) aceptamos tus PQRS"+ConsoleColors.RESET);
	System.out.println("");
	System.out.println("        "+".-._.---'     .  ");              
  	System.out.println("   "+"(_) /         /    .-.   ");      
    System.out.println("      "+"/--..-.   /     `-'.-.   .-.  ");
    System.out.println("     "+"/  ./.-'_ /     /   /  )./.-'_ ");
    System.out.println(" "+" .-/   (__.'_/_.-_.(__./`-' (__.'  ");
    System.out.println(" " +"_/                   /  ");
    System.out.println();
    System.out.println("  "+"                  /");
    System.out.println("  "+".-.  .  .-.  .-../");
    System.out.println(" "+"(  |   )/   )(   / ");
    System.out.println(" "+" `-'-''/   (  `-'-..");
    System.out.println(" "+"            `-        ");
    System.out.println();
    System.out.println("    "+"	           .-.                   .     .                      ");
    System.out.println("   "+".--.`-'                     /     /    .-.       ");
    System.out.println(" "+" /  (_:    .-.  ).--..-.     / .-../     `-'.  .-..  .-.   .-.  ");
    System.out.println(" "+"/        ./.-'_/    (  |    / (   /     /    )/   ))/   )./.-' ");
    System.out.println(""+"(     --:-(__.'/      `-'-'_/_.-`-'-.._.(__. '/   ('/   ( (__.'  ");
	System.out.println(""+" `.___.'                                           `-    `-    ");
	menu();



                         

		
	}
	public static int[] crearIndices(int total)
	{
		int indices[] = new int[total];
		int contador = 0;
		for (int i=0;i<indices.length;i++) {
			indices[i] = contador;
			contador+=20;		
		}
		return indices;

	}



	public static void menu()

	{
		int centinela = 0, opcion_bandera = 0;
		/*String banderas[] = ConsoleFile.read("info_banderas.csv");
		int indices[] = crearIndices(banderas.length/20);
		imprimirGraficoBandera(banderas, indices[18]);*/	
		
		
		
		boolean bandera;
		
		do
		{
			System.out.println();
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                 "+"___  _                 _");
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                "+"|  _|| | ___  ___  _ _ |_| ___  ___"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"                "+"|  _|| || .'|| . || | || ||   || . |");
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT+"                "+"|  _|| || .'|| . || | || ||   || . |"+ConsoleColors.RESET);
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                "+"|_|  |_||__,||_  ||_  ||_||_|_||_  |");
			System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT+"                             "+"|___||___|        |___|"+ConsoleColors.RESET);
			
			System.out.println("Escoja una opción");
			System.out.println(ConsoleColors.YELLOW+"1."+ConsoleColors.RESET+" Bandera con la que voy a jugar");
			System.out.println(ConsoleColors.YELLOW+"2."+ConsoleColors.RESET+" Instrucciones");
			System.out.println(ConsoleColors.YELLOW+"3."+ConsoleColors.RESET+" Acerca de");
			System.out.println(ConsoleColors.YELLOW+"4."+ConsoleColors.RESET+" Salir");
			System.out.println();
			System.out.println();
			System.out.println(ConsoleColors.YELLOW+" "+ConsoleColors.RESET+"Ingresa un numero");
			centinela = ConsoleInput.getInt();
			switch(centinela)
			
			{
				case 1:	System.out.println();
				 		jugar();
						break;
				case 2: System.out.println();
						instrucciones();
						break;
				case 3: System.out.println();
						acerca_de();
						break;
				case 4: System.out.println("Sayonara");
						break;
				default: System.out.println("Opcion no disponible");
						break;
			}
		     bandera = false;

		}while(bandera);
	}
	public static void main(String args[])
	{
		menu();
		

	}

}