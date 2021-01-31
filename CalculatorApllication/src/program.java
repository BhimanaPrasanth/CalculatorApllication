import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter two numbers: ");

	    
	    int first = sc.nextInt();
	    int second = sc.nextInt();

	    System.out.print("Enter an operator (+, /, *, -): ");
	    char operator = sc.next().charAt(0);

	    int r;

	    switch (operator) {
	      case '+':
	        r = first + second;
	        break;

	      case '/':
	        r = first / second;
	        break;

	      case '*':
	        r = first * second;
	        break;

	      case '-':
	        r = first - second;
	        break;

	      
	      default:
	        System.out.printf("Error! operator is not correct");
	        return;
	    }

	    System.out.println(first + " " + operator + " " + second + " = " + r);
	  }
		

	}




