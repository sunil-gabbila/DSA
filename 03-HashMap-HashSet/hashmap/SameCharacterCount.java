import java.util.*;
public class SameCharacterCount {
 public static String checkingCharCountAreSame(String a,String b){if(a.length()!=b.length())return "NO";Map<Character,Integer> m=new HashMap<>();for(char c:a.toCharArray())m.put(c,m.getOrDefault(c,0)+1);for(char c:b.toCharArray())m.put(c,m.getOrDefault(c,0)-1);for(int n:m.values())if(n!=0)return "NO";return "YES";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);System.out.println(checkingCharCountAreSame(s.next(),s.next()));}
}
