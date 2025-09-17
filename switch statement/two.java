class two
{
    public static void main(String a[])
    {
        String day="wednesday";
        switch(day)
        {
            case "saturday","sunday" ->System.out.println("6am");
            case "monday" ->System.out.println("8am");
            default ->System.out.println("7am");

        }

    }
}