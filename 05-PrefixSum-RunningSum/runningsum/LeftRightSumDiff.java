import java.util.*;
public class LeftRightSumDiff {
 public static int[] leftRightDiff(int n,int[] a){int total=0,left=0;for(int x:a)total+=x;int[] r=new int[n];for(int i=0;i<n;i++){r[i]=Math.abs(total-left-a[i]-left);left+=a[i];}return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(leftRightDiff(n,a)));}
}
