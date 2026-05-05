import java.util.*;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=nums/2;i++){
            if(nums%i==0){
                sum+=i;
            }
        }
        if(sum==nums) return true;
        else return false;
    }
}
