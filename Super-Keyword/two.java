class A
{
    int a = 100;
    public void display()
    {
        System.out.println("Class-A Display method");
    }
}

class B extends A
{
    int a = 200;
    public void display()
    {
        super.display();
        System.out.println("Class-B Display method");
    }
}

class two
{
    public static void main(String[] args)
    {
        B obj = new B();
        System.out.println(obj.a);
        obj.display();
    }
}