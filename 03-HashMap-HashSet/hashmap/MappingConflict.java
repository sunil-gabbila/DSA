import java.util.*;
public class MappingConflict {
 public static int firstCharMatchingConflict(String a,String b){if(a.length()!=b.length())return -1;Map<Character,Character> m=new HashMap<>();for(int i=0;i<a.length();i++){char x=a.charAt(i),y=b.charAt(i);if(m.containsKey(x)&&m.get(x)!=y)return i+1;m.put(x,y);}return a.length()+1;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);System.out.println(firstCharMatchingConflict(s.nextLine(),s.nextLine()));}
}
