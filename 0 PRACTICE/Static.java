class College
{
	int cid;
	String name;
	String loc;
	College()  //default constructer
	{
		cid=5172;
		name="RCPIT";	
	}
	College(int cid,String name)
	{
		this.cid=cid;
		this.name=name;
	}
	College(int cid, String name,String loc)
	{
		this.cid=cid;
		this.name=name;
		this.loc=loc;
	}
	void display()
	{
		System.out.println("the college id is ="+cid);
		System.out.println("the college name is ="+name);
		System.out.println("the college location is ="+loc);
	}
}
public class Static {
	public static void main(String[] args) {
		College obj=new College();
		
		College obj1=new College(200,"MII");
		
		College obj2=new College(100,"COEP","PUNE");
		
		obj.display();
		obj1.display();
		obj2.display();
	}
}
