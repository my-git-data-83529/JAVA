import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
        int choice;
        double totalBill=0;
        Scanner sc = new Scanner(System.in);
        
        do {
      	  System.out.println("1. Samosa");
      	  System.out.println("2. Vadapav");
      	  System.out.println("3. Idli");
      	  System.out.println("4. Dosa");
      	  System.out.println("5. Pizza");
      	  System.out.println("6. Burger");
      	  System.out.println("7. Panipuri");
      	  System.out.println("8. Cococola");
      	  System.out.println("9. Pavbhaji");
      	  System.out.println("10. GenerateBill");
      	  System.out.println("11. Enter choice from user - ");
      	  choice = sc.nextInt();
      	  
      	  switch(choice)
      	  {
      	  case 1: 
      	  {
      		  double Price = 20;
      		  int q;
      		  System.out.println("Samosa - 20.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 2: 
      	  {
      		  double Price = 20;
      		  int q;
      		  System.out.println("Samosa - 20.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 3: 
      	  {
      		  double Price = 80;
      		  int q;
      		  System.out.println("Idli - 80.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 4: 
      	  {
      		  double Price = 60;
      		  int q;
      		  System.out.println("Dosa - 20.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 5: 
      	  {
      		  double Price = 200;
      		  int q;
      		  System.out.println("Pizza - 200.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 6: 
      	  {
      		  double Price = 180;
      		  int q;
      		  System.out.println("Burger - 180.00");
      		  System.out.println("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 7: 
      	  {
      		  double Price = 30;
      		  int q;
      		  System.out.println("Panipuri - 30.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 8: 
      	  {
      		  double Price = 100;
      		  int q;
      		  System.out.println("Cococola- 100.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 9: 
      	  {
      		  double Price = 120;
      		  int q;
      		  System.out.println("Pavbhaji - 120.00");
      		  System.out.print("Enter quantity - ");
      		  q = sc.nextInt();
      		  totalBill = totalBill + (q*Price);
      	  }
      	  break;
      	  
      	  case 10: 
      	  {
      		  System.out.println("TotalBill - " + totalBill);
      		 choice = 0;
      	  }
      	  break;
      	  
      	  default:
      		 System.out.println("Wrong choice.....");
      		 break;
      	  }
      	  
      	  
      	  
      	  
      	  
      	  
        }while(choice!=0);
	}




}
