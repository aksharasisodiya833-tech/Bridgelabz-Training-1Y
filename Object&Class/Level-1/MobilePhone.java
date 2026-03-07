public class MobilePhone{
	private String brand;
	private String model;
	private int price;
	public MobilePhone(String brand,String model,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void displayDetail(){
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
	}
	public static void main(String args[]){
		MobilePhone p1 = new MobilePhone("Samsung","Galaxy A55",400000);
		p1.displayDetail();
	}
}