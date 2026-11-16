import java.util.*;
public class FrequentElement {
 public static int mostOccurances(int[] a){if(a.length==0)return -1;Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);return m.entrySet().stream().max(Comparator.<Map.Entry<Integer,Integer>>comparingInt(Map.Entry::getValue).thenComparing(e->-e.getKey())).get().getKey();}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(mostOccurances(a));}
}
