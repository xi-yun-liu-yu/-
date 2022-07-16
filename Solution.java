package Week01;

import java.util.ArrayList;

import static java.sql.Date.valueOf;

public class Solution {
    public void sortLost(Lost[] lostArray) {
        int i,j;
        int flag;

        int L = lostArray.length;

        for (i=L-1; i>0; i--) {

            flag = 0;
            // 初始化标记为0
            // 将a[0...i]中最大的数据放在末尾
            for (j=0; j<i; j++) {
                if ((valueOf(lostArray[j].getPickUpTime())).after(valueOf(lostArray[j+1].getPickUpTime()))) {
                    Lost tmp = lostArray[j];
                    lostArray[j] = lostArray[j+1];
                    lostArray[j+1] = tmp;
                    flag = 1;
                    // 若发生交换，则设标记为1
                }
            }
            if (flag==0)
                break;
            // 若没发生交换，则说明数列已有序。
        }
    }
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        ArrayList<Lost> key = new ArrayList<>();
        int j = 0;

        for (Lost lost : lostArray) {
            if (lost.getPlaceOfCollection().equals(keyword)) {
                key.add(j,lost);
                j++;
            }
        }
        Lost[] end = new Lost[key.size()];
        key.toArray(end);
        return end;
    }
}
