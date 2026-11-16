import java.util.*;
public class EquilibriumSum {
 public static int equilibriumSumIndex(int n,int[] a){int total=0,left=0;for(int x:a)total+=x;for(int i=0;i<n;i++){if(left==total-left-a[i])return i;left+=a[i];}return -1;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(equilibriumSumIndex(n,a));}
}
