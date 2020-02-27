package hello;

import java.util.Scanner;

public class  Greeting {

	static class KK{}
	private final long id;

	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public static void main(String[] args) {
		// 创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		// 接收数据
		System.out.println("请输入一个数字(1-7)：");
		int weekday = sc.nextInt();
		int i = 1;
		// switch语句实现选择
		switch (weekday) {
		default:
			i++;
			System.out.println("你输入的数字有误");
		case 1:
			i++;
			System.out.println("星期一");
		case 2:
			i++;
			System.out.println("星期二");
		case 3:
			i++;
			System.out.println("星期三");
		case 4:
			i++;
			System.out.println("星期四");
		case 5:
			i++;
			System.out.println("星期五");
		case 6:
			i++;
			System.out.println("星期六");
		case 7:
			i++;
			System.out.println("星期日");
		}
		System.out.println("i = " + i);
		System.out.println(Math.round(-15.61));
	}
}
