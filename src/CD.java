public class CD extends OpticalDisk implement Disc{
    public CD(double capacity, String unit, int occupiedPercentage, boolean reRecordable){
        super(capacity, unit, occupiedPercentage, reRecordable);
    }

    @Override
    public void read(){
        System.out.println("Reading device CD");
    }
    @Override
    public void save(double s){
        double occupiedSpace = super.getCapacity()*super.getOccupiedPercentage();
        if (occupiedSpace+s<=super.getCapacity()&& super.getReRecordable()) {
            int percentage = (int)Math.floor((occupiedSpace+s/super.getCapacity()));
            super.setOccupiedPercentage(percentage);
        }
        System.out.println("CD recording device");
    }
    @Override
}
