interface A
{
    int add(int i , int j);
}

class five
{
    public static void main(String a[])
    {
        A obj = new A()
        {
            public int add(int i , int j)
            {
                return i + j;
            }
        };
        int result = obj.add(4,5);
        System.out.println(result);
    }
}