public class LowestCommonDemoninator {
    public static void main (String[] args){
        System.out.println(lowestCommonDemoninator(3, 1, 6, 2));
    }
    public static int lowestCommonDemoninator(int num1, int num2, int denom1, int denom2, int i, int j){
        if (denom1 % num1 == 0){
            denom1 = (int) denom1/num1;
        }
        if (denom2 % num1 == 0){
            denom2 = (int) denom2/num2;
        }
        if (denom2 % denom1 == 0){
            return denom2;
        }
        else if (denom1 % denom2 == 0){
            return denom1;
        }
        else{
            if (denom1 < denom2){
                return lowestCommonDemoninator(denom1 + denom1/i, denom2, i+1, j);
            }
            else{
                return lowestCommonDemoninator(denom1, denom2 + denom2/j, i, j+1);
            }
        }
    }

    public static int lowestCommonDemoninator(int num1, int num2, int denom1, int denom2){
        return lowestCommonDemoninator(num1, num2, denom1, denom2, 1, 1);
    }
}
