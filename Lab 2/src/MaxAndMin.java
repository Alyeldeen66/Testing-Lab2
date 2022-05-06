public class MaxAndMin {
    public int getMax(int [] n){
        int maxElement = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i] > maxElement){
                maxElement = n[i];
            }
        }
        return maxElement;
    }
    public int getMin(int [] n){
        int minElement = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i] < minElement){
                minElement = n[i];
            }
        }
        return minElement;
    }
}
