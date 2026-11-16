import java.util.*;
public class N3Times {
 public static ArrayList<Integer> majorityCheck(int n,int[] a){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);ArrayList<Integer> r=new ArrayList<>();for(int x:m.keySet())if(m.get(x)>n/3)r.add(x);Collections.sort(r);if(r.isEmpty())r.add(-1);return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(majorityCheck(n,a));}
}
