import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ouo {
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        List<Integer> numList = new ArrayList<Integer>();
        Set<String> numSet = new HashSet<String>();
        List<String> numList2 = new ArrayList<String>();
        for (int i : num)
        {
            numList.add(i);
            numSet.add(Integer.toString(i));
        }
        for (String i : numSet)
            numList2.add(i);

        int m =numList.size()-numSet.size();

        for (int x = 0 ; x<m;x++)
            numList2.add("_");
        System.out.println("input : "+numList);
        System.out.println("=================================================");
        System.out.println("輸出 = "+numSet.size() +"個");
        System.out.println("刪除相同元素後: "+numList2);
    }
}