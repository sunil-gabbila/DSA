import java.util.*;
public class DetectDuplicate {
 public static String hasDuplicate(int[] a){Set<Integer> s=new HashSet<>();for(int x:a)if(!s.add(x))return "YES";return "NO";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(hasDuplicate(a));}
}
