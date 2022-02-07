import java.util.Scanner;
class task_4_2
{
//Пользователь вводит в консоль два числа. Определить, делится ли ихсумма на первое, и вывести об этом сообщение в консоль.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Введите два числа через энтер: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	if ((f_ch+s_ch)%f_ch==0)
	{
		System.out.print("Сумма этих чисел делится на " + f_ch);
	}
	else 
	{
		System.out.print("Сумма этих чисел не делится на " + f_ch);
	}
	}
}