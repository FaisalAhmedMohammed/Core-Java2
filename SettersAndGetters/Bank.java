public class Bank{
    public static void main(String[] args){
	BankAccount.bankName="HDFC";
        BankAccount ba = new BankAccount();
        ba.getBankName();
        ba.setAccNum(123456789L);
	ba.setActive(true);

        ba.display();

            if(ba.getActive()){
		System.out.print("Account is in Active Status");             
            }
            else{
                System.out.print("Account is in DeActive Status");
            }
    }
}