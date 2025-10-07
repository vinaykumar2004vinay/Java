class Human
{
    private int age = 21;
    private String name = "Vinay";

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }
}

public class two
{
    public static void main(String a[])
    {
        Human obj=new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}