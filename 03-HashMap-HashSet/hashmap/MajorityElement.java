import java.util.*;
public class MajorityElement {
 public static int majorityCheck(int n,int[] a){Map<Integer,Integer> m=new HashMap<>();for(int x:a)m.put(x,m.getOrDefault(x,0)+1);for(int x:m.keySet())if(m.get(x)>n/2)return x;return -1;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(majorityCheck(n,a));}
}
