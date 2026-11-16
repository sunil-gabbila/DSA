import java.util.*;
public class LongestZeroSumSubArray {
 public static int checkingLongestSubArraySumEqualsZero(int n,int[] a){Map<Integer,Integer> m=new HashMap<>();m.put(0,-1);int sum=0,best=0;for(int i=0;i<n;i++){sum+=a[i];if(m.containsKey(sum))best=Math.max(best,i-m.get(sum));m.putIfAbsent(sum,i);}return best;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(checkingLongestSubArraySumEqualsZero(n,a));}
}
