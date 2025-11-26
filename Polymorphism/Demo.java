public class Demo
{
    public static void main(String[] args)
    {
        SavingsAcc a1 = new SavingsAcc();
        a1.setAcc_id(101);
        a1.setAcc_name("Vinay");
        a1.setAcc_bal(25000.00);
        a1.setMin_Bal(3000.00);

        System.out.println(a1.getAcc_id());
        System.out.println(a1.getAcc_name());
        System.out.println(a1.getAcc_bal());
        System.out.println(a1.getMin_Bal());
    }
}
