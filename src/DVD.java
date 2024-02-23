public class DVD extends OpticalDisk{
    public DVD(double capacity, String unit, int occupiedPercentage, boolean reRecordable) {
        super(capacity, unit, occupiedPercentage, reRecordable);
    }

    @Override
    public void read() {
        System.out.println("Reading device DVD");

    }

    @Override
    public void save(double s) {
        double occupiedSpace =( super.getCapacity() * super.getOccupiedPercentage())/100;
        if (occupiedSpace + s <= super.getCapacity() && super.getReRecordable()) {
            int percentage = (int) Math.floor((occupiedSpace + s / super.getCapacity())*100);
            super.setOccupiedPercentage(percentage);
        } else {

        }
            System.out.println("DVD recording device");
    }
}
