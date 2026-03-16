class Calculator{
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
	return a-b;
}
    public int div(int a,int b){
		return a/b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int mod(int a,int b){
		return a%b;
	}
	public static void main(String args[]){
		Calculator c1=new Calculator();
		c1.add(10,20);
		System.out.println(c1.add(10,20));
		c1.sub(20,10);
		System.out.println(c1.sub(20,10));
		c1.div(20,10);
		System.out.println(c1.div(20,10));
		c1.mul(10,20);
		System.out.println(c1.mul(10,20));
		c1.mod(20,10);
		System.out.println(c1.mod(20,10));
	}
}