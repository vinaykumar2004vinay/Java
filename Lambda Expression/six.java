interface A
{
    int add(int i , int j);
}

class six
{
    public static void main(String a[])
    {
        A obj = (int i , int j) -> i+j;
        int result = obj.add(4,5);
        System.out.println(result);
    }
}