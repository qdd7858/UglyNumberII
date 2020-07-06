import java.util.ArrayList;

public class Main {

    public int nthUglyNumber(int n) {
        ArrayList<Integer> ugly = new ArrayList<>();
        ugly.add(1);
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        int num2 = ugly.get(index2)*2;
        int num3 = ugly.get(index3)*3;
        int num5 = ugly.get(index5)*5;
        int i = 0;
        while(i < n){
            ugly.add(Integer.min(num2,Integer.min(num3,num5)));
            if (ugly.get(i+1) == num2){
                index2++;
                num2 = ugly.get(index2)*2;
            }
            if (ugly.get(i+1) == num3){
                index3++;
                num3 = ugly.get(index3)*3;
            }
            if (ugly.get(i+1) == num5){
                index5++;
                num5 = ugly.get(index5)*5;
            }
            i++;
        }
        return ugly.get(i-1);
    }

    public static void main(String[] args){
        Main m = new Main();
        System.out.println(m.nthUglyNumber(100));
    }
}
