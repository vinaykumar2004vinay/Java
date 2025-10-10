class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    @Override                                                           //Annotation
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in B show");
    }
}

public class three
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}