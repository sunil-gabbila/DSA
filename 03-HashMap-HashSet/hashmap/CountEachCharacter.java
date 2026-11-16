import java.util.*;
public class CountEachCharacter {
 public static TreeMap<Character,Integer> characterCount(String s){TreeMap<Character,Integer> m=new TreeMap<>();for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);return m;}
 public static void main(String[] z){Scanner s=new Scanner(System.in);characterCount(s.next()).forEach((k,v)->System.out.println(k+" "+v));}
}
