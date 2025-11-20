class Test
{
    public void M1(int i)
    {
        System.out.println("M1-Method & int augumented type");
    }

    public void M1(float f)
    {
        System.out.println("M1-Method & float augumented type");
    }

    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.M1(10);
        obj.M1(20.7f);    
    }
}