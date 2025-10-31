public class Bike{
    private int gear;
    public void setGear(int gear){
        if(gear > 5){
            throw new IllegalArgumentException("please down gear");
        }
 	else{
	   System.out.println("Bike is in Running Mode");
        }
      }
	public int getGear(){
	    return this.gear;
       }
    
    public static void main(String[] args){
        Bike bike = new Bike();
	bike.setGear(8);
    }
}