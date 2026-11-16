import java.util.*;
public class NonRepeatingValue {
 public static String nonrepeatingCharacter(String s){Map<Character,Integer> m=new HashMap<>();for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);for(char c:s.toCharArray())if(m.get(c)==1)return String.valueOf(c);return "-1";}
 public static void main(String[] z){System.out.println(nonrepeatingCharacter(new Scanner(System.in).next()));}
}
