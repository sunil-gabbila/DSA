import java.util.*;
public class MaxCharacterCount {
 public static char maxCharCount(String s){Map<Character,Integer> m=new HashMap<>();for(char c:s.toCharArray())m.put(c,m.getOrDefault(c,0)+1);char best=' ';int n=0;for(char c:m.keySet())if(m.get(c)>n){best=c;n=m.get(c);}return best;}
 public static void main(String[] z){System.out.println(maxCharCount(new Scanner(System.in).next()));}
}
