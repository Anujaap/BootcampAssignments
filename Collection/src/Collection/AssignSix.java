package Collection;

import java.util.*;

//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
public class AssignSix {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        System.out.println("Enter the values of array");
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i:arr){
            if(a.containsKey(i)) a.put(i,a.get(i)+1);
            else a.put(i,1);
        }
        List<Map.Entry<Integer, Integer>> entries1=new ArrayList<>(a.entrySet());
        Collections.sort(entries1, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        System.out.println(entries1);
    }
}

