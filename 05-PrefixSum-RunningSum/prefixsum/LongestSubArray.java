import java.util.*;
public class LongestSubArray {
 public static int checkingLongestSubArraySumEqualsSum(int n,int[] a,int target){Map<Integer,Integer> m=new HashMap<>();m.put(0,-1);int sum=0,best=0;for(int i=0;i<n;i++){sum+=a[i];if(m.containsKey(sum-target))best=Math.max(best,i-m.get(sum-target));m.putIfAbsent(sum,i);}return best;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(checkingLongestSubArraySumEqualsSum(n,a,s.nextInt()));}
}
