import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 244. 最短单词距离 II
 */
public class $244 {

    class WordDistance {
        String[] wordsDict;

        public WordDistance(String[] wordsDict) {
            this.wordsDict = wordsDict;
        }

        public int shortest(String word1, String word2) {
            int a = -1;
            int b = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < wordsDict.length; i++) {
                if (word1.equals(wordsDict[i])) a = i;
                if (word2.equals(wordsDict[i])) b = i;
                if (a != -1 && b != -1)
                    min = Math.min(Math.abs(a-b),min);
            }

            return min;
        }
    }

    class WordDistance2 {
        Map<String, List<Integer>> map;

        public WordDistance2(String[] wordsDict) {
            map = new HashMap<>();
            for (int i = 0; i < wordsDict.length; i++) {
                if (!map.containsKey(wordsDict[i]))
                    map.put(wordsDict[i],new ArrayList<>());
                map.get(wordsDict[i]).add(i);
            }
        }

        public int shortest(String word1, String word2) {
            List<Integer> a = map.get(word1);
            List<Integer> b = map.get(word2);
            int min = Integer.MAX_VALUE;
            for(int i1 : a)
                for(int i2 : b)
                    min = Math.min(min,Math.abs(i1-i2));
            return min;
        }
    }

}
