 class TemperatureSensorArray {
    private String Location;
    private double reading=0.0;

     public String getLocation() {
         return Location;
     }

     public double getReading() {
         return reading;
     }

     public void setLocation(String location) {
         Location = location;
     }

     public void setReading(double reading) {
        if (reading>-50&&reading<50){
         this.reading = reading;}
     }
 }
