package softwaretechnik_uebung7_2;

public class TeamEditor {

	public static void main(String[] args) 
	{
		Athlete a = new Athlete("Justus",2);
		Athlete b = new Athlete("Bob");
		Athlete c = new Athlete("Barbara");
		Athlete d = new Athlete("Angelika",1);
		Athlete e = new Athlete("Manfred",4);
		Athlete f = new Athlete("Peter");
		Athlete g = new Athlete("Karlheinz",5);
		Athlete h = new Athlete("Mia",3);
		Athlete i = new Athlete("Emma");
		Athlete j = new Athlete("Lena",2);
		Athlete k = new Athlete("Bela");
		
		CompositeTeam t1 = new CompositeTeam("Olympics Team");
		CompositeTeam t2 = new CompositeTeam("Asia Team");
		CompositeTeam t3 = new CompositeTeam("Africa Team");
		CompositeTeam t4 = new CompositeTeam("Europe Team");
		CompositeTeam t5 = new CompositeTeam("America Team");
		
		t1.addTeam(t2);
		t1.addTeam(t3);
		t1.addTeam(t4);
		t1.addTeam(t5);
		
		CompositeTeam a1 = new CompositeTeam("China Team");
		CompositeTeam a2 = new CompositeTeam("Afghanistan Team");
		
		t2.addTeam(a1);
		t3.addTeam(a2);
		
		CompositeTeam e1 = new CompositeTeam("German Team");
		CompositeTeam e2 = new CompositeTeam("Italian Team");
		
		t4.addTeam(e1);
		t4.addTeam(e2);
		
		CompositeTeam w1 = new CompositeTeam("Woman´s Team");
		CompositeTeam w2 = new CompositeTeam("Woman´s Team");
		CompositeTeam w3 = new CompositeTeam("Woman´s Team");
		
		a1.addTeam(w1);
		e1.addTeam(w2);
		e2.addTeam(w3);
		
		CompositeTeam m1 = new CompositeTeam("Man´s Team");
		CompositeTeam m2 = new CompositeTeam("Man´s Team");
		CompositeTeam m3 = new CompositeTeam("Man´s Team");
		
		a2.addTeam(m1);
		e1.addTeam(m2);
		e2.addTeam(m3);
		
		CompositeTeam s1 = new CompositeTeam("Teakwondo");
		CompositeTeam s2 = new CompositeTeam("Waterpolo");
		CompositeTeam s3 = new CompositeTeam("Artistic Gymnastic");
		CompositeTeam s4 = new CompositeTeam("Shooting");
		CompositeTeam s5 = new CompositeTeam("Cycling");
		CompositeTeam s6 = new CompositeTeam("Tennis");
		CompositeTeam s7 = new CompositeTeam("Table Tennis");
		CompositeTeam s8 = new CompositeTeam("Football");
		CompositeTeam s9 = new CompositeTeam("Alpine Sky");
		CompositeTeam s10 = new CompositeTeam("Football");
		CompositeTeam s11 = new CompositeTeam("Swimming Team");
		
		w1.addTeam(s1);
		w1.addTeam(s2);
		w1.addTeam(s3);
		m1.addTeam(s4);
		w2.addTeam(s5);
		w2.addTeam(s6);
		m2.addTeam(s7);
		m2.addTeam(s8);
		w3.addTeam(s9);
		m3.addTeam(s10);
		m3.addTeam(s11);
		
		s1.addTeam(a);
		s2.addTeam(b);
		s4.addTeam(c);
		s5.addTeam(d);
		s8.addTeam(f);
		s8.addTeam(e);
		s9.addTeam(g);
		s10.addTeam(h);
		s11.addTeam(i);
		s9.addTeam(j);
		s6.addTeam(k);
		
		t1.getNumberofGolds();

	}

}
