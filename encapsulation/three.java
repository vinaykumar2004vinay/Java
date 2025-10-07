class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class three
{
    public static void main(String a[])
    {
        Human obj=new Human();
        obj.setAge(25);
        obj.setName("Vinay");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}