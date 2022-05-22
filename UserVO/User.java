package UserVO;

/*	1. 이름(String) ,주민번호 7자리(String) 가지는 UserVO 생성
- 1000명의 랜덤 유저 생성
- 이름은 히스기1~1000
- 주민번호 앞자리6+ 뒷자리1 = 총 7자리
- 뒷자리1 가지고 남,여 구분이 가능 해야됨

2. 생성된 1000명의 유저 나이,성별을 출력
- 주민번호 앞자리2 가지고 나이 유추
- 주민번호 뒷자리1 가지고 성별 유추 (2000년 이후는 남:3, 여:4)

3.생성된 1000명의 유저 List를 Map으로 변환
- key = 이름
- value = UserVO  
*/
public class User {
	public static void main(String[] args) {
		String[][] name = new String[2][1000];
		String FN = "YYMMDD";		// 주민 등록번호 앞자리 2자씩 나눠서 연월일 구분!!(가능?)
		String BN = "";				// 주민등록번호 뒷자리 1~4
		String YY = "";
		String MM = "";
		String DD = "";
		
		
		for (int i = 0; i < name[0].length; i++) {
			for (int j = 0; j < name[0].length ; j++) {		// 이름 정의
				name[0][i] = "희스기" + (i + 1);
			}
		}
		for (int i = 0; i < name[1].length; i++) {
			int y = (int) (Math.random()*99)+1;				// 생년 입력
			if (y < 10) {
				YY = "0" + Integer.toString(y);				
			} else {
				YY = Integer.toString(y);
			}
			
			int s;											// 생년에 따라 주민번호 뒷자리 입력
			if (y > 22) {
				s = (int) (Math.random()*2)+1;
			} else {
				s = (int) (Math.random()*2)+3;
			}
//			System.out.println(YY + "+" +s);
			BN = "-" + Integer.toString(s);
			
			
			
			int m = (int) (Math.random()*12)+1;				// 생월 입력
			if (m < 10) {
				MM = "0" + Integer.toString(m);				
			} else {
				MM = Integer.toString(m);
			}
			
			int d;											// 생일 입력
			switch (m) {
				case 4:
				case 6:
				case 9:
				case 11:
					d = (int) (Math.random()*30)+1;
					if (d < 10) {
						DD = "0" + Integer.toString(d);				
					} else {
						DD = Integer.toString(d);
					}
					break;
				case 2:
					d = (int) (Math.random()*28)+1;
					if (d < 10) {
						DD = "0" + Integer.toString(d);				
					} else {
						DD = Integer.toString(d);
					}
					break;
				default:
					d = (int) (Math.random()*31)+1;
					if (d < 10) {
						DD = "0" + Integer.toString(d);				
					} else {
						DD = Integer.toString(d);
					}
					break;
			}
			
			FN = FN.replace("YY", YY);						// 생년월일 주민번호 앞자리에 입력
			FN = FN.replace("MM", MM);
			FN = FN.replace("DD", DD);
			
			name[1][i] = FN + BN;		
			
			if (i == name[0].length-1) {				
//				System.out.println(name[1][999]);
			}
		}
		
	}
}