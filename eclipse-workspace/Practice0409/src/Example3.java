import java.util.Arrays;

class Person{
	String name;
	int age;
	char blood;
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}
	public static Person makePerson(String name, int age, char blood) {
		// ��ü�� �ܺ� �޼��忡�� ����
		Person ob = new Person();
		ob.name = name;
		ob.age = age;
		ob.blood = blood;
		// ���ο��� ������ ��ü�� ��ȯ
		return ob;
	}
	public static String showPerson(Person man1) {
		//String message = man1.name + ", " + man1.age + ", " + man1.blood;
		String message = "";
		message = String.format("�̸�: %s\n",man1.name);
		message += String.format("����: %d\n",man1.age);
		message += String.format("������: %c\n",man1.blood);
		return message;
		
	}
	public static void test1() {
		Person man = makePerson("ȫ�浿",25,'A');
		//Person man = ob; 
		String message = showPerson(man);
		System.out.println(message);
	}
	public static void modifyScore(int[] score1) {
		// int[] score1 = score;
		for(int count =0; count < score1.length; count++) {
			score1[count] += 5;
		}
	}
	public static int[] makeScore() {
		int[] number = {1, 2, 3, 4, 5};
		return number;
	}
	public static void test2() {
		int [] score = {95, 76, 67, 88, 54};
		// �迭�� ��ü�̴�.
		modifyScore(score);
		System.out.println(Arrays.toString(score));
		
		int[] number = makeScore();
		modifyScore(number);
		System.out.println(Arrays.toString(number));
	}
}
