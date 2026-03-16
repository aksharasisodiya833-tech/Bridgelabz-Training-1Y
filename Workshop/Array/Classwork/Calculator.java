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
		int addition =c1.add(10,20);
		System.out.println("Addition of two number :-"+addition);
		int subtraction=c1.sub(20,10);
		System.out.println("Substraction of two number :-"+subtraction);
		int divide=c1.div(20,10);
		System.out.println("Divide of two number :-"+divide);
		int multiplication=c1.mul(10,20);
		System.out.println("Multiplication of two number :-"+multiplication);
	}
}