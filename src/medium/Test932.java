package medium;

//此题看不懂
public class Test932 {
    public int[] beautifulArray(int N) {
        int array[] = new int[2000];
        int array2[] = new int[N];
        int k =0;
        array[0] = 2;
        array[1] = 1;
        array[2] = 4;
        array[3] = 3;
        for(int i = 1;i<200;i*=2){
            for(int j = 0;j<i * 4;j++){
                array[i * 4+j] = array[j]*2;
                array[j] = array[j]*2-1;
            }
        }

        for(int i = 0;i<2000;i++){
            if(k<N&&array[i]!=0&&array[i]<=N){

                array2[k] = array[i];
                k++;
            }

        }

        return array2;
    }
}
