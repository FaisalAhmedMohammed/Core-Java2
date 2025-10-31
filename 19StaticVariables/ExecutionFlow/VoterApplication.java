public class VoterApplication{
    private int age;
 
    public void setAge(int age) throws IllegalArgumentException {
       if (age < 18 || age > 120) {
            throw new IllegalArgumentException("Invalid age. Age must be between 18 and 120 years.");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    void calculateAge(int age){
        if(age >=18 && age<=120){
            System.out.println("Collect Voter id card from esave after 30days");
        }
        else{
            throw new IllegalArgumentException("Invalid age. Age must be between 18 and 120 years.");
        }
    }
    public static void main(String[] args){
        try{
            VoterApplication app = new VoterApplication();
            app.calculateAge(19);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
           
    }
}