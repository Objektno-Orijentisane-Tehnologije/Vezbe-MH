package vezbe;

import java.util.HashMap;
import java.util.Map;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Moveable;
import geometry.Point;
import geometry.Rectangle;

public class TestingClass {

	
	public static void main(String[] args) throws Exception {
		
//		int prviBroj = 16;
//		int drugiBroj = 10;
//		String tekst = "Danasnji datum je: " + prviBroj + "."
//				+ drugiBroj + ".2024.";
//		System.out.println(tekst);
//		
//		int dnevnaTemperatura = 24;
//		int jutarnjaTemperatura = 7;
//		String testTekst = "Danas je suncano";
//		System.out.println("Razlika u temperaturi je: " + 
//		(dnevnaTemperatura - jutarnjaTemperatura));
//		System.out.println(testTekst + " sa " + dnevnaTemperatura
//				+ " stepeni celzijusa");
//		boolean tacnost = false;
//		System.out.println(testTekst + ":" + tacnost);
//		
//		double decimalniBroj = 40;
//		System.out.println(decimalniBroj);
//		int randomBroj = 40.40;
		
		
		//Zadatak 2
//		dnevnaTemperatura = 8;
//		jutarnjaTemperatura = 3;
//		
//		int razlika = dnevnaTemperatura - jutarnjaTemperatura;
//		if(razlika > 20) {
//			System.out.println("Obucite se slojevito");
//		}else {
//			System.out.println("Danas nas ocekuje prijatan raspon dnevne"
//					+ " i  jutarnje temperature");
//		}
//		if(dnevnaTemperatura > 30) {
//			System.out.println("Nanesite zastitu od UV zracenja na izlozene"
//					+ " deloze koze");
//			
//		}
//		else {
//			System.out.println("Danasnji UV indeks je nizak");
//		}
//		if(dnevnaTemperatura < 10) {
//			System.out.println("Toplo se obucite!");
//		}
//		
		//Petlje - Zadatak 3
//		int zbir = 0;
//		for(int brojac = 0; brojac<=200; brojac++) {
//			if(brojac % 2 == 0) {
//				zbir = zbir + brojac;
//			}
//		}
//		System.out.println(zbir);
//		
//		int brojac = 0;
//		zbir = 0;
//		while(brojac<=200) {
//			zbir += brojac;
//			brojac = brojac +2;
////			brojac += 2;
//		}
//		System.out.println(zbir);
		
//		Zadatak 4
//		int brojPrestupnihGodina = 0;
//		for(int godina = 2024; godina <=2100; godina+=4) {
//			if(godina == 2024) {
//				continue;
//			}
//			if(godina  % 4 == 0) {
//				if(godina % 100 == 0) {
//					if(godina % 400 == 0) {
//						brojPrestupnihGodina++;
//					}
//				}
//				else {
//					brojPrestupnihGodina++;
//				}
//			}
//		}
//		
//		System.out.println(brojPrestupnihGodina);
		
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 3
		 */
		
		
//		int broj = 20;
		Point p1 = new Point();
//		System.out.println(p1);
//		System.out.println("Vrednost x koordinate je: " + p1.x);
//		System.out.println("Vrednost y koordinate je: " + p1.y);
//		System.out.println("Vrednost selected koordinate je: " + p1.selected);
//		p1.x = 50;
//		p1.y = 10;
//		p1.selected = true;
//		System.out.println("Vrednost x koordinate je: " + p1.x);
//		System.out.println("Vrednost y koordinate je: " + p1.y);
//		System.out.println("Vrednost selected koordinate je: " + p1.selected);
		
		Point p2 = new Point();
//		p1 = p2;
//		System.out.println("Vrednost x koordinate tacke p1 je: " + p1.x);
//		p1.x = 30;
//		p2.x = 10;
//		System.out.println("Vrednost x koordinate p2 je: " + p2.x);
//		System.out.println("Vrednost x koordinate p1 je: " + p1.x);
//		p1 = new Point();
//		p1.x = 20;	
		
//		System.out.println(p1.distance(p2));
		
		/* Od ove linije se koriste get i set metode */
		p1.setX(30);
//		System.out.println(p1);
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 4
		 */
		p2.setX(20);
		Line l1 = new Line();
//		System.out.println("Vrednost startPoint-a je: " + l1.getStartPoint());
//		System.out.println("Vrednost endPoint-a je: " + l1.getEndPoint());
//		System.out.println("Vrednost selected-a je: " + l1.isSelected());
//		l1.getStartPoint().getX(); OVDE NE FUNKCIONISE ZATO STO JE
//		START POINT NULL
		
		l1.setStartPoint(p1);
//		System.out.println(l1.getStartPoint().getX());
		
		l1.setEndPoint(new Point());
//		System.out.println(l1.getEndPoint().getX());
//		
//		System.out.println(l1.length());
//		System.out.println(l1.getStartPoint().distance(l1.getEndPoint()));
//		
//		System.out.println(l1.getStartPoint());
//		System.out.println(p1);
//		
//		System.out.println(l1.getEndPoint());
//		System.out.println(new Point());
		
		Rectangle r1 = new Rectangle();
		r1.setWidth(10);
		r1.setHeight(20);
//		System.out.println(r1.area());
//		System.out.println(r1.circumference());
//		
		Circle c1 = new Circle();
//		c1.setRadius(20);
//		System.out.println(c1.area());
//		System.out.println(c1.circumference());
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 5
		 */
		
		Point p3 = new Point(40,40);
//		System.out.println(p3.getX());
		Line l2 = new Line(p3, new Point(20,20),true);
		Rectangle r2 =  new Rectangle(p2, 50, 50);
		Circle c2 = new Circle(new Point(35,35), 15);
//		System.out.println(p1);
//		p1.toString();
		r2.toString();
		
		Object testObject = new Circle(p3, 30);
		
//		testObject.area();
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 6
		 */
		
//		p1.setX(40);
//		p1.setY(40);
//		System.out.println(p1.equals(p3));
//		l1.getEndPoint().setX(15);
//		l1.getEndPoint().setY(20);
//		System.out.println(l1.equals(l2));
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 7
		 */
		
//		Donut d1 = new Donut(30);
		Donut d1 = new Donut(new Point(10,10), 30, 20, true);
		System.out.println(d1 instanceof Circle);
//		System.out.println(d1.getCenter());
//		System.out.println(d1.getRadius());
		System.out.println(d1);
		try {
			c1.setRadius(0);
		} catch (Exception e) {
			e.printStackTrace();
//			throw new Exception(e.getMessage());
		}
		System.out.println(c1.equals(d1));
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 8
		 */
//		Primer poziva ka statickoj konstanti
//		System.out.println(Moveable.BROJ);
		
		
		/*
		 * =============================================
		 * =============================================
		 * 					VEZBE 9
		 */
//		Primer poziva ka statickoj konstanti
//		System.out.println(Moveable.BROJ);
		
//		1. Nacin deklaracije niza - eksplicitni
		int[] nizBrojeva = new int[5];
		nizBrojeva[0] = 4;
		nizBrojeva[1] = 5;
		nizBrojeva[2] = 6;
		nizBrojeva[3] = 7;
		nizBrojeva[4] = 8;
		
//		2. Nacin deklaracije niza - implicitna duzina
		int[] drugiNizBrojeva = {4,5,6,7,8};
		
		System.out.println("Trenutni redosled niza: ");
		for(int i:drugiNizBrojeva) {
			System.out.print(i + " ");
		}
		System.out.println("\nRedosled niza unazad: ");
		for(int i = drugiNizBrojeva.length-1; i>=0 ; i--) {
			System.out.print(drugiNizBrojeva[i] + " ");
		}
		
		int[] treciNizBrojeva = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\nStanje niza nakon mnozenja: ");
		for(int i = 0; i<treciNizBrojeva.length; i++) {
			treciNizBrojeva[i] *= 5;
			System.out.print(treciNizBrojeva[i] + " ");
		}
		
		HashMap<String, String> openWith = new HashMap<String,String>();
		openWith.put("txt","notepad.exe");
		openWith.put("bmp","paint.exe");
		openWith.put("dib","paint.exe");
		openWith.put("rtf","wordpad.exe");
		
		openWith.replace("rtf", "winword.exe");
		if(!openWith.containsKey("tif")) {
			System.out.println("Nije pronadjen kljuc \"tif\" ");
		}
		
		if(!openWith.containsKey("ht")) {
			openWith.put("ht", "hypertrm.exe");
			System.out.println("Vrednost dodata kljucu = ht:" + 
			openWith.get("ht"));
		}
		
		for(Map.Entry<String, String> pair: openWith.entrySet()) {
			System.out.println(pair);
		}
		
		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
