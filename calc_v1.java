/* ����� ����������� */
public class calc_v1{
	private int result; /* ��������� ���������� */
	/*������ ����� ������������ ���������� */
	public void add(int ... params){
		for(Integer param : params){
		this.result+=param;
		}
	}
	/* ��������� ����������*/
	public int getresult(){
		return this.result; 
		}
	/*�������� ����������*/
	public void clearresult(){
		this.result=0;
		}
}