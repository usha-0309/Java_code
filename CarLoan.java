public class CarLoan {
	public static void main(String[] args) {
int carLoan =10000;
	int loanLength = 3;
  int  insteeresRate = 5;
  int downPayment = 2000;
  if(loanLength <=0 || insteeresRate <= 0){
    System.out.println("Error! You must take out a valid car loan.");
  }
else if (downPayment >= carLoan){
System.out.println("The car can be paid in full");
}else { 
int remainingBalance = carLoan - downPayment;
int months = loanLength*12;
int monthlyBalance =  remainingBalance / months ;
int interest = monthlyBalance *insteeresRate /100;
int monthlyPayment =  monthlyBalance + interest;
System.out.println( "car  carLoan is :-"+" " +carLoan +"/-");
System.out.println( "car  InsteeresRate is :-"+" "+ insteeresRate +"%");
System.out.println( "car DownPayment is :- " +" "+ downPayment +"/-");
System.out.println( "car Montly  Loan Paymrnt is :-"+" "+ monthlyPayment+ "/-");
}
	}
}