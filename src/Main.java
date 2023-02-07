import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;


public class Main {
    public static List<String> ShowMenu() {
        return Arrays.asList("1.CASE 1", "2.CASE 2", "3.CASE 3","4.CASE 4");
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("first case",0);
        map.put("secand case",0);
        map.put("third case",0);

        List<String> arrayList1=new ArrayList();
        arrayList1.add("first case");
        arrayList1.add("secand case");
        arrayList1.add("third case");
        Boolean ExistMenu = Boolean.TRUE;
        while (ExistMenu) {



            for (String x : ShowMenu()) {

                System.out.println(x);
            }
            System.out.println("plz enter number");
            Scanner sc=new Scanner(System.in);
            int userInput=sc.nextInt();
            switch (userInput) {
                case 1:
                    Integer Count = map.get("first case");
                    Count++;
                    map.put("first case", Count);
                    break;
                case 2:
                    Integer Count1 = map.get("secand case");
                    Count1++;
                    map.put("secand case", Count1);
                    break;
                case 3:
                    Integer Count2 = map.get("third case");
                    Count2++;
                    map.put("third case", Count2);
                    break;
                case 4:
                    for (String x : arrayList1) {
                        System.out.println(x + "   " + map.get(x));
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userInput);
            }

        }
    }
}