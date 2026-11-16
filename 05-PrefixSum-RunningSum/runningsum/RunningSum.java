import java.util.*;
public class RunningSum {
 public static int[] buildRunningSum(int n,int[] a){int[] r=new int[n];int sum=0;for(int i=0;i<n;i++)r[i]=sum+=a[i];return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(buildRunningSum(n,a)));}
}
