import java.util.Scanner;

public class Nestedif2{

	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("输入当前月份：");
		int month = myScanner.nextInt();
		System.out.println("请输入年龄 0~120：");
		int age = myScanner.nextInt();

		if(month <=10 && month >=4){
			System.out.println("当前是旺季！");
			if(age < 18 && age >= 0 ){
				System.out.println("您是儿童，票价为30");
			}else if(age >= 18 && age <= 60){
				System.out.println("您是成人，票价为60");
			}else if (age >60 && age <= 120) {
				System.out.println("您是老人，票价为20");
			}else{
				System.out.println("您输入的年龄有误，请重新输入");
			}
		}else if (month >= 1 && month <= 12){
			System.out.println("当前是淡季！");
			if(age <= 60 && age >= 18 ){
				System.out.println("您是成人，票价为40");
			}else if(age >= 0 &&age <= 120){
				System.out.println("您的票价为20");
			}else{
				System.out.println("您输入的年龄有误，请重新输入");
			}
		}else{
			System.out.println("您输入的月份有误，请重新输入！！");
		}
	}
}
