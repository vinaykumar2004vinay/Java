class six
{
    public static void main(String a[])
    {
        int num = 7;
        Integer num1 = num;  //auto-boxing
        int num2 = num1;  //auto-unboxing
        System.out.println(num2);
        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}