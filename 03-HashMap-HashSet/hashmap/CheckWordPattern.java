import java.util.*;
public class CheckWordPattern {
 public static String checkPattern(String p,String[] a){if(p.length()!=a.length)return "NO";Map<Character,String> m=new HashMap<>();Map<String,Character> r=new HashMap<>();for(int i=0;i<p.length();i++){char c=p.charAt(i);String w=a[i];if(m.containsKey(c)&&!m.get(c).equals(w)||r.containsKey(w)&&r.get(w)!=c)return "NO";m.put(c,w);r.put(w,c);}return "YES";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);String p=s.nextLine();System.out.println(checkPattern(p,s.nextLine().split(" ")));}
}
