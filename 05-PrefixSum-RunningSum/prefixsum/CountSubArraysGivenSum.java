import java.util.*;
public class CountSubArraysGivenSum {
 public static int countSubArraysSumEqualsTarget(int n,int[] a,int target){Map<Integer,Integer> m=new HashMap<>();m.put(0,1);int sum=0,count=0;for(int x:a){sum+=x;count+=m.getOrDefault(sum-target,0);m.put(sum,m.getOrDefault(sum,0)+1);}return count;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(countSubArraysSumEqualsTarget(n,a,s.nextInt()));}
}
