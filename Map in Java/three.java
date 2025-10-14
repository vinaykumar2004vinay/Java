import java.util.HashMap;
import java.util.Map;

public class three
{
    public static void main(String a[])
    {
        Map<String , Integer> students = new HashMap<>();
        students.put("Vinay", 21);
        students.put("Kumar", 45);
        students.put("Ravi", 54);
        students.put("Mahesh", 87);
        students.put("Kumar", 78);
        System.out.println(students);
    }
}