import java.util.Scanner;
class task_5_5
{
//��� ����� ���������� ���� (������������� ����� �����). ������� ��������������� ��� ����� ��������, ��������, ���, � �������, ������� 20 �������� ��� 1901 ���.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("������� ����� ����: ");
	int num = sc.nextInt();
	int cen = num/100;
	if (num%100 > 0)
	{
		cen+=1;
	}
	System.out.print("��������������� ��� ����� �������� "+cen);
	
	}
}