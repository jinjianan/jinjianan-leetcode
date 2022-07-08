/**
 * 69. x 的平方根
 */
public class $69 {

    public static int mySqrt(int x) {
        long l = 0;
        long r = x;
        // 1 2 3 4 5 6 7
        //    A
        while (l < r){
            long mid = (r - l + 1) / 2 + l;
            if ( mid * mid <= x ) l = mid;
            else r = mid - 1;
        }

        return (int)l;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));;
    }
}
