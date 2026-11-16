import java.util.*;
public class TopKFrequent {
 public static ArrayList<Integer> frequentK(int n,int[] a,int k){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);ArrayList<Integer> r=new ArrayList<>(m.keySet());r.sort((x,y)->m.get(x)==m.get(y)?Integer.compare(x,y):Integer.compare(m.get(y),m.get(x)));return new ArrayList<>(r.subList(0,Math.min(k,r.size())));}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(frequentK(n,a,s.nextInt()));}
}
