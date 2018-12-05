package ParkingLot;

public class ParkingLot {


    public static void main (String [] args){
        System.out.println("Starting the Parking lot class");

        Level l1 = new Level(50,0);
        Level l2 = new Level(50,0);
        Level l2 = new Level(25,0);


    }   

}


public class ParkingLotBuilding{
    
    public ParkingLotBuilding{
        
    }
}

public class Level{

    private int levelID;
    private int slotCount;

    public Level(int slotCount , int levelID){
        this.LevelID = levelID;
        this.slotCount = slotCount;
    }


    public int GetSlotCount(){
        return this.slotCount;
    }

    //Returns the remaining slot count
    public int GetASlot(){
        return this.slotCount -1;
    }

    public int levelID(){
        return this.levelID;
    }

}
