import java.util.Scanner;
class task_5_2
{
//Пользователь вводит в консоль два числа, вывести в консоль нечетное число или сообщение об отсутствии такого числа.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Введите два числа через энтер: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	if (f_ch%2!=0)
	{
		System.out.print(f_ch);
	}
	else if (s_ch%2!=0)
	{
		System.out.print(s_ch);
	}
	else{
		System.out.print("Нечетного числа нет");
	}
	}
}