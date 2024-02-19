import java.util.Scanner;

public class Nestedif{
	public static void main(String[] args) {
		Scanner myscanner = new Scanner(System.in);
		System.out.println("输入成绩：");
		double score = myscanner.nextDouble();
		System.out.println("输入性别：");
		char gender = myscanner.next().charAt(0);
		if(score>=8.0){
				if(gender == 'm'){////char类型判断条件，单字符要用单引号括住，使用双引号会报错
					System.out.println("进入男子组");
				}
				else if(gender == 'f' ){
					System.out.println("进入女子组");

				}
				else{
					System.out.println("性别无效");

				}



		}else
				{
			System.out.println("未通过！");
	
		}
	}






}