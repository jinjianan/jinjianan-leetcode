import java.util.*;

/**
 * 323. 无向图中连通分量的数目
 */
public class $323 {

    public int countComponents(int n, int[][] edges) {
        List<Integer>[] map = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int[] i : edges) {
            map[i[0]].add(i[1]);
            map[i[1]].add(i[0]);
        }

        int res = 0;
        boolean[] v = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!v[i]){
                bfs(map,i,v);
                res++;
            }
        }
        return res;
    }

    public void bfs(List<Integer>[] map , int p, boolean[] v){

        Queue<Integer> q = new LinkedList<>();
        q.offer(p);
        while (!q.isEmpty()){
            Integer cur = q.poll();
            v[cur] = true;
            List<Integer> ps = map[cur];
            for (Integer i : ps) {
                if (!v[i]) q.offer(i);
            }
        }
    }

}
