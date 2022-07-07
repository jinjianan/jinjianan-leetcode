import java.util.ArrayList;
import java.util.List;

/**
 * 77. 组合
 */
public class $77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int [] data = new int[n];
        for(int i = 0 ; i < n ; i++)
            data[i] = i+1;
        f(data,0,new ArrayList<>(),res,0 ,k);
        return res;
    }

    public void f(int[] data,int v, List<Integer> now,List<List<Integer>> res,int depth,int k ){

        if(depth == k){
            res.add(new ArrayList<>(now));
            return;
        }

        for(int i=v;i<data.length;i++){
            now.add(data[i]);
            f(data,i+1,now,res,depth+1,k);
            now.remove(now.size() - 1);
        }
    }

}
