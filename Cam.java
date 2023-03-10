package Sai;

public class Cam {

	
	private String brand;
	private double cost;

	public Cam() {
		this.brand = "Nikon";
	}
    
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

class DigitalCamera extends Cam {
	private int memory;

	public DigitalCamera(String brand, double cost) {
		this.memory = 16;
		setBrand(brand);
		setCost(cost);
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
}

class CamTester {
	public static void main(String[] args) {
        DigitalCamera cam = new DigitalCamera("Canon",100);
        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
    }
}