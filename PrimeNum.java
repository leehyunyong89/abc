
public class PrimeNum {

	public static void main(String[] args) {
		
		// <�Ҽ����� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.>
		
		/*		    <�ڵ� ¥�� �� ����>
		 *   
		 * val-2��ŭ ���� ������ (for�� ���) 
		 * ���� �ȿ��� �����ؾ��� ��� 1 : val���� 2�� ���� �������� 0���� �Ǵ� (if�� ���) 
		 * ���� �ȿ��� �����ؾ��� ��� 1-1 : val%2==0�̸� boolean �������� false�� ����, �׸��� break�� ���� ���������� 
		 * ���� �ȿ��� �����ؾ��� ��� 2 : div���� 1�� ������Ű��
		 * �������� �������� ������� �Ǵ��ϱ�
		 * 		boolean ������� true��� : "�Ҽ��Դϴ�." ����ϱ�
		 * 		boolean ������� false��� : "�ռ����Դϴ�." ����ϱ�  
		 */
		
		int val = 10;
		int div = 2;
		boolean isPrimeNumber = true;
		
		for(int i = 0; i < val-div; i++)
		{
			if(val%2==0)
			{
				isPrimeNumber = false;
				break;				
			}
			div++;			
		}
		if(isPrimeNumber == true)
		{
			System.out.println("�Ҽ��Դϴ�.");
		}
		else
		{
			System.out.println("�ռ����Դϴ�.");
		}
	}
}
