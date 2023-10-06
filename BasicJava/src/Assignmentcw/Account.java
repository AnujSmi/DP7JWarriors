package Assignmentcw;

 class Info
 {
	 int eid;
	 String ename;
	 double ebalance;
	 
	 Info()
	 {
		 this(9,"Anuj");
	 }
	 Info(int eid, String ename)
	 {
		 this.eid=eid;
		 this.ename=ename;
		 ebalance=1500.1;
	 }
	 Info(int eid, String ename, double ebalance)
	 {
		 this.eid=eid;
		 this.ename=ename;
		 this.ebalance=ebalance;
	 }
	 void display()
	 {
		 String name="shree";
		 System.out.println(ename);
		 System.out.println(this.ename);
		 		 
	 }
	 public String toString()
	 {
		 return eid+" "+ename+" "+ebalance;
	 }
	
 }

public class Account { 
	public static void main(String args[])
	{
		Info i1 = new Info();
		System.out.println(i1);
		Info i2 = new Info(2,"OM");
		System.out.println(i2);
	}

}
