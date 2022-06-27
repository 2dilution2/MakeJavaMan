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

public class User2{
	private String name;
	private String id;
	
	public User2 () {	}
	
	public User2(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void createUser (String name) {
		String[] list = new String[1000];
		
	} 
	
	void innitName() {
		int i = (int)(Math.random()*1000)+1;
		this.name = "히스기" + Integer.toString(i);
	}
	
	void innitYY() {
		
	}
	
	void innitMM() {
		
	}
	
	void innitDD() {
		
	}
	
	void innitS() {
		
	}
	
	public static void main(String[] args) {
		User2 U2 = new User2("히스기0001","951113-1");
		
	}
}
