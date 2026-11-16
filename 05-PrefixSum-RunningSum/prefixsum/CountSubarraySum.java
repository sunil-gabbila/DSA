import java.util.*;
public class CountSubarraySum {
 public static int countSubArraysSumEqualsZero(int n,int[] a){Map<Integer,Integer> m=new HashMap<>();m.put(0,1);int sum=0,count=0;for(int x:a){sum+=x;count+=m.getOrDefault(sum,0);m.put(sum,m.getOrDefault(sum,0)+1);}return count;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(countSubArraysSumEqualsZero(n,a));}
}
