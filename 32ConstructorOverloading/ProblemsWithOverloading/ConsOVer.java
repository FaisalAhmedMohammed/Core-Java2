public class ConsOVer{
    private long accNo;
    private String accHName;
    private double balance;

    ConsOVer(){
	System.out.println("NPM");
    }

    ConsOVer(long accNo){
	this.accNo=accNo;
    }

    
    ConsOVer(long accNo,String accHName){
	this.accNo=accNo;
	this.accHName=accHName;
    }
    ConsOVer(long accNo,String accHName,double balance){
	this.accNo=accNo;
	this.accHName=accHName;
	this.balance=balance;
	
    }

    public String toString(){

	return  accNo +" "+accHName + " " +  balance;
    }

}