import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//***************BOLIVIA*******************
		//+++++++++++Temperatura+++++++++++++
		ColaCircularTemperatura TBol1 = new ColaCircularTemperatura();
		TBol1.adicionar(new Temperatura(15.3));
		
		ColaCircularTemperatura TBol2 = new ColaCircularTemperatura();
		TBol2.adicionar(new Temperatura(14.3));
		//+++++++++++Meteorologia+++++++++++++
		ColaSimpleMeteorologia MBol1 = new ColaSimpleMeteorologia();
		MBol1.adi(new Meteorologia(TBol1,"12/04/2024",2,50));
		MBol1.adi(new Meteorologia(TBol1,"13/04/2024",5,70));

		ColaSimpleMeteorologia MBol2 = new ColaSimpleMeteorologia();
		MBol2.adi(new Meteorologia(TBol2,"12/04/2024",1,30));
		//+++++++++++Contaminacion+++++++++++++
		PilaContaminacion CBol1 = new PilaContaminacion();
		CBol1.adi(new Contaminacion("agua"));
		
		PilaContaminacion CBol2 = new PilaContaminacion();
		CBol2.adi(new Contaminacion("Tierra"));
		//+++++++++++Prevencion+++++++++++++
		PilaPrevencion PRBol1 = new PilaPrevencion();
		PRBol1.adi(new Prevencion(CBol1));
		
		PilaPrevencion PRBol2 = new PilaPrevencion();
		PRBol2.adi(new Prevencion(CBol2));
		//+++++++++++Rescate+++++++++++++
		ColaSimpleRescate ResBol1 = new ColaSimpleRescate();
		ResBol1.adi(new Rescate("flubial"));
		
		ColaSimpleRescate ResBol2 = new ColaSimpleRescate();
		ResBol2.adi(new Rescate("terestre"));
		//+++++++++++DesastresNaturales+++++++++++++
		PilaDesastresNaturales DNBol1 = new PilaDesastresNaturales();
		DNBol1.adi(new DesastresNaturales("inundaciones",ResBol1));
		
		PilaDesastresNaturales DNBol2 = new PilaDesastresNaturales();
		DNBol2.adi(new DesastresNaturales("deslzamiento",ResBol2));
		//+++++++++++Departamento+++++++++++++
		ColaCircularDepartamento DEPBol = new ColaCircularDepartamento();
		DEPBol.adicionar(new Departamento("Beni","1","bajo","Calido",MBol1,PRBol1,DNBol1,5000));
		DEPBol.adicionar(new Departamento("La Paz","2","alto","Frio",MBol2,PRBol2,DNBol2,7000));
		DEPBol.adicionar(new Departamento("Oruro","2","alto","Frio",MBol2,PRBol2,DNBol2,7000));
		//+++++++++++Pais+++++++++++++
		Pais paisBol = new Pais("Bolivia",DEPBol);
		
		//**************ARGENTINA**************************
		//+++++++++++Temperatura+++++++++++++
		ColaCircularTemperatura TArg1 = new ColaCircularTemperatura();
		TArg1.adicionar(new Temperatura(15.3));
		TArg1.adicionar(new Temperatura(7.9));
		
		ColaCircularTemperatura TArg2 = new ColaCircularTemperatura();
		TArg2.adicionar(new Temperatura(7.9));
		//+++++++++++Meteorologia+++++++++++++
		ColaSimpleMeteorologia MArg1 = new ColaSimpleMeteorologia();
		MArg1.adi(new Meteorologia(TArg1,"12/04/2024",2,50));
		MArg1.adi(new Meteorologia(TArg1,"20/04/2024",8,90));
		
		ColaSimpleMeteorologia MArg2 = new ColaSimpleMeteorologia();
		MArg2.adi(new Meteorologia(TArg2,"12/04/2024",2,50));
		//+++++++++++Contaminacion+++++++++++++
		PilaContaminacion CArg1 = new PilaContaminacion();
		CArg1.adi(new Contaminacion("agua"));
		
		PilaContaminacion CArg2 = new PilaContaminacion();
		CArg2.adi(new Contaminacion("tierra"));
		//+++++++++++Prevencion+++++++++++++
		PilaPrevencion PRArg1 = new PilaPrevencion();
		PRArg1.adi(new Prevencion(CArg1));
		
		PilaPrevencion PRArg2 = new PilaPrevencion();
		PRArg2.adi(new Prevencion(CArg2));
		//+++++++++++Rescate+++++++++++++
		ColaSimpleRescate ResArg1 = new ColaSimpleRescate();
		ResArg1.adi(new Rescate("flubial"));
		
		ColaSimpleRescate ResArg2 = new ColaSimpleRescate();
		ResArg2.adi(new Rescate("terestre"));
		//+++++++++++DesastresNaturales+++++++++++++
		PilaDesastresNaturales DNArg1 = new PilaDesastresNaturales();
		DNArg1.adi(new DesastresNaturales("inundaciones",ResArg1));
		
		PilaDesastresNaturales DNArg2 = new PilaDesastresNaturales();
		DNArg2.adi(new DesastresNaturales("teremoto",ResArg2));
		//+++++++++++Departamento+++++++++++++
		ColaCircularDepartamento DEPArg = new ColaCircularDepartamento();
		DEPArg.adicionar(new Departamento("Buenos Aires","10","bajo","Frio",MArg1,PRArg1,DNArg1,5000));
		DEPArg.adicionar(new Departamento("San juan","11","medio","Frio",MArg2,PRArg2,DNArg2,3000));
		//+++++++++++Pais+++++++++++++
		Pais paisArg = new Pais("Argentina",DEPArg);

		
		//**************CHILE**************************
		//+++++++++++Temperatura+++++++++++++
		ColaCircularTemperatura TChi1 = new ColaCircularTemperatura();
		TChi1.adicionar(new Temperatura(15.3));
		//+++++++++++Meteorologia+++++++++++++
		ColaSimpleMeteorologia MChi1 = new ColaSimpleMeteorologia();
		MChi1.adi(new Meteorologia(TChi1,"12/04/2024",2,50));
		MChi1.adi(new Meteorologia(TChi1,"12/04/2024",2,50));
		//+++++++++++Contaminacion+++++++++++++
		PilaContaminacion CChi1 = new PilaContaminacion();
		CChi1.adi(new Contaminacion("agua"));
		//+++++++++++Prevencion+++++++++++++
		PilaPrevencion PRChi1 = new PilaPrevencion();
		PRChi1.adi(new Prevencion(CChi1));
		//+++++++++++Rescate+++++++++++++
		ColaSimpleRescate ResChi1 = new ColaSimpleRescate();
		ResChi1.adi(new Rescate("flubial"));
		//+++++++++++DesastresNaturales+++++++++++++
		PilaDesastresNaturales DNChi1 = new PilaDesastresNaturales();
		DNChi1.adi(new DesastresNaturales("inundaciones",ResChi1));
		//+++++++++++Departamento+++++++++++++
		ColaCircularDepartamento DEPChi = new ColaCircularDepartamento();
		DEPChi.adicionar(new Departamento("Santiago","10","bajo","templado",MChi1,PRChi1,DNChi1,14000));
		DEPChi.adicionar(new Departamento("Santiago","10","bajo","templado",MChi1,PRChi1,DNChi1,14000));
		//+++++++++++Pais+++++++++++++
		Pais paisChi = new Pais("Chile",DEPChi);


		//**************PARAGUAY**************************
		//+++++++++++Temperatura+++++++++++++
		ColaCircularTemperatura TPar1 = new ColaCircularTemperatura();
		TPar1.adicionar(new Temperatura(15.3));
		//+++++++++++Meteorologia+++++++++++++
		ColaSimpleMeteorologia MPar1 = new ColaSimpleMeteorologia();
		MPar1.adi(new Meteorologia(TPar1,"12/04/2024",2,50));
		MPar1.adi(new Meteorologia(TPar1,"12/04/2024",2,50));
		//+++++++++++Contaminacion+++++++++++++
		PilaContaminacion CPar1 = new PilaContaminacion();
		CPar1.adi(new Contaminacion("agua"));
		//+++++++++++Prevencion+++++++++++++
		PilaPrevencion PRPar1 = new PilaPrevencion();
		PRPar1.adi(new Prevencion(CPar1));
		//+++++++++++Rescate+++++++++++++
		ColaSimpleRescate ResPar1 = new ColaSimpleRescate();
		ResPar1.adi(new Rescate("flubial"));
		//+++++++++++DesastresNaturales+++++++++++++
		PilaDesastresNaturales DNPar1 = new PilaDesastresNaturales();
		DNPar1.adi(new DesastresNaturales("inundaciones",ResPar1));
		//+++++++++++Departamento+++++++++++++
		ColaCircularDepartamento DEPPar = new ColaCircularDepartamento();
		//DEPPar.adicionar(new Departamento("Beni","1","bajo",MPar1,PRPar1,DNPar1,5000));
		DEPPar.adicionar(new Departamento("Beni","1","alto","templado",MPar1,PRPar1,DNPar1,5000));
		//+++++++++++Pais+++++++++++++
		Pais paisPar = new Pais("Paraguay",DEPPar);

				
		//------------MULTIPILA PAIS---------
		Mp_PilaPais A = new Mp_PilaPais(4);
		A.adicionar(0, paisBol);
		A.adicionar(1, paisArg);
		A.adicionar(2, paisChi);
		A.adicionar(3, paisPar);
		A.mostrar();
		
		System.out.println("\n******PROMEDIO DE TEMPERATURAS DE SUADAMERICA*********");
		double promediotempertura = promedioDeTemperaturas(A);
		System.out.println("El promedio de las temepraturas son :"+promediotempertura);
		Scanner sc = new Scanner(System.in);
		System.out.println("\n*********MOSTRAR EN ORDENAR EL TIPO DE CLIMA FRIO,TEMPLADO Y CALIDO******");
		System.out.println("Intro el pais X :");
