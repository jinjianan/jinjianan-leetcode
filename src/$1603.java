
/**
 * 1603. 设计停车系统
 */
public class $1603 {

    class ParkingSystem {

        int[] p;

        public ParkingSystem(int big, int medium, int small) {
            p = new int[4];
            p[1] = big;
            p[2] = medium;
            p[3] = small;
        }

        public boolean addCar(int carType) {
            if (p[carType] > 0) {
                p[carType] -= 1;
                return true;
            }
            return false;
        }
    }

}
