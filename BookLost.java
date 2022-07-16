package Week01;

import java.util.Date;

public class BookLost extends Lost{

    private String BookName;
    //书名

    //以下构造器基本和父类相同
    public BookLost(String placeOfCollection,String bookName){
        super(placeOfCollection);
        BookName = bookName;
    }

    public BookLost(String ownerName,String ownerCollege,int ownerStudentNumber,String placeOfCollection,String bookName){
        super(ownerName,ownerCollege,ownerStudentNumber,placeOfCollection);
        BookName = bookName;
    }

    public BookLost(String place,String time,String placeOfCollection,String bookName){
        super(place,time,placeOfCollection);
        BookName = bookName;
    }
    public BookLost(String place,String time,String ownerName,String placeOfCollection,String bookName){
        super(place,time,ownerName,placeOfCollection);
        BookName = bookName;
    }

    public BookLost(String place,String time,String ownerName,String ownerCollege,String placeOfCollection,String bookName){
        super(place,time,ownerName,ownerCollege,placeOfCollection);
        BookName = bookName;
    }

    public BookLost(String place, String time, String ownerName, String ownerCollege, int ownerStudentNumber, String placeOfCollection, String bookName){
        super(place,time,ownerName,ownerCollege,ownerStudentNumber,placeOfCollection);
        BookName = bookName;
    }



    public String getBookName() {
        return BookName;
    }
    //获取书名

    public void setBookName(String bookName) {
        BookName = bookName;
    }
    //设置书名


    @Override
    public String toString() {
        return this.getPickUpPlace() +","+ this.getPickUpTime() +","+ this.getPlaceOfCollection() +","+ this.getOwnerName() +","+ this.getOwnerCollege()+","+ this.getOwnerStudentNumber()+","+this.getBookName()+"\n";

    }
}
