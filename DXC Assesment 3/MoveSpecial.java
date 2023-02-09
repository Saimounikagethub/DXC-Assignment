package Dxc;
public class MoveSpecial
{
	private String s;
	public MoveSPecial(String s)
	{
		this.s = s;
	}
	public String getMoveSplC() 
	{
		String str = s.replaceAll("[A-Za-z0-9]","");
		String a = s.replaceAll("[^A-Za-z0-9]","");
		return str+a;
	}

	public void setMoveSplC(String s) {
		this.s = s;
	}	
}
public class MoveCharacters
{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String in = str.nextLine();
		MoveSplC a = new MoveSplC(in);
		
		System.out.println(a.getMsc());
	}
}