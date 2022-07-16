package Week01;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        //先创建两个数组来存放失物信息
        CardLost[] cardLost = new CardLost[8];
        cardLost = MakeCardLost();
        BookLost[] bookLost = new BookLost[8];
        bookLost = MakeBookLost();

        //先打印一次原数组
        System.out.println("一卡通：\n"+Arrays.toString(cardLost));
        System.out.println("书籍：\n"+Arrays.toString(bookLost));

        Solution solution = new Solution();

        //先测试一下sortLost()
        solution.sortLost(cardLost);
        solution.sortLost(bookLost);
        System.out.println("排序后一卡通：\n"+Arrays.toString(cardLost));
        System.out.println("排序后书籍：\n"+Arrays.toString(bookLost));

        //再测试一下selectByKeyword（）
        System.out.println("筛选风华后一卡通：\n"+Arrays.toString(solution.selectByKeyword(cardLost,"风华失物招领处")));
        System.out.println("筛选莘莘后书籍：\n"+Arrays.toString(solution.selectByKeyword(bookLost,"莘莘失物招领处")));


    }

    public static CardLost[] MakeCardLost(){
        CardLost[] cardLost = new CardLost[8];

        cardLost[0] = new CardLost("三教二楼3201","2022-7-11","老赵","国际学院",11451400,"三教失物招领处");

        cardLost[1] = new CardLost("四教三楼4301","2022-7-15","老钱","计算机学院",11451401,"莘莘失物招领处");

        cardLost[2] = new CardLost("五教四楼5401","2022-7-17","老孙","外国语学院",11451402,"风华失物招领处");

        cardLost[3] = new CardLost("六教五楼6501","2022-7-18","老李","光电学院",11451403,"太极失物招领处");

        cardLost[4] = new CardLost("七教六楼7601","2022-7-16","老周","经管学院",11451404,"延生失物招领处");

        cardLost[5] = new CardLost("八教七楼8701","2022-7-10","老吴","传媒学院",11451405,"老图失物招领处");

        cardLost[6] = new CardLost("一教一楼1101","2022-7-09","老郑","马克思主义学院",11451406,"勤工助学中心值班室");

        cardLost[7] = new CardLost("二教一楼2101","2022-7-18","老王","安法学院",11451407,"风华失物招领处");

        return cardLost;
    }

    public static BookLost[] MakeBookLost(){

        BookLost[] bookLost = new BookLost[8];

        bookLost[0] = new BookLost("八教八楼8801","2022-6-1","老冯","理学院",11451408,"风华失物招领处","共产党宣言");

        bookLost[1] = new BookLost("七教七楼7701","2022-6-6","老陈","邮政学院",11451408,"三教失物招领处","帝国主义是资本主义的最高阶段");

        bookLost[2] = new BookLost("六教六楼6601","2022-6-10","老楚","生物学院",11451408,"太极失物招领处","实践论");

        bookLost[3] = new BookLost("五教五楼5501","2022-6-7","老魏","通信学院",11451408,"莘莘失物招领处","矛盾论");

        bookLost[4] = new BookLost("四教四楼4401","2022-6-24","老蒋","体育学院",11451408,"延生失物招领处","论持久战");

        bookLost[5] = new BookLost("三教三楼3301","2022-6-30","老沈","经管学院",11451408,"莘莘失物招领处","毛泽东选集");

        bookLost[6] = new BookLost("二教二楼2201","2022-6-5","老韩","自动化学院",11451408,"老图失物招领处","毛泽东语录");

        bookLost[7] = new BookLost("一教一楼1101","2022-6-13","老杨","软件学院",11451408,"三教失物招领处","资本论");

        return bookLost;
    }
}
