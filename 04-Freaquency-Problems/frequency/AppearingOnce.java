import java.util.*;
public class AppearingOnce {
 public static PriorityQueue<Integer> reapeatingOnlyOnce(int[] a){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);PriorityQueue<Integer> q=new PriorityQueue<>();for(int x:m.keySet())if(m.get(x)==1)q.add(x);return q;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(reapeatingOnlyOnce(a));}
}
