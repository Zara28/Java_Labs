import java.util.Scanner;
class task_10_2
{
//������������ ������ � ������� ��� �����. ������� � ������� ������� �� ������� ������� �� ������.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������� ��� �����: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	
	System.out.print("������� ������� ������� ����� �� ������ ����� " + (f_ch%s_ch));
	}
}