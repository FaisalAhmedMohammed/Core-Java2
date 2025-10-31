public class BankAccount {
    static String bankName;
    long accNum;
    boolean active;

    String getBankName(){
        return bankName;
    }
    void setAccNum(long accNum){
        this.accNum = accNum;
    }
    long getAccNum(){
        return accNum; 
    }
    void setActive(boolean active){
        this.active = active;
    }
    boolean getActive(){
        return active;
    }
    void display(){
            System.out.println("BankName : " + bankName);
	    System.out.println("AccountNum : " + accNum);
    	    System.out.println("ISActive : " + active);
	    
    }
}