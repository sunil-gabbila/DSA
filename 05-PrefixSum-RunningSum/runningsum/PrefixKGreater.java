import java.util.*;
public class PrefixKGreater {
 public static int prefixSumGreaterThanK(int n,int[] a,int k){int sum=0;for(int i=0;i<n;i++){sum+=a[i];if(sum>=k)return n-1-i;}return 0;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(prefixSumGreaterThanK(n,a,s.nextInt()));}
}
