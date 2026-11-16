import java.util.*;
public class LeastFrequent {
 public static int leastFrequentElement(int n,int[] a){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);return m.entrySet().stream().min(Comparator.<Map.Entry<Integer,Integer>>comparingInt(Map.Entry::getValue).thenComparingInt(Map.Entry::getKey)).map(Map.Entry::getKey).orElse(-1);}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(leastFrequentElement(n,a));}
}
