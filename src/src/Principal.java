package src;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n\t==== SISTEMA DE MONITOREO AMBIENTAL EN TIEMPO REAL ====");
		ColaSimpleGobierno G = new ColaSimpleGobierno();
		G.adi(new Gobierno("Ivan Arias","La Paz",2500));
		G.adi(new Gobierno("Christian Camara","Beni",1250));
		G.adi(new Gobierno("Enrique Leaño","Chuquisaca",1850));
		G.adi(new Gobierno("Jhonny Fernandez","Santa Cruz",3500));
		PilaMonitoreador M = new PilaMonitoreador();
		M.adi(new Monitoreador("Carlos Martinez","Lp02"));
		M.adi(new Monitoreador("Maria Boutier","Lp02"));
		M.adi(new Monitoreador("Sergio Luque","Ch01"));
		M.adi(new Monitoreador("Viviana Pereira","Be08"));
		M.adi(new Monitoreador("Luis Roque","Scz07"));
		M.adi(new Monitoreador("Tina Velazquez","Ch1"));
		M.adi(new Monitoreador("Zoe Miranda","Be08"));
		M.adi(new Monitoreador("Gabriel Alvarez","Scz07"));
		System.out.println();
		G.mostrar();
		M.mostrar();
		
		
		LS_NormalTemperatura TEM1 = new LS_NormalTemperatura();
		TEM1.adiFinal(new Temperatura(56));
		TEM1.adiFinal(new Temperatura(-12));
		TEM1.adiFinal(new Temperatura(-10));
		TEM1.adiFinal(new Temperatura(32));
		TEM1.adiFinal(new Temperatura(20));
		LS_NormalTemperatura TEM2 = new LS_NormalTemperatura();
		TEM2.adiFinal(new Temperatura(42));
		TEM2.adiFinal(new Temperatura(26));
		TEM2.adiFinal(new Temperatura(-13));
		LS_NormalTemperatura TEM3 = new LS_NormalTemperatura();
		TEM3.adiFinal(new Temperatura(18));
		TEM3.adiFinal(new Temperatura(-5));
		TEM3.adiFinal(new Temperatura(21));
		TEM3.adiFinal(new Temperatura(-16));
		TEM3.adiFinal(new Temperatura(8));
		TEM3.adiFinal(new Temperatura(3));
		LS_NormalTemperatura TEM4 = new LS_NormalTemperatura();
		TEM4.adiFinal(new Temperatura(2));
		TEM4.adiFinal(new Temperatura(19));
		TEM4.adiFinal(new Temperatura(-11));
		TEM4.adiFinal(new Temperatura(14));
		LS_NormalTemperatura TEM5 = new LS_NormalTemperatura();
		TEM5.adiFinal(new Temperatura(18));
		TEM5.adiFinal(new Temperatura(-5));
		LS_NormalTemperatura TEM6 = new LS_NormalTemperatura();
		TEM6.adiFinal(new Temperatura(21));
		TEM6.adiFinal(new Temperatura(33));
		TEM6.adiFinal(new Temperatura(10));
		TEM6.adiFinal(new Temperatura(-1));
		TEM6.adiFinal(new Temperatura(0));
		LS_NormalTemperatura TEM7 = new LS_NormalTemperatura();
		TEM7.adiFinal(new Temperatura(23));
		TEM7.adiFinal(new Temperatura(32));
		TEM7.adiFinal(new Temperatura(41));
		TEM7.adiFinal(new Temperatura(21));
		LS_NormalTemperatura TEM8 = new LS_NormalTemperatura();
		TEM8.adiFinal(new Temperatura(4));
		TEM8.adiFinal(new Temperatura(-7));
		LS_NormalTemperatura TEM9 = new LS_NormalTemperatura();
		TEM9.adiFinal(new Temperatura(18));
		TEM9.adiFinal(new Temperatura(-5));
		TEM9.adiFinal(new Temperatura(21));
		TEM9.adiFinal(new Temperatura(16));
		LS_NormalTemperatura TEM10 = new LS_NormalTemperatura();
		TEM10.adiFinal(new Temperatura(-11));
		TEM10.adiFinal(new Temperatura(24));
		TEM10.adiFinal(new Temperatura(30));
		TEM10.adiFinal(new Temperatura(-13));
		TEM10.adiFinal(new Temperatura(-6));
		TEM10.adiFinal(new Temperatura(2));
		TEM10.adiFinal(new Temperatura(27));
		TEM10.adiFinal(new Temperatura(-2));
		TEM10.adiFinal(new Temperatura(0));
		TEM10.adiFinal(new Temperatura(1)); 
		LS_NormalTemperatura TEM11 = new LS_NormalTemperatura();
		TEM11.adiFinal(new Temperatura(17));
		TEM11.adiFinal(new Temperatura(10));
		TEM11.adiFinal(new Temperatura(-9));
		
		LD_NormalMeteorologia MET1 = new LD_NormalMeteorologia();
		MET1.adiFinal(new Meteorologia(TEM1, "23/01/2023",30,"15m/s"));
		MET1.adiFinal(new Meteorologia(TEM2, "30/05/2023",15,"45m/s"));
		LD_NormalMeteorologia MET2 = new LD_NormalMeteorologia();
		MET2.adiFinal(new Meteorologia(TEM3, "03/02/2023",20,"32m/s"));
		MET2.adiFinal(new Meteorologia(TEM4, "15/03/2023",80,"17m/s"));
		MET2.adiFinal(new Meteorologia(TEM5, "26/04/2023",10,"50m/s"));
		LD_NormalMeteorologia MET3 = new LD_NormalMeteorologia();
		MET3.adiFinal(new Meteorologia(TEM6, "12/01/2023",63,"10m/s"));
		MET3.adiFinal(new Meteorologia(TEM7, "02/03/2023",40,"12m/s"));
		MET3.adiFinal(new Meteorologia(TEM8, "16/05/2023",35,"18m/s"));
		MET3.adiFinal(new Meteorologia(TEM9, "30/07/2023",17,"7m/s"));
		LD_NormalMeteorologia MET4 = new LD_NormalMeteorologia();
		MET4.adiFinal(new Meteorologia(TEM10, "05/06/2023",21,"26m/s"));
		MET4.adiFinal(new Meteorologia(TEM11, "08/10/2023",27,"24m/s"));
		
		LD_CircularContaminacion CON1 = new LD_CircularContaminacion();
		CON1.adiFinal(new Contaminacion("Suelo"));
		CON1.adiFinal(new Contaminacion("Aire"));
		CON1.adiFinal(new Contaminacion("Agua"));
		LD_CircularContaminacion CON2 = new LD_CircularContaminacion();
		CON2.adiFinal(new Contaminacion("Agua"));
		CON2.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON3 = new LD_CircularContaminacion();
		CON3.adiFinal(new Contaminacion("Suelo"));
		CON3.adiFinal(new Contaminacion("Aire"));
		CON3.adiFinal(new Contaminacion("Agua"));
		CON3.adiFinal(new Contaminacion("Agua"));
		CON3.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON4 = new LD_CircularContaminacion();
		CON4.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON5 = new LD_CircularContaminacion();
		CON5.adiFinal(new Contaminacion("Aire"));
		CON5.adiFinal(new Contaminacion("Agua"));
		CON5.adiFinal(new Contaminacion("Suelo"));
		CON5.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON6 = new LD_CircularContaminacion();
		CON6.adiFinal(new Contaminacion("Agua"));
		CON6.adiFinal(new Contaminacion("Suelo"));
		CON6.adiFinal(new Contaminacion("Aire"));
		LD_CircularContaminacion CON7 = new LD_CircularContaminacion();
		CON7.adiFinal(new Contaminacion("Suelo"));
		CON7.adiFinal(new Contaminacion("Suelo"));
		CON7.adiFinal(new Contaminacion("Agua"));
		CON7.adiFinal(new Contaminacion("Aire"));
		CON7.adiFinal(new Contaminacion("Agua"));
		CON7.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON8 = new LD_CircularContaminacion();
		CON8.adiFinal(new Contaminacion("Agua"));
		CON8.adiFinal(new Contaminacion("Suelo"));
		CON8.adiFinal(new Contaminacion("Agua"));
		CON8.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON9 = new LD_CircularContaminacion();
		CON9.adiFinal(new Contaminacion("Agua"));
		CON9.adiFinal(new Contaminacion("Suelo"));
		LD_CircularContaminacion CON10 = new LD_CircularContaminacion();
		CON10.adiFinal(new Contaminacion("Aire"));
		CON10.adiFinal(new Contaminacion("Suelo"));
		CON10.adiFinal(new Contaminacion("Agua"));
		CON10.adiFinal(new Contaminacion("Suelo"));
		CON10.adiFinal(new Contaminacion("Aire"));
		LD_CircularContaminacion CON11 = new LD_CircularContaminacion();
		CON11.adiFinal(new Contaminacion("Suelo"));
		CON11.adiFinal(new Contaminacion("Suelo"));
		CON11.adiFinal(new Contaminacion("Agua"));
		CON11.adiFinal(new Contaminacion("Aire"));
		
		LS_NormalPrevencionContaminacion PREV1 = new LS_NormalPrevencionContaminacion();
		PREV1.adiFinal(CON1, 3,"Cuida tu ciudad!!");
		PREV1.adiFinal(CON2, 2,"Cuida tu ciudad!!");
		PREV1.adiFinal(CON3, 5,"Cuida tu ciudad!!");
		LS_NormalPrevencionContaminacion PREV2 = new LS_NormalPrevencionContaminacion();
		PREV2.adiFinal(CON4, 1,"Cuida tu ciudad!!");
		PREV2.adiFinal(CON5, 4,"Cuida tu ciudad!!");
		PREV2.adiFinal(CON6, 3,"Cuida tu ciudad!!");
		PREV2.adiFinal(CON7, 6,"Cuida tu ciudad!!");
		LS_NormalPrevencionContaminacion PREV3 = new LS_NormalPrevencionContaminacion();
		PREV3.adiFinal(CON8, 4,"Cuida tu ciudad!!");
		PREV3.adiFinal(CON9, 2,"Cuida tu ciudad!!");
		LS_NormalPrevencionContaminacion PREV4 = new LS_NormalPrevencionContaminacion();
		PREV4.adiFinal(CON10, 5,"Cuida tu ciudad!!");
		PREV4.adiFinal(CON11, 4,"Cuida tu ciudad!!");
		
		LS_CircularRescate RESC1 = new LS_CircularRescate();
		RESC1.adiFinal(new Rescate("Rescate en estructuras colapsadas"));
		RESC1.adiFinal(new Rescate("Rescate con perros de busqueda"));
		RESC1.adiFinal(new Rescate("Rescate en espacios confinados"));
		//HURACAN
		LS_CircularRescate RESC2 = new LS_CircularRescate();
		RESC2.adiFinal(new Rescate("Rescate en inundaciones"));
		RESC2.adiFinal(new Rescate("Rescate aereo"));
		RESC2.adiFinal(new Rescate("Evacuacion de emergencia"));
		//INUNDACION
		LS_CircularRescate RESC3 = new LS_CircularRescate();
		RESC3.adiFinal(new Rescate("Rescate acuatico"));
		RESC3.adiFinal(new Rescate("Rescate con botes"));
		RESC3.adiFinal(new Rescate("Rescate aereo"));
		//INCENDIO FORESTAL
		LS_CircularRescate RESC4 = new LS_CircularRescate();
		RESC4.adiFinal(new Rescate("Rescate con equipos de bomberos"));
		RESC4.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC4.adiFinal(new Rescate("Rescate aereo"));
		//TSUNAMI
		LS_CircularRescate RESC5 = new LS_CircularRescate();
		RESC5.adiFinal(new Rescate("Rescate acuatico"));
		RESC5.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC5.adiFinal(new Rescate("Rescate aereo"));
		//HURACAN
		LS_CircularRescate RESC6 = new LS_CircularRescate();
		RESC6.adiFinal(new Rescate("Rescate en inundaciones"));
		RESC6.adiFinal(new Rescate("Rescate aereo"));
		RESC6.adiFinal(new Rescate("Evacuacion de emergencia"));
		//DESLIZAMIENTO DE TIERRA
		LS_CircularRescate RESC7 = new LS_CircularRescate();
		RESC7.adiFinal(new Rescate("Rescate en estructuras colapsadas"));
		RESC7.adiFinal(new Rescate("Rescate en terrenos inestables"));
		RESC7.adiFinal(new Rescate("Busqueda y rescate en escombros"));
		//ERUPCION VOLCANICA
		LS_CircularRescate RESC8 = new LS_CircularRescate();
		RESC8.adiFinal(new Rescate("Rescate en zonas de alta temperatura"));
		RESC8.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC8.adiFinal(new Rescate("Rescate aereo"));
		//TERREMOTO
		LS_CircularRescate RESC9 = new LS_CircularRescate();
		RESC9.adiFinal(new Rescate("Rescate en estructuras colapsadas"));
		RESC9.adiFinal(new Rescate("Rescate con perros de busqueda"));
		RESC9.adiFinal(new Rescate("Rescate en espacios confinados"));
		//TSUNAMI
		LS_CircularRescate RESC10 = new LS_CircularRescate();
		RESC10.adiFinal(new Rescate("Rescate acuatico"));
		RESC10.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC10.adiFinal(new Rescate("Rescate aereo"));
		//ERUPCION VOLCANICA
		LS_CircularRescate RESC11 = new LS_CircularRescate();
		RESC11.adiFinal(new Rescate("Rescate en zonas de alta temperatura"));
		RESC11.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC11.adiFinal(new Rescate("Rescate aereo"));
		//TERREMOTO
		LS_CircularRescate RESC12 = new LS_CircularRescate();
		RESC12.adiFinal(new Rescate("Rescate en estructuras colapsadas"));
		RESC12.adiFinal(new Rescate("Rescate con perros de busqueda"));
		RESC12.adiFinal(new Rescate("Rescate en espacios confinados"));
		//TSUNAMI
		LS_CircularRescate RESC13 = new LS_CircularRescate();
		RESC13.adiFinal(new Rescate("Rescate acuatico"));
		RESC13.adiFinal(new Rescate("Evacuacion de emergencia"));
		RESC13.adiFinal(new Rescate("Rescate aereo"));
		
		ColaCircularDesastreNatural CDN1 = new ColaCircularDesastreNatural();
		CDN1.adi(new DesastreNatural("Terremoto",RESC1));
		CDN1.adi(new DesastreNatural("Huracan",RESC2));
		CDN1.adi(new DesastreNatural("Inundacion",RESC3));
		ColaCircularDesastreNatural CDN2 = new ColaCircularDesastreNatural();
		CDN2.adi(new DesastreNatural("Incendio Forestal",RESC4));
		CDN2.adi(new DesastreNatural("Tsunami",RESC5));
		CDN2.adi(new DesastreNatural("Huracan",RESC6));
		ColaCircularDesastreNatural CDN3 = new ColaCircularDesastreNatural();
		CDN3.adi(new DesastreNatural("Deslizamiento de tierra",RESC7));
		CDN3.adi(new DesastreNatural("Erupcion Volcanica",RESC8));
		CDN3.adi(new DesastreNatural("Terremoto",RESC9));
		CDN3.adi(new DesastreNatural("Tsunami",RESC10));
		ColaCircularDesastreNatural CDN4 = new ColaCircularDesastreNatural();
		CDN4.adi(new DesastreNatural("Erupcion Volcanica",RESC11));
		CDN4.adi(new DesastreNatural("Terremoto",RESC12));
		CDN4.adi(new DesastreNatural("Tsunami",RESC13));
		
		
		Departamento dep1 = new Departamento("La Paz","La Paz",2000,"Lp02","Min 5C/Max 21C","Alto",MET1,PREV1,CDN1);
		Departamento dep2 = new Departamento("Beni","Trinidad",1050,"Ben08","Min 17C/ Max 29C","Medio",MET2,PREV2,CDN2);
		Departamento dep3 = new Departamento("Chuquisaca","Sucre",1500,"Ch01","Min 10C/Max 23C","Alto",MET3,PREV3,CDN3);
		Departamento dep4 = new Departamento("Santa Cruz","Santa Cruz de la Sierra",2500,"Scz07","Min 16C/Max 28C","Bajo",MET4,PREV4,CDN4);
		
		LS_NormalDepartamento Depa = new LS_NormalDepartamento();
		Depa.adiFinal(dep1);
		Depa.adiFinal(dep2);
		Depa.adiFinal(dep3);
		Depa.adiFinal(dep4);
		
		System.out.println("\n");
		Depa.mostrar();
		
	
		int q;
		Scanner sc = new Scanner(System.in);
		while(true) {	
			System.out.println("\n");
			System.out.println("=======================RESOLUCION DE LOS PROBLEMAS=======================");
			System.out.println("[1] CALCULAR EL PROMEDIO DE TEMPEREATURAS DE LOS DEPARTAMENTOS DE BOLIVIA");
			System.out.println("[2] DADA UN DEPARTAMENTO X ORDENA SUS TEMPERATURAS DE MAYOR A MENOR");
			System.out.println("[3] MOSTRAR EL NOMBRE DE LOS DEPARTAMENTOS QUE PRESENTARON EL DESASTRE NATURAL X ");
			System.out.println("    Y A LA VEZ MOSTRAR SUS DATOS METEOROLOGICOS");
			System.out.println("[4] MOSTRAR EL NOMBRE Y SUS DATOS METEOROLOGICOS DE LOS DEPARTAMENTOS QUE TIENEN EL ");
			System.out.println("    CLIMA Y");
			System.out.println("[5] MOSTRAR EL NOMBRE Y LA CANTIDAD DE CASOS DE CONTAMINACION DE LOS DEPARTAMENTOS ");
			System.out.println("    QUE PRESENTEN MAS CASOS DEL TIPO DE CONTAMINACION X ");
			System.out.println("Introduce opcion: ");
			q = sc.nextInt();
			switch(q) {
			case 1:
				//1.	Calcular el promedio de temperaturas de los departamentos de Bolivia.
				System.out.println("\n\t\t\t -- PROBLEMA 1 --");
				double promedio = promedioTemperatura(Depa);
				System.out.println("El promedio es: "+promedio);
				break;
			
			case 2:
				//2.	Dado un departamento X ordena sus temperaturas de mayor a menor.
				System.out.println("\n\t\t\t -- PROBLEMA 2 --");
				System.out.println("\nORDENAR SUS TEMPERATURAS DE MAYOR A MENOR DEL DEPARTAMENTO X");
				String deparX="Beni";
				ordenar_Temperaturas_de_Mayor_Menor(Depa,deparX);
				break;
			case 3:
				//3.	Mostrar el nombre de los departamentos que presentaron el desastre natural X 
				//      y a la vez mostrar sus datos meteorológicos.
				System.out.println("\n\t\t\t -- PROBLEMA 3 --");
				mostrarDepartamentosDesastreNaturalX(Depa, "Terremoto");
				break;
			case 4:
				//4.	Mostrar el nombre y sus datos meteorológicos de los departamentos que
				//      tienen el clima Y.
				System.out.println("\n\t\t\t -- PROBLEMA 4 --");
				System.out.println("\n\tDATOS METOROLOGICOS DEL CLIMA (Y)");
				String climaY="Min 17C/ Max 29C";
				Mostrar_datos_Metorologicos_de_climaY(Depa,climaY);
				break;
			case 5:
				//5.	Mostrar el nombre de los departamentos que presenten más casos del tipo 
				//      de contaminación X junto con la cantidad de casos.
				System.out.println("\n\t\t\t -- PROBLEMA 5 --");
				String tipoContaminacion = "Suelo";
				mostrarDepartamentoConMasCasosDecontaminacion(Depa, tipoContaminacion);
				break;
				default:
					System.out.println("Opcion invalida.Intente de nuevo.");
					continue;
			}
			System.out.println("Desea realizar otra operacion? (s/n)");
			String respuesta = sc.next();
			if(respuesta.equalsIgnoreCase("n")) {
				break;
			}
		}
		sc.close();
		
	
	}
	
	static void mostrarSoloMeteorologia(LS_NormalDepartamento a) {
		NodoDepartamento R = a.getP();
		while(R != null) {
			NodoMeteorologia S = R.getDepartamento().getMet().getP();
			System.out.println("\t*-*-*-*-*-*-* DEPARTAMENTO ("+R.getDepartamento().getNombre()+") *-*-*-*-*-*-*");
			while(S != null) {
				S.getMetereologia().mostrar();
				S = S.getSig();
			}
			R = R.getSig();
		}
	}
	//PROBLEMA 1
	static double promedioTemperatura(LS_NormalDepartamento a) {
		NodoDepartamento R = a.getP();
		double cont = 0;
		double sum = 0;
		double prom = 0;
		while(R != null) {
			NodoMeteorologia S = R.getDepartamento().getMet().getP();
			while(S != null) {
				NodoTemperatura T = S.getMetereologia().getTemp().getP();
				while(T != null) {
					sum = sum + T.getTemperatura().getGrado();
					cont ++;
					T = T.getSig();
				}
				S = S.getSig();
			}
			R = R.getSig();
		}
		prom = sum/cont;
		return prom;
	}
	
	//PROBLEMA 2
	private static void ordenar_Temperaturas_de_Mayor_Menor(LS_NormalDepartamento a, String deparX) {
	    NodoDepartamento R = a.getP();
	    System.out.println("Departamento X: "+deparX);
	    while (R != null) {
	        Departamento de = R.getDepartamento();
	        if (de.getNombre().equals(deparX)) {
	            NodoMeteorologia S = de.getMet().getP();
	            while (S != null) {
	                Meteorologia me = S.getMetereologia();
	                LS_NormalTemperatura aux1 = new LS_NormalTemperatura();
	                LS_NormalTemperatura aux2 = new LS_NormalTemperatura();
	                while (!me.getTemp().esVacia()) {
	                    double mayor = mayorTemperratura(me.getTemp());
	                    while (!me.getTemp().esVacia()) {
	                        NodoTemperatura x = me.getTemp().eliPrincipio();
	                        if (x.getTemperatura().getGrado() == mayor) {
	                            aux1.adiFinal(x.getTemperatura());
	                        } else {
	                            aux2.adiFinal(x.getTemperatura());
	                        }
	                    }
	                    me.getTemp().setP(aux2.getP());
	                    aux2.setP(null);
	                }
	                me.getTemp().setP(aux1.getP());
	                S = S.getSig();
	                System.out.println();
	                me.mostrar();
	            }
	        }
	        R = R.getSig();
	    }
	}
	private static double mayorTemperratura(LS_NormalTemperatura a) {
	    NodoTemperatura R = a.getP();
	    double may = Double.NEGATIVE_INFINITY;
	    while (R != null) {
	        Temperatura tem = R.getTemperatura();
	        if (tem.getGrado() > may) {
	            may = tem.getGrado();
	        }
	        R = R.getSig();
	    }
	    return may;
	}
	
	//PROBLEMA 3
	static void mostrarDepartamentosDesastreNaturalX(LS_NormalDepartamento a, String desNatX) {
		NodoDepartamento R = a.getP();
		boolean sw = false;
		System.out.println("Desastre natural buscado => "+desNatX);
		System.out.println("Departamentos encontrados...");
		System.out.println();
		while(R != null) {
			ColaCircularDesastreNatural z = R.getDepartamento().getDesastreNatural();
			ColaCircularDesastreNatural aux = new ColaCircularDesastreNatural();
			while(!z.esVacia()) {
				DesastreNatural des = z.eli();
				if(des.getTipoDesastre().equals(desNatX)) {
					sw = true;
					System.out.println(R.getDepartamento().getNombre());
					System.out.println("Desastre Natural: "+des.getTipoDesastre());
					System.out.println("\t-* Rescate de ("+des.getTipoDesastre()+") -*");
					des.getCsr().mostrar();
					System.out.println("----------------------------------------------------------");
				}
				aux.adi(des);
			}
			z.vaciar(aux);
			R = R.getSig();
		}
		if(sw == false) {
			System.out.println("El desastre natural no se encuentra en el registro...");
		}
	}
	
	//PROBLEMA 4
	private static void Mostrar_datos_Metorologicos_de_climaY(LS_NormalDepartamento a, String climaY) {
		NodoDepartamento R = a.getP();
		while (R!=null) {
			Departamento de = R.getDepartamento();
			if (de.getClima().equals(climaY)) {
				System.out.println("\n\tEL DEPARTAMENTO QUE TIENE ESE CLIMA ES ["+de.getNombre()+"]");
				de.getMet().mostrar();
			}
			R=R.getSig();
		}
	}
	//PROBLEMA 5
	public static void mostrarDepartamentoConMasCasosDecontaminacion(LS_NormalDepartamento a, String tipoContaminacion) {
	    NodoDepartamento R = a.getP();
	    int may=0;
	    String depMayor="";
	    while (R!=null) {
			Departamento de = R.getDepartamento();
			int cantCont = contar_Casos_Contaminacion(de,tipoContaminacion);
			System.out.println("conta "+cantCont+" depa "+de.getNombre());
			if (cantCont>may) {
				depMayor=de.getNombre();
				may=cantCont;
			}
	    	R=R.getSig();
		}
	    System.out.println("El departamento que tiene mas contaminacion de "+tipoContaminacion+" es "+depMayor+""
	    		+ " con la cantidad de => "+may);
	}
	private static int contar_Casos_Contaminacion(Departamento de, String tipoContaminacion) {
		NodoPrevencionContaminacion R = de.getLSprev().getP();
		int cont=0;
		while (R!=null) {
			NodoContaminacion S = R.getLDc().getP();
			int nroN=R.getLDc().nroNodos();
			for (int i = 0; i < nroN; i++) {
				Contaminacion co = S.getContaminacion();
				if (co.getTipoContaminacion().equals(tipoContaminacion)) {
					cont++;
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
		return cont;
	}


}
