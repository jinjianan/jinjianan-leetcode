/**
 * 1523. 在区间范围内统计奇数数目
 */
public class $1523 {
    public int countOdds(int low, int high) {
        // 1 2   //1
        // 2 3     //1
        // 2 3 4   //1
        // 3 4 5 6  //
        int len = high - low + 1;
        if (low % 2 != 0) return len / 2 + len % 2;
        else return len / 2 ;
    }
}
