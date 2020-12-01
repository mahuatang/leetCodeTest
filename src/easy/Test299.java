package easy;

import java.util.ArrayList;
import java.util.List;

public class Test299 {
    public static void main(String[] args) {
       // System.out.println(getHint("1807", "7810"));
       // System.out.println(getHint("1123", "0111"));
       // System.out.println(getHint("11", "11"));

        int a = "1807".charAt(7) - '0';
        System.out.println(a);

    }

    /**
     * 好的解法
     public String getHint(String secret, String guess) {
     int[] bucket = new int[10];
     int bull = 0;
     int cow = 0;
     for(int i=0;i<secret.length();i++){
     if(secret.charAt(i)== guess.charAt(i)){
     bull++;
     continue;
     }
     bucket[secret.charAt(i) - '0'] += 1;
     bucket[guess.charAt(i) - '0'] -= 1;

     }
     //计算bucket中正值的个数
     for(int i=0;i<10;i++){
     if(bucket[i] > 0)
     cow+= bucket[i];
     }

     cow = secret.length() - cow - bull;
     String res = bull + "A" + cow + "B";
     return res;
     }
     */

    public static String getHint(String secret, String guess) {
        int result1 = 0;
        StringBuffer buffer1 = new StringBuffer(secret);
        StringBuffer buffer2 = new StringBuffer(guess);
        for (int i = 0; i < buffer1.length(); i++) {
            if (buffer1.charAt(i) == buffer2.charAt(i)) {
                result1++;
                buffer1.deleteCharAt(i);
                buffer2.deleteCharAt(i);
                i--;
            }
        }

        int result2 = 0;
        for (int i = 0; i < buffer1.length(); i++) {
            for (int j = 0; j < buffer2.length(); j++) {
                if (buffer1.charAt(i) == buffer2.charAt(j)) {
                    result2++;
                    buffer2.deleteCharAt(j);
                    break;
                }
            }
        }

        return result1 + "A" + result2 + "B";
    }

    public static List<String> convertStringToList(String str) {
        String[] cc = str.split("");
        List<String> list = new ArrayList<>();
        for (String c : cc) {
            list.add(c);
        }
        return list;
    }
}
