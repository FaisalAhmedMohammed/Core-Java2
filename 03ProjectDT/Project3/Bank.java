public class Bank {
      public static void main(String[] args) {
      BankAccount Hdfc= new BankAccount();
      Hdfc.bankName="HDFC";
      Hdfc.branchName="Vinayak Nagar";
      Hdfc.ifsc="Adf7yu89";
      Hdfc.accountNumber=123456789012L;
      Hdfc.accountHolderName="ashok";
      Hdfc.balance=50000;

         System.out.println("BankName\t: "+ Hdfc.bankName);
         System.out.println("BranchName\t: "+  Hdfc.branchName);
         System.out.println("ifsc\t\t: "+  Hdfc.ifsc);
         System.out.println("AccountNumber\t: "+ Hdfc.accountNumber);
         System.out.println("AccountHolderName: "+ Hdfc.accountHolderName);
         System.out.println("Balance\t\t: "+  Hdfc.balance);
        
      }
}