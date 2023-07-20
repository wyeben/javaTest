package tdd;

public class Calculator {
int num;


    public long getFactorial(long num) {
            boolean isNegativeNumber = num < 0;
            if (isNegativeNumber){
                System.out.println("invalid number");
                System.exit('1');
            }
            boolean isNumberZeroOne = (num==0||num==1);
            if(isNumberZeroOne){
                return 1;
            }
            long total = 1;
            while(num !=0) {
                total = total * num;
                num = num -1;
            }
        return total;
        }
}
