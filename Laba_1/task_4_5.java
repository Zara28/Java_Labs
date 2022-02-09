import java.util.Scanner;
class task_4_5
{
//Дано целое четырехзначное число. Найти сумму и произведение его цифр.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Введите четырехзначное число ");
	int ch = sc.nextInt();
	int sum = 0;
	int pr = 1;
	if(ch<999 || ch>=10000)
	{
		System.out.print("Число не четырехзначное");
		return;
	}
	while (ch > 0)
	{
		sum+=ch%10;
		pr *= ch%10;
		ch/=10;
	}
	System.out.print("Сумма цифр этого числа равна " + sum + " Произведение цифр этого числа равно "+ pr);
	
	}
}