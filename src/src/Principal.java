package src;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LS_NormalTemperatura TEM1 = new LS_NormalTemperatura();
		TEM1.adiFinal(new Temperatura(56));
		TEM1.adiFinal(new Temperatura(12));
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
		TEM3.adiFinal(new Temperatura(16));
		TEM3.adiFinal(new Temperatura(8));
		TEM3.adiFinal(new Temperatura(3));
		LS_NormalTemperatura TEM4 = new LS_NormalTemperatura();
		TEM4.adiFinal(new Temperatura(2));
		TEM4.adiFinal(new Temperatura(19));
		TEM4.adiFinal(new Temperatura(11));
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
		TEM7.adiFinal(new Temperatura(22));
		LS_NormalTemperatura TEM8 = new LS_NormalTemperatura();
		TEM8.adiFinal(new Temperatura(4));
		TEM8.adiFinal(new Temperatura(-7));
		LS_NormalTemperatura TEM9 = new LS_NormalTemperatura();
		TEM9.adiFinal(new Temperatura(18));
		TEM9.adiFinal(new Temperatura(-5));
		TEM9.adiFinal(new Temperatura(21));
		TEM9.adiFinal(new Temperatura(16));
		LS_NormalTemperatura TEM10 = new LS_NormalTemperatura();
		TEM10.adiFinal(new Temperatura(11));
		TEM10.adiFinal(new Temperatura(24));
		TEM10.adiFinal(new Temperatura(30));
		TEM10.adiFinal(new Temperatura(13));
		TEM10.adiFinal(new Temperatura(6));
		TEM10.adiFinal(new Temperatura(2));
		TEM10.adiFinal(new Temperatura(27));
		TEM10.adiFinal(new Temperatura(-2));
		TEM10.adiFinal(new Temperatura(0));
		TEM10.adiFinal(new Temperatura(1));
		LS_NormalTemperatura TEM11 = new LS_NormalTemperatura();
		TEM11.adiFinal(new Temperatura(17));
		TEM11.adiFinal(new Temperatura(10));
		TEM11.adiFinal(new Temperatura(9));
		
		LD_NormalMetereologia MET1 = new LD_NormalMetereologia();
		MET1.adiFinal(new Metereologia(TEM1, "23/01/2023",30,"15m/s"));
		MET1.adiFinal(new Metereologia(TEM2, "30/05/2023",15,"45m/s"));
		LD_NormalMetereologia MET2 = new LD_NormalMetereologia();
		MET2.adiFinal(new Metereologia(TEM3, "03/02/2023",20,"32m/s"));
		MET2.adiFinal(new Metereologia(TEM4, "15/03/2023",80,"17m/s"));
		MET2.adiFinal(new Metereologia(TEM5, "26/04/2023",10,"50m/s"));
		LD_NormalMetereologia MET3 = new LD_NormalMetereologia();
		MET3.adiFinal(new Metereologia(TEM6, "12/01/2023",63,"10m/s"));
		MET3.adiFinal(new Metereologia(TEM7, "02/03/2023",40,"12m/s"));
		MET3.adiFinal(new Metereologia(TEM8, "16/05/2023",35,"18m/s"));
		MET3.adiFinal(new Metereologia(TEM9, "30/07/2023",17,"7m/s"));
		LD_NormalMetereologia MET4 = new LD_NormalMetereologia();
		MET4.adiFinal(new Metereologia(TEM10, "05/06/2023",21,"26m/s"));
		MET4.adiFinal(new Metereologia(TEM11, "08/10/2023",27,"24m/s"));
		
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
		
		System.out.println();
		Depa.mostrar();
		
		
		
		
		
		

	}

}
