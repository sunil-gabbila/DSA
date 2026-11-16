import java.util.*;
public class CharTransCheck {
 public static String charTransformCheck(String a,String b){if(a.length()!=b.length())return "NO"; Map<Character,Character> m=new HashMap<>(); Map<Character,Character> r=new HashMap<>(); for(int i=0;i<a.length();i++){char x=a.charAt(i),y=b.charAt(i);if(m.containsKey(x)&&m.get(x)!=y||r.containsKey(y)&&r.get(y)!=x)return "NO";m.put(x,y);r.put(y,x);}return "YES";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);System.out.println(charTransformCheck(s.nextLine(),s.nextLine()));}
}
