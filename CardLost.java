package Week01;

import java.util.Date;

public class CardLost extends Lost{

    public CardLost(String ownerName,String ownerCollege,int ownerStudentNumber,String placeOfCollection){
        super(ownerName,ownerCollege,ownerStudentNumber,placeOfCollection);
    }

    public CardLost(String place, String time, String ownerName, String ownerCollege, int ownerStudentNumber, String placeOfCollection){
        super(place, time, ownerName, ownerCollege, ownerStudentNumber, placeOfCollection);
    }

    @Override
    public String toString() {
        return this.getPickUpPlace() +","+ this.getPickUpTime() +","+ this.getPlaceOfCollection() +","+ this.getOwnerName() +","+ this.getOwnerCollege()+","+ this.getOwnerStudentNumber()+"\n";
    }
}
