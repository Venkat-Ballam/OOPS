//Single_Inheritance

class ParentClass
{
	int id , price;
	double quantity;
	char grade;
	String productName;
	boolean ordered;

	ParentClass(int id, String productName, double quantity, char grade, int price, boolean ordered)
	{
		this.id = id;
		this.quantity = quantity;
		this.grade = grade;
		this.productName = productName;
		this.ordered = ordered;
		this.price = price;
	}
		double totalCost(int price , double quantity)
		{
			return price * quantity;
		}
}

class ChildClass extends ParentClass
{		
	ChildClass()
	{
		super(101,"Laptop",2,'A',58999,true);
	}
		void printData()
		{
			System.out.println("-------------------------------------------");
			System.out.println("Product Id \t : "+id);
			System.out.println("Product Name     : "+productName);
			System.out.println("Product Quantity : "+quantity);
			System.out.println("Product Class \t : "+grade);
			System.out.println("Product Price \t : "+price);
			System.out.println("Total Price \t : "+totalCost(price,quantity));
			System.out.println("Order Placed \t : "+ordered);
		}
}

class Main
{
	public static void main(String args[])
	{
		ChildClass cc = new ChildClass();
		cc.printData();
	}
}