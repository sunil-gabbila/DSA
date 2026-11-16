import java.util.*;
public class SmallestSubArray {
 public static int smallestCSubArraySumEquals(int n,int[] a,int target){Map<Integer,Integer> m=new HashMap<>();m.put(0,-1);int sum=0,best=Integer.MAX_VALUE;for(int i=0;i<n;i++){sum+=a[i];if(m.containsKey(sum-target))best=Math.min(best,i-m.get(sum-target));m.put(sum,i);}return best==Integer.MAX_VALUE?-1:best;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(smallestCSubArraySumEquals(n,a,s.nextInt()));}
}
