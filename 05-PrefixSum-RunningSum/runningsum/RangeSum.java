import java.util.*;
public class RangeSum {
 public static ArrayList<Integer> rangeSum(int n,int[] a,int[][] q){int[] p=new int[n];for(int i=0;i<n;i++)p[i]=a[i]+(i==0?0:p[i-1]);ArrayList<Integer> r=new ArrayList<>();for(int[] x:q)r.add(p[x[1]]-(x[0]==0?0:p[x[0]-1]));return r;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=s.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();int m=s.nextInt();int[][] q=new int[m][2];for(int i=0;i<m;i++){q[i][0]=s.nextInt();q[i][1]=s.nextInt();}System.out.println(rangeSum(n,a,q));}
}
