/* ����� ����������� */
public class calc_v1{
	private float result; /* ��������� ���������� */
	/*������ ����� ������������ ���������� */
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
	/* ��������� ����������*/
	public float getresult(){
		return this.result; 
		}
	/*�������� ����������*/
	public void clearresult(){
		this.result=0;
		}
}