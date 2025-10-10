interface A
{
    int add(int i , int j);
}

class seven
{
    public static void main(String a[])
    {
        A obj = (i , j) -> i+j;
        int result = obj.add(4,5);
        System.out.println(result);
    }
}