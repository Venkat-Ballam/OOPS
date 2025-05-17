// Multi Level Inheritance

class Grand_Parent_Classs 
{
    double landProperty;
    String house;

    Grand_Parent_Classs(double landProperty , String house) 
	{
        	this.landProperty = landProperty;
        	this.house = house;
    	}

    void grandParentPropery() 
	{
        	System.out.println("As Grand Parent I Have Own Properties Of : ");
        	System.out.println("Land : " + landProperty + " acres");
        	System.out.println("House : " + house);
    	}
}

class Parent_Class extends Grand_Parent_Classs 
{
    int bike;
    String bikeName;

    Parent_Class(double landProperty, String house, int bike, String bikeName)
	{
        	super(landProperty, house);  // Call grandparent constructor
        	this.bike = bike;
        	this.bikeName = bikeName;
    	}

    void ParentPropery() 
	{
        	System.out.println("As Parent I Have Own Properties And My Parent's Properties: ");
        	System.out.println("Bikes : " + bike);
        	System.out.println("Bike Name : " + bikeName);
        	System.out.println("Land : " + landProperty + " acres");
        	System.out.println("House : " + house);
    	}
}

class Child_Class extends Parent_Class 
{
    	int car;
    	String carName;

    	Child_Class(double landProperty, String house, int bike, String bikeName, int car, String carName) 
	{
        	super(landProperty, house, bike, bikeName);  // Call parent constructor
        	this.car = car;
        	this.carName = carName;
    	}

    void childPropery() 
	{
        	System.out.println("As Child I Have Own Properties And My Parent's Properties Along With Grand Parent's Properties : ");
        	System.out.println("Cars : " + car + " car");
        	System.out.println("Car Name : " + carName);
        	System.out.println("Bikes : " + bike);
        	System.out.println("Bike Name : " + bikeName);
        	System.out.println("Land : " + landProperty + " acres");
        	System.out.println("House : " + house);
    	}
}

class Main 
{
    public static void main(String args[]) 
	{
        	Child_Class cc = new Child_Class(55.2, "3BHK", 2, "KTM & Bullet Classic - 350", 2, "Fortuner Sigma - 4 & Mercedes Benz c 220");
        
		System.out.println();
	        cc.grandParentPropery(); // Inherited method
        	System.out.println("-----------------------------------------------------");
		cc.ParentPropery();      // Inherited method
		System.out.println("-----------------------------------------------------");
        	cc.childPropery();       // Own method
		System.out.println("-----------------------------------------------------");
    	}
}
