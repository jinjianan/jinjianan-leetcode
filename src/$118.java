import java.util.ArrayList;
import java.util.List;

/**
 * 118. 杨辉三角
 */
public class $118 {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) t.add(1);
                else
                    t.add(prev.get(j - 1) + prev.get(j));
            }
            res.add(t);
            prev = t;
        }
        return res;
    }


}
