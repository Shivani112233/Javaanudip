package IsARelationship;

public class Father extends GrandFather {
	
	private String type;
	private String age;
	
	
	public void Father() {
		System.out.println("Fathers Property");
	}
	
	public Father() {
		
	}

	

	public Father(String type, String age) {
		super();
		this.type = type;
		this.age = age;
	}

	public Father(String skin, String hair,String type, String age) {
		super(skin, hair);
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Father [type=" + type + ", age=" + age + ", getType()=" + getType() + ", getAge()=" + getAge()
				+ ", getSkin()=" + getSkin() + ", getHair()=" + getHair() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
