class Calc {
 public void add(){
int a = 10, b = 20;
System.out.println("sum =" + (a +b));

}
 public void prod()
{
    int x = 5,y = 10;
    System.out.println("product=" + (x * y));
}
}

class Test
{
     public static void main(String args[])
     {
   Calc ob = new Calc();
   Calc ob1 = new Calc();
   Calc ob2 = new Calc();
   ob.add();
   System.out.println("Hello world");
   ob.add();
   System.out.println("hello");
    }
}