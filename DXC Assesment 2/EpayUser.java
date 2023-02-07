

package Dxc;

class WalletUser {
	private int id;
	private String username;
	private String emailId;
    private double walletBalance;

    public User(int id, String username,String emailId,double walletBalance)
    {
    	this.id=id;
    	this.username=username;
    	this.emailId=emailId;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) 
    {
        if (walletBalance >= billAmount) 
        {
            walletBalance -= billAmount;
            return true;
        }
        else 
        {
        return false;
    }
        public int getId() 
        {
        	return Id;
        	}
        	public void setId(int id)
        	{
        	this.id = Id;
        	}
        	public String getUserName() 
        	{
        	return userName;
        	}
        	public void setUserName(String userName) 
        	{
        	this.userName = userName;
        	}
        	public String getEmailId()
        	{
        	return emailId();
        	}
        	public void setEmailId(String emailId) 
        	{
        	return emailId;
        	}
    public double getWalletBalance()
    {
        return walletBalance;
    }
    public void setWalletBalance(double walletBalance)
    {
    	return walletBalance;
    	}
}

class KYCUser  
{
    private double rewardPoints;
    public KYCUser(int id, String userName, String emailId, double walletBalance)
    {
    
    public boolean makePayment(double billAmount)
    {
        boolean paymentSuccess = makePayment(billAmount);
        if (paymentSuccess) 
        {
            rewardPoints += 0.1 * billAmount;
        }
        return paymentSuccess;
    }

    public int getRewardPoints() 
    {
        return rewardPoints;
    }
}
    class EPay
    {
    	public static void processPaymentByUser(User user, double billAmount) { 
    		boolean paymentSuccess = (billAmount); 
    		if (paymentSuccess) 
    		{
    			System.out.println("Payment successful, remaining wallet balance: + user.getWalletBalance());}"
    					 else
    					 {
    		System.out.println("Insufficient balance, payment failed");

    		} if (user instanceof KYCUser) { KYCUser kycUser = (KYCUser)

    		user;

    		System.out.println("Rewardpoints: " + kycUser.getRewardPoints());

    		}

    		}

    		}
public class WalletTester {
    public static void main(String[] args) {
        WalletUser u1 = new WalletUser(100);
        EPay.processPaymentByUser(u1, 50);
        
        KYCUser k1 = new KYCUser(200);
        EPay.processPaymentByUser(k1, 100);
    }
}