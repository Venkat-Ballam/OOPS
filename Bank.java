// Hierarchical Inheritance

class Hierarchical_Inheritance
{
	long accountNumber, aadhaarNumber;
	int photos;
	String accountName, panCardNumber;
	boolean kyc;
	
	Bank(long accountNumber, String accountName, long aadhaarNumber, String panCardNumber, int photos, boolean kyc)
	{
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.aadhaarNumber  = aadhaarNumber;
		this.panCardNumber = panCardNumber;
		this.photos = photos;
		this.kyc = kyc;
	}
		void printAccountDeails(int loan)
		{
			System.out.println("-------------------");
			System.out.println("Account Number : "+accountNumber);
			System.out.println("Account Name : "+accountName);
			System.out.println("Aadhaar Number : "+aadhaarNumber);
			System.out.println("Pan Card Number : "+panCardNumber);
			System.out.println("Photos : "+photos);
			System.out.println("KYC : "+kyc);
			System.out.println("-----------------------------------------------------------------");

			if(kyc == true)
			{
				this.loanApplicable(loan);
			}
			else
			{
				System.out.println("Loan Is Not Applicable Because KYC Is Pending!");
				System.out.println("-----------------------------------------------------------------");
			}
		}

		void loanApplicable(int loan)
		{
			System.out.println("Loan Applicable Amount Of : "+loan);
			System.out.println("-----------------------------------------------------------------");
		}
}

class StateBankOfIndia extends Bank
{
	StateBankOfIndia(long accountNumber, String accountName, long aadhaarNumber, String panCardNumber, int photos, boolean kyc)
	{
		super(accountNumber,accountName,aadhaarNumber,panCardNumber,photos,kyc);
		System.out.println("State Bank Of India");
	}
}

class IndianBank extends Bank
{
	IndianBank(long accountNumber, String accountName, long aadhaarNumber, String panCardNumber, int photos, boolean kyc)
	{
		super(accountNumber,accountName,aadhaarNumber,panCardNumber,photos,kyc);
		System.out.println("Indian Bank");
	}
}

class UnionBank extends Bank
{
	UnionBank(long accountNumber, String accountName, long aadhaarNumber, String panCardNumber, int photos, boolean kyc)
	{
		super(accountNumber,accountName,aadhaarNumber,panCardNumber,photos,kyc);	
		System.out.println("Union Bank");	
	}
}

class CanaraBank extends Bank
{
	CanaraBank(long accountNumber, String accountName, long aadhaarNumber, String panCardNumber, int photos, boolean kyc)
	{
		super(accountNumber,accountName,aadhaarNumber,panCardNumber,photos,kyc);
		System.out.println("Canara Bank");
	}
}

class Main 
{
	public static void main(String args[])
	{
		System.out.println("-----------------------------------------------------------------");
		CanaraBank cb = new CanaraBank(123456789,"Venkat",45040349,"GQQPB1545D",2,true);
		cb.printAccountDeails(250000);

                UnionBank ub = new UnionBank(987654321,"Ravi",152664,"GWWPR$TY",2,false);
		ub.printAccountDeails(470000);

		IndianBank ib = new IndianBank(75395146,"Nagu",152463,"GBNFU65GJ",1,true);
		ib.printAccountDeails(845000);

		StateBankOfIndia sbi = new StateBankOfIndia(1793268,"My3",45040349,"ZML5426KJ",3,true);
		sbi.printAccountDeails(1000000);
	}
}


