package IsARelationship;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandFather gg = new GrandFather();
		gg.setHair("black");
		gg.setSkin("wHite");
		System.out.println(gg);
		gg.mainfunction();

		
		
		Father fg =new Father();
		fg.setType("thin");
		fg.setAge("45");
		fg.setHair("brown");
		fg.setSkin("white");
		System.out.println(fg);
		System.out.println(fg);
		fg.Father();
		fg.mainfunction();
		
		
		Son s=new Son();
		s.setHeight("23");
		s.setType("thick");
		s.setAge("32");
		s.setHair("black");
		s.setSkin("cremy");
		
		
		
		System.out.println(s);
		s.Father();
		s.mainfunction();
		
		
		
		Father fg2=new Father("black", "thick");
		
		Son s2=new Son();

	}

}
