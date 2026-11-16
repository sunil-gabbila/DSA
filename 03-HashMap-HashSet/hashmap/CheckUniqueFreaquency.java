import java.util.*;
public class CheckUniqueFreaquency {
 public static String uniquefreq(int n,int[] a){Map<Integer,Integer> f=new HashMap<>();Set<Integer> seen=new HashSet<>();for(int x:a)f.put(x,f.getOrDefault(x,0)+1);for(int x:f.values())if(!seen.add(x))return "NO";return "YES";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(uniquefreq(n,a));}
}
