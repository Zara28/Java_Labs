import java.util.Scanner;
class task_4_5
{
//���� ����� �������������� �����. ����� ����� � ������������ ��� ����.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������� �������������� ����� ");
	int ch = sc.nextInt();
	int sum = 0;
	int pr = 1;
	if(ch<999 || ch>=10000)
	{
		System.out.print("����� �� ��������������");
		return;
	}
	while (ch > 0)
	{
		sum+=ch%10;
		pr *= ch%10;
		ch/=10;
	}
	System.out.print("����� ���� ����� ����� ����� " + sum + " ������������ ���� ����� ����� ����� "+ pr);
	
	}
}