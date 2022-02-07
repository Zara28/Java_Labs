import java.util.Scanner;
class task_10_2
{
//Пользователь вводит в консоль два числа. Вывести в консоль остаток от деления первого на второе.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Введите два числа: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	
	System.out.print("Остаток деления первого числа на второе равен " + (f_ch%s_ch));
	}
}