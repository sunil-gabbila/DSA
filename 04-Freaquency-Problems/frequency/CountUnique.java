import java.util.*;
public class CountUnique {
 public static int unique(int[] a){return new HashSet<Integer>(){{for(int x:a)add(x);}}.size();}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(unique(a));}
}
