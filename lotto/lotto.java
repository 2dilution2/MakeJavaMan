package lotto;
// 로또번호 생성기 만들기

import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {
        int[] ball = new int[45];           // 45개의 공을 배열로 만들어 준다.

        for (int i = 0; i < ball.length; i++) 
            ball[i] = i + 1;                // 공에 번호를 붙여준다.

        int tmp = 0;                        // 두값을 바꾸는데 사용 할 변수
        int j = 0;                          // 임시의 값
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random()*45);   // 랜덤한 45개의 ball의 값을 ball[0]부터 차근차근 넣는다.
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j]  = tmp;
            lotto[i] =  ball[i];
        }
        System.out.println(Arrays.toString(lotto));
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}