import java.util.*;
public class CountTargetElement {
 public static int occurance(int[] a,int target){int n=0;for(int x:a)if(x==target)n++;return n;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println("Count = "+occurance(a,s.nextInt()));}
}
