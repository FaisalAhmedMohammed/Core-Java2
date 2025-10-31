public class Person{
    private static int eyes;
    private static int ears;
    private static int hands;
    private static int legs;

    private String name;
    private double height;
    private double weight;

    static{
    eyes=2;
    ears=2;
    hands=2;
    legs=2;
    }
    private static int count;
    {
        count++;
    }

    Person(String name, double height, double weight){
	this.name=name;
	this.height=height;
	this.weight=weight;
    }

    public static void setEyes(int eyes){
    	Person.eyes=eyes;
    }
    public static void setEars(int ears){
    	Person.eyes=eyes;
    }
    public static void setHands(int hands){
    	Person.hands=hands;
    }
    public static void setLegs(int legs){
    	Person.legs=legs;
    }

    public static int getEyes(){
	return eyes;
    }
    public static int getEars(){
	return ears;
    }
    public static int getHands(){
	return hands;
    }
    public static int getLegs(){
	return legs;
    }
   
    public void setName(String name){
	this.name=name;
    }
    public String getName(){
	return name;
    }

    public void setHeight(double height){
	this.height=height;
    }
    public double getHeight(){
	return height;
    }
    
    public void setWeight(double weight){
	this.weight=weight;
    }
    public double getWeight(){
	return weight;
    }

    public void eat(){
	System.out.println(name + " is Eating ");
    }
    public void sleep(){
	System.out.println(name + " is Sleeping ");
    }
    public void learn(){
	System.out.println(name + " is Learning ");
}
    @Override
    public String toString() {
        return "Personal Details:\n" +
               "Eyes    : " + eyes   + "\n" +
               "Ears    : " + ears   + "\n" +
               "Hands   : " + hands  + "\n" +
               "Legs    : " + legs   + "\n" +
               "Name    : " + name   + "\n" +
               "Height  : " + height + "\n" +
               "Weight  : " + weight + "\n";
}

}