package medium;

public class Test12 {
    public static void main(String[] args) {

    }

    public String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String res = "";
        for(int i=0; i<13; i++){
            while(num>=values[i]){
                num -= values[i];
                res += reps[i];
            }
        }
        return res;
    }
}
