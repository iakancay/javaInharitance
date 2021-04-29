package inharitanceBankDemo;

public class BaseKredi {
	private String name;

	public String getName() {
		return name="Base";
	}
	public void calculate() {
		System.out.println(this.getName()+" Kredisi hesaplandi.");
	}

}
