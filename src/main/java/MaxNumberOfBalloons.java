import java.util.*;

public class MaxNumberOfBalloons {
    public static int solution(String text){
        Map<Character,Integer> map = new HashMap<>();
        String balloon = "balloon";
        for(int i=0;i<balloon.length();i++){
            map.put(balloon.charAt(i),0);
        }
        for(int j=0;j<text.length();j++){
            if(map.containsKey(text.charAt(j))){
                map.put(text.charAt(j),map.get(text.charAt(j))+1);
            }
        }
        map.put('l',map.get('l')/2);
        map.put('l',map.get('o')/2);
        Collection<Integer> values = map.values();
        Object[] ob = values.toArray();
        Arrays.sort(ob);
        return (int)ob[0];
    }

    public static void main(String[] args) {
        String text = "nlaebolko";
        int num = solution(text);
        System.out.println("aaaaa:"+num);
    }
}
