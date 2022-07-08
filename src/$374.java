/**
 * 374. 猜数字大小
 */
public class $374 {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    int guess(int num){
        return 0;
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        while(l <= r){
            int mid = (r - l ) / 2 + l;
            int g = guess(mid);
            if(g == 0) return mid;
            else if ( g == 1) l = mid + 1;
            else r = mid - 1 ;
        }

        return -1;
    }

}
