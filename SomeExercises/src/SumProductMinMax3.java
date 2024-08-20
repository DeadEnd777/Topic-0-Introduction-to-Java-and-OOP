
public class SumProductMinMax3 {
    public void result(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        int product = num1 * num2 * num3;

        int minP = Math.min(num2, num1);
        int minF = Math.min(num3, minP);

        int maxP = Math.max(num2, num1);
        int maxF = Math.max(num3, maxP);

        System.out.println("The sum is: "+ sum);
        System.out.println("The product is: "+ product);
        System.out.println("The min is: "+ minF);
        System.out.println("The max is: "+ maxF);
    }
}
