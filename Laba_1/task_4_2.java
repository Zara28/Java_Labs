import java.util.Scanner;
class task_4_2
{
//������������ ������ � ������� ��� �����. ����������, ������� �� ������� �� ������, � ������� �� ���� ��������� � �������.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������� ��� ����� ����� �����: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	if ((f_ch+s_ch)%f_ch==0)
	{
		System.out.print("����� ���� ����� ������� �� " + f_ch);
	}
	else 
	{
		System.out.print("����� ���� ����� �� ������� �� " + f_ch);
	}
	}
}