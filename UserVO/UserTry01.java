package UserVO;

public class UserTry01 {

	public static void main(String[] args) {
		      String[][] name = new String[2][5];
		      String YY;
		      for (int i = 0; i < name[1].length; i++) {
		          int j = (int) (Math.random()*99)+1;                // 생년 입력
		           if (j < 10) {
		              YY = "0" + Integer.toString(j);                
		            } else {
		              YY = Integer.toString(j);
		            }
		          
		          int s;
		          if (j > 22) {                            // 생년에 따라 주민번호 뒷자리 입력
		            s = (int) (Math.random()*2)+1;
		          } else {
		            s = (int) (Math.random()*2)+3;
		          }
		          name[1][i] = YY + "+"+ s;
		          System.out.println(YY + "+"+ s);
		      }    
		      System.out.println(name[1][4]);
	}

}
