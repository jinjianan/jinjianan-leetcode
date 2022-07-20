import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 */
public class $1356 {

    public int[] sortByBits(int[] arr) {
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, ( o1,  o2) ->
                Integer.bitCount(o1) == Integer.bitCount(o2) ? Integer.compare(o1, o2) : (Integer.bitCount(o1) > Integer.bitCount(o2) ? 1 : -1));
        return Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
    }

    public int[] sortByBits1(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr)
            list.add(i);

        list.sort((o1, o2) ->{
                    int c1 = Integer.bitCount(o1);
                    int c2 = Integer.bitCount(o2);
                    return c1 == c2? Integer.compare(o1, o2) : (c1 > c2 ? 1 : -1);
                });

        for (int i = 0; i < arr.length; i++)
            arr[i] = list.get(i);
        return arr;
    }

}
