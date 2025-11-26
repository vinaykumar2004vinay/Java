public class Demo1
{
    public static void main(String[] args)
    {
        SavingsAcc a1 = new SavingsAcc();
        a1.setAcc_id(101);
        a1.setAcc_name("Vinay");
        a1.setAcc_bal(25000.00);
        a1.setMin_Bal(3000.00);
        System.out.println(a1.getAcc_id() + "-" + a1.getAcc_name() + "-" + a1.getAcc_bal() + "-" + a1.getMin_Bal()); 

        System.out.println("--------------------------------------------------------------");

        CurrentAcc a2 = new CurrentAcc();
        a2.setAcc_id(102);
        a2.setAcc_name("Rahul");
        a2.setAcc_bal(45000.00);
        // a2.setMin_Bal(3500.00);
        System.out.println(a2.getAcc_id() + "-" + a2.getAcc_name() + "-" + a2.getAcc_bal());  
    }
}