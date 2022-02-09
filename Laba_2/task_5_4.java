import java.util.Scanner;
import java.util.Random;
class task_1_8
{
//�������� ������ ��� ������������� �������� �������� ��� �������� � ��� ������� �����������.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	System.out.print("������� 0 ��� ������ �������� ������� ������� ������� � 1 ��� ��������� ������� ");
	int choose = sc.nextInt();
	System.out.print("������� ������ ������� ");
	int N = sc.nextInt();
	int [] [] mas;
	mas = new int [N][N];
	if (choose==0)
	{
		System.out.print("������� �������� ������� \n");
	for (int i = 0; i<N; i++)
	{
		for(int j = 0; j<N; j++)
		{
			mas[i][j] = sc.nextInt();
			if (mas[i][j] == 0)
			{
				System.out.print("���� �� ������ ��������� 0!");
				return;
			}
		}
	}
	}
	else
	{
	for (int i = 0; i<N; i++)
	{
		for(int j = 0; j<N; j++)
		{
			mas[i][j] = random.nextInt(100)+1;
		}
	}
	}
	
	matrix(mas, N);
	
}
public static void matrix(int [][]mas, int N)
{
	System.out.print("���� ���� \n");
	for (int i = 0; i<N; i++)
		{
			for(int j = 0; j<N; j++)
			{
				String str = String.format("%4d ", mas[i][j]);
				System.out.print(str);
			}
			System.out.print("\n");
		}
	for(int i = 0; i<N; i++)
		{
			for (int j = N/2+1; j<N; j++)
			{
				if (i==j || j<=N-i-1 || j<i) continue;
				if(mas[i][j]>0 && mas[i][j]%2!=0)
				{
					mas[i][j] = 0;
				}
			}
			
		}
	System.out.print("��������� \n");
	for (int i = 0; i<N; i++)
	{
		for(int j = 0; j<N; j++)
		{
			String str = String.format("%4d ", mas[i][j]);
			System.out.print(str);
		}
		System.out.print("\n");
	}
}
}