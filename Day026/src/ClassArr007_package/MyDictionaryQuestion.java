package ClassArr007_package;

import java.util.Arrays;
import java.util.Scanner;

public class MyDictionaryQuestion {

    public void dicQuestion(MyDictionary[] words) {
        System.out.println(":::" + Arrays.toString(words));
        String answer = "";
        Scanner scanner = new Scanner(System.in);

        for (int cnt=0; )
        //단어 섞기
        char[] question = words[cnt].getWord().toCharArray();
        for (int a = 0; a < question.length; a++){
            int index = (int) (Math.random() * question.length);
            char temp = question[a];
            question[a] = question[index];
            question[index] = temp;
        }
        //문제주고
        System.out.print("Q" +(0+1) +  ". " + new String(question) + "iteevnsiol의 정답을 입력하세요 >");
        answer = scanner.next();
        //처리
        if (words[cnt.getWord().equals(answer)){
            System.out.println("맞았습니다.");
            words[cnt].setUserAnswer('O');
            MyDictionary.trueAnswer++;
        }else System.out.println("틀렸습니다");
    }

    public MyDictionaryQuestion() {super();
    }
}

/*
Q1. iteevnsiol의 정답을 입력하세요 > television
맞았습니다
Q2. ptmuocer의 정답을 입력하세요 > computer
맞았습니다
Q3. oumes의 정답을 입력하세요 > a
틀렸습니다
Q4. phnoe의 정답을 입력하세요 > a
틀렸습니다
*/
