class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0){
            return new int[][]{{newInterval[0],newInterval[1]}};
        }
        
        int[][] arr = new int[intervals.length+1][2];
        boolean flag = true;
        int  index=0;
        int a = 0;
        while(index < intervals.length){
            if(flag && newInterval[0] < intervals[index][0]){
                arr[a][0] = newInterval[0];
                arr[a][1] = newInterval[1];
                flag = false;
            }
            else{
                arr[a][0] = intervals[index][0]; 
                arr[a][1] = intervals[index][1];
                index++;
            }
            a++;
        }
        if(flag == true){
            arr[a][0] = newInterval[0];
            arr[a][1] = newInterval[1];
        }
        
        Map<Integer,Integer> map = new LinkedHashMap<>();
        map.put(arr[0][0],arr[0][1]);
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(map.get(arr[j][0]) >= arr[i][0])
                map.put(arr[j][0],Math.max(arr[i][1],map.get(arr[j][0])));
            else{
                map.put(arr[i][0],arr[i][1]);
                j=i;
            }
        }
        int[][] out = new int[map.size()][2];
        int i = 0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            out[i][0] = mp.getKey();
            out[i][1] = mp.getValue();
            i++;
        }

        return out;
    }
}