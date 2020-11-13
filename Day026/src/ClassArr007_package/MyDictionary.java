package ClassArr007_package;

public class MyDictionary {
    static int dno_count = 0;   //해당번호를 자동으로 카운트하는 STATIC변수
    static int trueAnswer = 0;   //맞춘 답변개수 카운트하는 STATIC변수
    private int dno;            //각 해당번호
    private String word;        //단어
    private char userAnswer;    //사용자 맞춘O X 둘중하나 저장

    //GETTER & SETTER
    public static int getDno_count() { return dno_count; }
    public static void setDno_count(int dno_count) { MyDictionary.dno_count = dno_count; }

    public static int getTrueAnswer() { return trueAnswer; }
    public static void setTrueAnswer(int trueAnswer) { MyDictionary.trueAnswer = trueAnswer; }

    public int getDno() { return dno; }
    public void setDno(int dno) { this.dno = dno; }

    public String getWord() { return word; }
    public void setWord(String word) { this.word = word; }

    public char getUserAnswer() { return userAnswer; }
    public void setUserAnswer(char userAnswer) { this.userAnswer = userAnswer; }

    //생성자
    public MyDictionary(){super();}
    public MyDictionary(String word) {
        super();
        this.dno = ++dno_count;
        this.word = word;
        this.userAnswer = 'X';
    }
    public MyDictionary(int dno, String word, char userAnswer) {
        super();
        this.dno = ++dno_count;
        this.word = word;
        this.userAnswer = 'X';
    }

    @Override public String toString() { return "MyDictionary{dno=" + dno + ", word='" + word + '\'' + ", userAnswer=" + userAnswer + '}'; }
}