//		String Xpais=sc.next();
		String Xpais="Bolivia";
		mostra_el_tipo_de_clima_PaisX(A,Xpais);
		System.out.println("\n**********MOSRAR EL PAIS CON ALTO RIESGO DE DESASTRES NATURALES******");
		mostrar_pais_alto_riesgo(A);
		System.out.println("\n**********MOSTRAR AL PAIS X CON CLIMA Y***********");
		System.out.println("Intro Nombre del Pais: ");
		String NomPaX="Bolivia";
		System.out.println("Intro Nombre del clima: ");
		String NomCliX="Frio";
		pais_X_de_Clima_Y(A,NomPaX,NomCliX);
		System.out.println("\n**********MOSTRAR EL DEPARTAMNTO DE EL PAIS X CON TIPO DE CONTAMINACION Y***********");
		System.out.println("Intro Nombre del Pais: ");
		String NomPaisX="Bolivia";
		System.out.println("Intro Nombre del tipod de contaminacion de tipi [suelo] [aire] [agua] ");
		String NomConX="agua";
		tipos_de_contaminacion_y_del_pais_X(A,NomPaisX,NomConX);
	}

	private static void tipos_de_contaminacion_y_del_pais_X(Mp_PilaPais a, String nomPaisX, String nomConX) {
	    for (int i = 0; i < a.getNp(); i++) {
	        Pais e = a.eliminar(i);
	        if (e.getNombrePais().equals(nomPaisX)) {
	            for (int j = 0; j < e.Departamentos.nroElem(); j++) {
	                Departamento d = e.Departamentos.eliminar();
	                if (Tipo_de_contaminacion(d, nomConX)) {
	                    System.out.println(d.getNombre());
	                }
	                e.Departamentos.adicionar(d);
	            }
	        }
	        a.adicionar(i, e);
	    }
	}

	private static boolean Tipo_de_contaminacion(Departamento d, String nomConX) {
	    for (int k = 0; k < d.Prevencion.nroElem(); k++) {
	        PilaPrevencion aux2 = new PilaPrevencion();
	        while (!d.Prevencion.esVacia()) {
	            Prevencion pre = d.Prevencion.eli();
	            PilaContaminacion aux3 = new PilaContaminacion();
	            while (!pre.getContaminacion().esVacia()) {
	                Contaminacion con = pre.getContaminacion().eli();
	                if (con.getTipo_Contaminacion().equals(nomConX)) {
	                    return true;
	                }
	                aux3.adi(con);
	            }
	            pre.getContaminacion().vaciar(aux3);
	            aux2.adi(pre);
	        }
	        d.Prevencion.vaciar(aux2);
	    }
	    return false;
	}


	private static void pais_X_de_Clima_Y(Mp_PilaPais a, String nomPaX, String nomCliX) {
		int cont =0;
		double contTem=0;
		for (int i = 0; i < a.getNp(); i++) {
			Pais e = a.eliminar(i);
			if (e.getNombrePais().equals(nomPaX)) {
				for (int j = 0; j < e.Departamentos.nroElem(); j++) {
					Departamento d = e.Departamentos.eliminar();
					if (d.getClima().equals(nomCliX)) {
						System.out.println(d.getNombre());
					}
					e.Departamentos.adicionar(d);
				}
			}
			a.adicionar(i, e);
		}
	}

	private static void mostrar_pais_alto_riesgo(Mp_PilaPais a) {
		PilaPais aux = new PilaPais();
		
		int contTotal=0,total=0;
		int Max = MaximoRiesgo(a);
		for (int i = 0; i < a.getNp(); i++) {
			Pais e = a.eliminar(i);
			int cont =0;
			for (int j = 0; j < e.Departamentos.nroElem(); j++) {
				Departamento d = e.Departamentos.eliminar();
				
				if (d.getNivelDeRiesgo().equals("alto")) {
					cont++;
				}
				e.Departamentos.adicionar(d);
			} 
			aux.adi(e);
			a.adicionar(i, e);
			if (cont==Max) {
				System.out.println(e.getNombrePais());
			}
		}
	}


	private static int MaximoRiesgo(Mp_PilaPais a) {
		PilaPais aux = new PilaPais();
		int m=0;;
		for (int i = 0; i < a.Nropilas(); i++) {
			Pais p = a.eliminar(i);
			int cont=0;
			for (int j = 0; j < p.Departamentos.nroElem(); j++) {
				
				Departamento de = p.Departamentos.eliminar();
				if (de.getNivelDeRiesgo().equals("alto")) {
					cont++;
				}
				p.Departamentos.adicionar(de);
				if (cont>m) {
					m=cont;
				}
			}
			
			a.adicionar(i, p);
		}
		return m;
	}

	

	private static void mostra_el_tipo_de_clima_PaisX(Mp_PilaPais a, String xpais) {
	    for (int i = 0; i < a.getNp(); i++) {
	        Pais e = a.eliminar(i);
	        if (e.getNombrePais().equals(xpais)) {
	        	System.out.println("*****Climas frios******");
	        	boolean swF = false;
	        	boolean swT = false;
	        	boolean swC = false;
	            for (int j = 0; j < e.getDepartamentos().nroElem(); j++) {
	                Departamento d = e.getDepartamentos().eliminar();
	                if (d.getClima().equals("Frio")) {
						System.out.println(d.getNombre());
						swF=true;
					}
	                e.getDepartamentos().adicionar(d);
	            }
	            if (!swF) {
					System.out.println("No existe el clima");
				}
	            System.out.println("*******Climas Templado*****");
	            for (int j = 0; j < e.getDepartamentos().nroElem(); j++) {
	                Departamento d = e.getDepartamentos().eliminar();
	                
	                if (d.getClima().equals("Templado")) {
						System.out.println(d.getNombre());
						swT=true;
					}
	                e.getDepartamentos().adicionar(d);
	            }
	            if (!swT) {
					System.out.println("No existe el clima");
				}
	            System.out.println("***Climas Calido****");
	            for (int j = 0; j < e.getDepartamentos().nroElem(); j++) {
	                Departamento d = e.getDepartamentos().eliminar();
	                if (d.getClima().equals("Calido")) {
						System.out.println(d.getNombre());
						swC=true;
					}
	                e.getDepartamentos().adicionar(d);
	            }
	            if (!swC) {
					System.out.println("No existe el clima");
				}
	            
	        }
	        a.adicionar(i, e);
	    }
	}



	private static void ClimasPorTipo(Pais e, Departamento d, String tipoClima) {
	    if (d.getClima().equals(tipoClima)) {
	        System.out.println(d.getNombre());
	    }
	}


	private static double promedioDeTemperaturas(Mp_PilaPais a) {
		int cont =0;
		double contTem=0;
		for (int i = 0; i < a.getNp(); i++) {
			Pais e = a.eliminar(i);
			for (int j = 0; j < e.Departamentos.nroElem(); j++) {
				Departamento d = e.Departamentos.eliminar();
				for (int k = 0; k < d.meteorologia.nroElem(); k++) {
					Meteorologia m = d.meteorologia.eli();
					for (int l = 0; l < m.temperatura.nroElem(); l++) {
						Temperatura t = m.temperatura.eliminar();
						contTem+=t.getGrados();
						cont++;
						m.temperatura.adicionar(t);
					}
					d.meteorologia.adi(m);
				}
				e.Departamentos.adicionar(d);
			} 
			a.adicionar(i, e);
		}
		double total=contTem/cont;
		return total;
	}

}
