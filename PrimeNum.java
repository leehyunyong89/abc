
public class PrimeNum {

	public static void main(String[] args) {
		
		// <소수인지 판단하는 프로그램을 작성하시오.>
		
		/*		    <코드 짜기 전 설계>
		 *   
		 * val-2만큼 루프 돌리기 (for문 사용) 
		 * 루프 안에서 수행해야할 기능 1 : val값을 2로 나눈 나머지가 0인지 판단 (if문 사용) 
		 * 루프 안에서 수행해야할 기능 1-1 : val%2==0이면 boolean 변수값을 false로 변경, 그리고 break를 통해 빠져나오기 
		 * 루프 안에서 수행해야할 기능 2 : div값을 1씩 증가시키기
		 * 루프문을 빠져나온 결과값을 판단하기
		 * 		boolean 결과값이 true라면 : "소수입니다." 출력하기
		 * 		boolean 결과값이 false라면 : "합성수입니다." 출력하기  
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
			System.out.println("소수입니다.");
		}
		else
		{
			System.out.println("합성수입니다.");
		}
	}
}
