import java.util.*;
public class SubArraySum {
 public static String subarraySumEqualsTarget(int n,int[] a,int k){Set<Integer> sums=new HashSet<>();sums.add(0);int sum=0;for(int x:a){sum+=x;if(sums.contains(sum-k))return "YES";sums.add(sum);}return "NO";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(subarraySumEqualsTarget(n,a,s.nextInt()));}
}
