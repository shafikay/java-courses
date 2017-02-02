import java.util.Scanner;

/*запуск калькулятора, ввод с клавы*/
public class interactrunner{
	public static void main (String[] arg){
	Scanner reader = new Scanner(System.in);
	try {
	calc_v1 calc = new calc_v1();
	String exit = "no";
	while(!exit.equals("yes")){
		System.out.println("Enter first arg: ");
		String first = reader.next();
		System.out.println("Enter second arg: ");
		String second =reader.next();
		System.out.println("Enter operation: ");
		String operation=reader.next();
		calc.calcul(String.valueOf(operation),Float.valueOf(first),Float.valueOf(second));
		System.out.println ("Result= "+calc.getresult());
		calc.clearresult();
		System.out.println("Exit: yes/no?");
		exit=reader.next();
		}
	    }
	    finally{reader.close();
			}
	} 
}