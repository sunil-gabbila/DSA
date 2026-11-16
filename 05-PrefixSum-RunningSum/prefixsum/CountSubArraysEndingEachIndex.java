import java.util.*;
public class CountSubArraysEndingEachIndex {
 public static int[] checkingSubArrays(int n,int[] a,int k){Map<Integer,Integer> m=new HashMap<>();m.put(0,1);int sum=0;int[] r=new int[n];for(int i=0;i<n;i++){sum+=a[i];r[i]=m.getOrDefault(sum-k,0);m.put(sum,m.getOrDefault(sum,0)+1);}return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(checkingSubArrays(n,a,s.nextInt())));}
}
