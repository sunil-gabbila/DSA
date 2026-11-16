import java.util.*;
public class MaximumPrefSum {
 public static int maxPrefSum(int n,int[] a){int sum=0,best=Integer.MIN_VALUE;for(int x:a){sum+=x;best=Math.max(best,sum);}return best;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(maxPrefSum(n,a));}
}
