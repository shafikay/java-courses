/* класс калькулятор */
public class calc_v1{
	private int result; /* результат вычисления */
	/*Первый метод суммирования аргументов */
	public void add(int ... params){
		for(Integer param : params){
		this.result+=param;
		}
	}
	/* Получения результата*/
	public int getresult(){
		return this.result; 
		}
	/*Очищение результата*/
	public void clearresult(){
		this.result=0;
		}
}