import java.util.HashMap;
import java.util.Map;

public class one
{
    public static void main(String a[])
    {
        Map<String , Integer> students = new HashMap<>();
        students.put("Vinay", 21);
        students.put("Kumar", 45);
        students.put("Ravi", 54);
        students.put("Mahesh", 87);
        System.out.println(students);
    }
}