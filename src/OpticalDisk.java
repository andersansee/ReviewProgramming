public abstract class OpticalDisk {
        private double capacity;
        private String unit;
        private int occupiedPercentage;
        private boolean reRecordable;

        //Constructor
        public OpticalDisk(double capacity, String unit, int occupiedPercentage, boolean reRecordable){
            this.capacity=capacity;
            this.unit=unit;
            this.occupiedPercentage=occupiedPercentage;
            this.reRecordable=reRecordable;
        }

        public double getCapacity() {
            return capacity;
        }

        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public int getOccupiedPercentage() {
            return occupiedPercentage;
        }

        public void setOccupiedPercentage(int occupiedPercentage) {
            this.occupiedPercentage = occupiedPercentage;
        }

        public boolean getReRecordable() {
            return reRecordable;
        }

        public void setReRecordable(boolean reRecordable) {
            this.reRecordable = reRecordable;
        }

        public abstract void read();
        public abstract void save(double s);


}