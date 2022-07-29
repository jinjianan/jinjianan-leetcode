/**
 * 702. 搜索长度未知的有序数组
 */
public class $702 {

    public int search(ArrayReader reader, int target) {
        int l = 0, r = 10000;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (reader.get(mid) == target) return mid;
            else if (reader.get(mid) > target)
                r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    interface ArrayReader {
        public int get(int index);
    }
}
