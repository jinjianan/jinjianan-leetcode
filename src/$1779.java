/**
 * 1779. 找到最近的有相同 X 或 Y 坐标的点
 */
public class $1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int p = -1;
        int d = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if ( (points[i][0] == x || points[i][1] == y) && (Math.abs(points[i][0] - x)+ Math.abs(points[i][1] - y) < d) ){
                p = i;
                d = Math.abs(points[i][0] - x)+ Math.abs(points[i][1] - y);
            }
        }
        return p;
    }

}
