package entities;

public  class Department {
	private static String name;
	
	public  Department() {
	}

	public  Department(String name) {
		Department.name = name;
	}

	public  String getName() {
		return name;
	}

	public  void setName(String name) {
		Department.name = name;
	}
	
}
