package AccesSpecifierDemo;

public class AccessSpecifierExample {

	//data member
	private String name;
	
	//Default data member is default it will access only inside the package
	public void display()
	{
		System.out.println("The name is:"+name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

		
	

