import java.util.Scanner;
class task_5_2
{
//������������ ������ � ������� ��� �����, ������� � ������� �������� ����� ��� ��������� �� ���������� ������ �����.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������� ��� �����: ");
	int f_ch = sc.nextInt();
	int s_ch = sc.nextInt();
	if (f_ch%2!=0 && s_ch%2!=0)
	{
		System.out.print(f_ch + " " + s_ch);
		return;
	}
	int ans = f_ch%2!=0 ? f_ch : s_ch;  
	if (ans%2!=0)
	{
		System.out.print(ans);
		return;
	}
	System.out.print("��������� ����� ���");



/*	if (f_ch%2!=0 || s_ch%2!=0)
	{
		if (s_ch%2==0)
		{
			System.out.print(f_ch);
			return;
		}
		else
		{
			System.out.print(s_ch);
			return;
		}
		System.out.print(f_ch + " " + s_ch);
		return;
	}
		System.out.print("��������� ����� ���");*/
	
	}
}