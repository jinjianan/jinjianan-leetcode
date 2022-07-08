import java.util.Arrays;

/**
 * 1491. 去掉最低工资和最高工资后的工资平均值
 */
public class $1491 {

    public double average(int[] salary) {

        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0;
        for(int n : salary){
            max = Math.max(n,max);
            min = Math.min(n,min);
            sum += n;
        }

        return (sum - max - min) / (salary.length-2);
    }
}
