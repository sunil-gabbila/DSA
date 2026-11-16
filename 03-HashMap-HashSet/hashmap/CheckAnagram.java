import java.util.*;
public class CheckAnagram {
 public static String anagramCheck(String a,String b){if(a.length()!=b.length())return "NO";Map<Character,Integer> m=new HashMap<>();for(char c:a.toCharArray())m.put(c,m.getOrDefault(c,0)+1);for(char c:b.toCharArray()){if(!m.containsKey(c))return "NO";int n=m.get(c)-1;if(n==0)m.remove(c);else m.put(c,n);}return m.isEmpty()?"YES":"NO";}
 public static void main(String[] z){Scanner s=new Scanner(System.in);System.out.println(anagramCheck(s.next(),s.next()));}
}
