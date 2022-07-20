/**
 * 1232. 缀点成线
 */
public class $1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[1][0] - coordinates[0][0];
        int y1 = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x2 = coordinates[i][0] - coordinates[0][0];
            int y2 = coordinates[i][1] - coordinates[0][1];
            if ( y1 * x2 != y2 * x1 )
                return false;
        }
        return true;
    }

}
