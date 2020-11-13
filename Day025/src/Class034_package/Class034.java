package Class034_package;

public class Class034 {

	public static void main(String[] args) {
		Score_ver1 iron = new Score_ver1();
		iron.setName("아이언맨");
		iron.setKor(100);
		iron.setEng(100);
		iron.setMath(100);

		Score_ver1 hulk = new Score_ver1();
		hulk.setName("헐크\t");
		hulk.setKor(20);
		hulk.setEng(50);
		hulk.setMath(30);

		Score_ver1.info();
		iron.show();
		hulk.show();

	}

}
