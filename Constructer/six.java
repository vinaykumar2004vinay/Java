class Human
{
    private String Name;
    private int Age;

    public Human()
    {
        Age = 22;;
        Name = "Vinay";
    }

    public Human(int a,String n)
    {
        Age = a;
        Name = n;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

}

public class six
{
    public static void main(String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human(45,"John");
        
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj.setAge(22);
        // obj.setName("Vinay");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}