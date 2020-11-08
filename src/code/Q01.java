package code;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("레시피를 입력해주세요. : ");
		String bread_type = sc.nextLine();
		Bread bread = null;
		if (bread_type.toLowerCase().equals("cream")) {
			bread = new Cream();
		} else if (bread_type.toLowerCase().equals("sugar")) {
			bread = new Sugar();
		} else if (bread_type.toLowerCase().equals("butter")) {
			bread = new Butter();
		}

		if (bread == null) {
			System.out.println("없는 레시피 입니다.");
		} else {
			bread.recipe();
		}
		sc.close();
	}

}

interface Bread {
	public void recipe();
}

class Cream implements Bread {
	private int flour = 100;
	private int water = 100;
	private int cream = 200;

	public void recipe() {
		System.out.println("flour : " + flour);
		System.out.println("water : " + water);
		System.out.println("cream : " + cream);
	}
}

class Sugar implements Bread {
	private int flour = 100;
	private int water = 50;
	private int sugar = 200;

	public void recipe() {
		System.out.println("flour : " + flour);
		System.out.println("water : " + water);
		System.out.println("sugar : " + sugar);
	}
}

class Butter implements Bread {
	private int flour = 100;
	private int water = 100;
	private int butter = 50;

	public void recipe() {
		System.out.println("flour : " + flour);
		System.out.println("water : " + water);
		System.out.println("butter : " + butter);
	}
}