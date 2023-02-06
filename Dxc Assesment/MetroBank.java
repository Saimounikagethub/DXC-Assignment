
public class MetroBank {
public static void main(String[] args) 
{
	
	double accountNumber= 1001;
	double salary= 40000;
	double accountBalance= 250000;
	String loanType= "car";
	double loanAmountExpected=300000;
	int emisExpected=30;
	if ( accountNumber<2000 && salary>25000 && accountBalance>999 && loanType=="car" && loanAmountExpected<500000 && emisExpected<37)
	{
	    System.out.println("Your account number is "+accountNumber);
	    System.out.println("you are eligible for bank loan");
	    System.out.println("Eligible Loan amount is $"+loanAmountExpected);
	    emisExpected=36;
	    System.out.println("Eligible EMI is "+emisExpected);
	}
	else if (accountNumber<2000 && salary>50000 && accountBalance>999 && loanType=="house" && loanAmountExpected<6000000 && emisExpected<61)
	{
	System.out.println("Your account number is "+accountNumber);
	System.out.println("you are eligible for bank loan");
	System.out.println("Eligible Loan amount is $"+loanAmountExpected);
	emisExpected=60;
	System.out.println("Eligible EMI is "+emisExpected);
	}
	else if (accountNumber<2000 && salary>75000 && accountBalance>999 && loanType=="business" && loanAmountExpected<7500000 && emisExpected<85)
	{
	    System.out.println("Your account number is "+accountNumber);
	    System.out.println("you are eligible for bank loan");
	    System.out.println("Eligible Loan amount is $"+loanAmountExpected);
	    emisExpected=84;
	    System.out.println("Eligible EMI is "+emisExpected);
	}
	else 
	{
	    System.out.println("Sorry!!! you are not eligible");
	}
}}