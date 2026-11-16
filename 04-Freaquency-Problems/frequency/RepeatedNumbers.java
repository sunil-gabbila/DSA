import java.util.*;
public class RepeatedNumbers {
 public static List<Integer> iterativeNumbers(int[] a){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);List<Integer> r=new ArrayList<>();for(int x:m.keySet())if(m.get(x)>1)r.add(x);Collections.sort(r);return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(iterativeNumbers(a));}
}
