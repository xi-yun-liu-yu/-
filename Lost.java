package Week01;

import java.util.Date;

public class Lost {
    private String PickUpPlace;
    //拾取地点
    private String PickUpTime;
    //拾取时间(yyyy-mm-dd)
    private String OwnerName;
    //物品主人姓名
    private String OwnerCollege;
    //物品主人的学院
    private int OwnerStudentNumber;
    //物品主人的学号
    private String PlaceOfCollection;
    //领取地点

    //个人认为不太可能存在以上信息都不知道的情况，所以就没有写无参构造

    public Lost(String placeOfCollection){
        PlaceOfCollection = placeOfCollection;
    }
    //考虑到可能存在有人放下失物就走，或者因为其他原因没有登记信息，而失物也没有啥信息可以提供。
    //所以该构造器只写入领取地点。

    public Lost(String ownerName,String ownerCollege,int ownerStudentNumber,String placeOfCollection){
        OwnerCollege = ownerCollege;
        OwnerName = ownerName;
        OwnerStudentNumber = ownerStudentNumber;
        PlaceOfCollection = placeOfCollection;
    }
    //该构造器写入失主信息与领取地点
    public Lost(String place,String time,String placeOfCollection){
        PickUpPlace = place;
        PickUpTime = time;
        PlaceOfCollection = placeOfCollection;
    }
    //很可能失物上并没有标注主人的信息
    //所以该构造器只写入拾取的时间地点及领取地点

    public Lost(String place,String time,String ownerName,String placeOfCollection){
        PickUpPlace = place;
        PickUpTime = time;
        PlaceOfCollection = placeOfCollection;
        OwnerName = ownerName;
    }
    //因为可能重名，所以存在名字不能锁定失主的情况
    //所以该构造器供失主信息只有名字的时候

    public Lost(String place,String time,String ownerName,String ownerCollege,String placeOfCollection){
        PickUpPlace = place;
        PickUpTime = time;
        PlaceOfCollection = placeOfCollection;
        OwnerName = ownerName;
        OwnerCollege = ownerCollege;
    }
    //因为有重名的可能，所以不一定能提供名字和学院查出失主学号
    //所以该构造器供不知道失主学号时使用

    public Lost(String place,String time,String ownerName,String ownerCollege,int ownerStudentNumber,String placeOfCollection){
        PickUpPlace = place;
        PickUpTime = time;
        PlaceOfCollection = placeOfCollection;
        OwnerName = ownerName;
        OwnerCollege = ownerCollege;
        OwnerStudentNumber = ownerStudentNumber;
    }
    //如果知道失主的学号，就能查出他的学院和姓名，所以不存在只知道学号的情况

    //以下方法用于改变或调取该Lost对象的属性。

    public void setOwnerCollege(String ownerCollege) {
        OwnerCollege = ownerCollege;
    }
    //设置失主学院

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
    //设置失主名字

    public void setOwnerStudentNumber(int ownerStudentNumber) {
        OwnerStudentNumber = ownerStudentNumber;
    }
    //设置失主学号

    public void setPickUpPlace(String pickUpPlace) {
        PickUpPlace = pickUpPlace;
    }
    //设置拾取地点

    public void setPickUpTime(String pickUpTime) {
        PickUpTime = pickUpTime;
    }
    //设置拾取时间

    public void setPlaceOfCollection(String placeOfCollection) {
        PlaceOfCollection = placeOfCollection;
    }
    //设置领取地点

    public String getOwnerCollege() {
        return OwnerCollege;
    }
    //获取失主学院

    public String getOwnerName() {
        return OwnerName;
    }
    //获取失主姓名

    public int getOwnerStudentNumber() {
        return OwnerStudentNumber;
    }
    //获取失主学号

    public String getPickUpPlace() {
        return PickUpPlace;
    }
    //获取拾取地点

    public String getPickUpTime() {
        return PickUpTime;
    }
    //获取拾取时间

    public String getPlaceOfCollection() {
        return PlaceOfCollection;
    }
    //获取领取地点8

}
