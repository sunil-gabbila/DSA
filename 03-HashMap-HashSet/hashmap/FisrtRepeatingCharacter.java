import java.util.*;
public class FisrtRepeatingCharacter {
 public static String fisrtReapeatedOne(String s){Set<Character> seen=new HashSet<>();for(char c:s.toCharArray())if(!seen.add(c))return String.valueOf(c);return "-1";}
 public static void main(String[] z){System.out.println(fisrtReapeatedOne(new Scanner(System.in).next()));}
}
