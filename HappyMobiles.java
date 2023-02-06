package Sai;
interface Testable{
	boolean testCompatibility();
}

class Mobile {
	
private String name, brand, operatingSystemName, operatingSystemVersion;

public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
	super();
	this.name = name;
	this.brand = brand;
	this.operatingSystemName = operatingSystemName;
	this.operatingSystemVersion = operatingSystemVersion;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getOperatingSystemName() {
	return operatingSystemName;
}

public void setOperatingSystemName(String operatingSystemName) {
	this.operatingSystemName = operatingSystemName;
}

public String getOperatingSystemVersion() {
	return operatingSystemVersion;
}

public void setOperatingSystemVersion(String operatingSystemVersion) {
	this.operatingSystemVersion = operatingSystemVersion;
}

}

class SmartPhone extends Mobile implements Testable {
	private String networkGeneration;

	public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
		super(name, brand, operatingSystemName, operatingSystemVersion);
		this.networkGeneration =networkGeneration;
	}

	public String getNetworkGenreation() {
		return networkGeneration;
	}

	public void setNetworkGenreation(String networkGenreation) {
		this.networkGeneration = networkGenreation;
	}
	
	public boolean testCompatibility() {
		
		if(getOperatingSystemName()== "Saturn") {
			if(networkGeneration == "3G") {
				if(getOperatingSystemVersion() == "1.1" ||
				   getOperatingSystemVersion() == "1.2" ||
				   getOperatingSystemVersion() == "1.3")
					return true;
				}
				
			else if(networkGeneration == "4G") {
				if(getOperatingSystemVersion() == "1.2" ||
				   getOperatingSystemVersion() == "1.3")
					return true;
			}
			else if(networkGeneration == "5G") {
				if(getOperatingSystemVersion() == "1.3")
					return true;
			}
		}
		
		else if(getOperatingSystemName()== "Gara") {
			if(networkGeneration == "3G") {
				if(getOperatingSystemVersion() == "EXRT.1" ||
				   getOperatingSystemVersion() == "EXRT.2" ||
				   getOperatingSystemVersion() == "EXRU.3")
					return true;
				}
				
			else if(networkGeneration == "4G") {
				if(getOperatingSystemVersion() == "EXRT.2" ||
				   getOperatingSystemVersion() == "EXRU.1")
					return true;
			}
			else if(networkGeneration == "5G") {
				if(getOperatingSystemVersion() == "EXRU.1")
					return true;
			}
		}
		return false;
	}
	

}
class HappyMobiles {
	public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
		if(smartPhone.testCompatibility())
			System.out.println("The mobile OS is compatible with the network generation!");
		else
			System.out.println("The mobile OS is not compatible with the network generation!");
		
	}
}