/* класс калькулятор */
public class calc_v1{
	private float result; /* результат вычисления */
	/*Первый метод суммирования аргументов */
	public void calcul(String operation,float first, float second){
		switch(operation){
		case "+": this.result=first+second;
			     	 break;
		case "*": this.result=first*second;
			     	 break;
		case "/": this.result=first/second;
			     	 break;
		case "-": this.result=first-second;
			      break;
		default: this.result=first%second; 
				break;

		}
	}
	/* Получения результата*/
	public float getresult(){
		return this.result; 
		}
	/*Очищение результата*/
	public void clearresult(){
		this.result=0;
		}
}