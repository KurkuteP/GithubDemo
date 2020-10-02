
public class Test extends JavaPrac {
	//It will execute first parent class Java Prac Constructor and then child class Test java
	
	public Test(){
		System.out.println("ppp");
	}
	
    int a=9;
    
    public void Demo(){
    	super.Demo();//It will execute parent class method first
    	 int a=8;
    	 int c=a+this.a;
    	System.out.println(a);
    	System.out.println(this.a);//it refers to global variable int a=9;
    	System.out.println(c);
    }
	public static void main(String[] args) {
		
		Test t=new Test();
		t.Demo();
		
		/*int a[][]= {{1,2},{3,4}};
		for(int i=0;i<=1;i++) {
			
			for(int j=0;j<=1;j++)
			{
				
				System.out.print(a[i][j]);
				
				
			}
			System.out.println("");
		}*/
		
		
	}

}
