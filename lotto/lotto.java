package lotto;
// �ζǹ�ȣ ������ �����

import java.util.Arrays;

public class lotto {
    public static void main(String[] args) {
        int[] ball = new int[45];           // 45���� ���� �迭�� ����� �ش�.

        for (int i = 0; i < ball.length; i++) 
            ball[i] = i + 1;                // ���� ��ȣ�� �ٿ��ش�.

        int tmp = 0;                        // �ΰ��� �ٲٴµ� ��� �� ����
        int j = 0;                          // �ӽ��� ��
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random()*45);   // ������ 45���� ball�� ���� ball[0]���� �������� �ִ´�.
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