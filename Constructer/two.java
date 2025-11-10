class Human
{
    private String Name;
    private int Age;

    public Human()
    {
        System.out.println("In a Constructer");
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

public class two
{
    public static void main(String args[])
    {
        Human obj = new Human();
        
        System.out.println(obj.getName() + " : " + obj.getAge());

        obj.setAge(22);
        obj.setName("Vinay");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}