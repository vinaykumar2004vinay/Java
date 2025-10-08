class five
{
    public static void main(String a[])
    {
        int num = 7;
        Integer num1 = num;  //autoboxing
        int num2 = num1.intValue();  //unboxing
        System.out.println(num2);
    }
}