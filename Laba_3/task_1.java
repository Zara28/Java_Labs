import java.util.Scanner;
import java.util.Random;
import java.io.InputStreamReader;
import My.*;
class task_1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����������! ��� ����������� ����� �������� ���� ����������� ������� W � S, ��� ������ ������� V\n");
		int v = 0;
		int ras = 0;
		String s = "";
		
		int k = 0;
		while (v!=-1)
		{
			do 
			{
				if(k%3==0)
				{
					v = 1;
					System.out.print("|1|"+"������ � ���������� ��������\n");
					System.out.print("2 "+"������ � ��������� ��������\n");
					System.out.print("3 "+"����� �� ���������\n");
				}
				else if(k%3==1)
				{
					v=2;
					System.out.print("1 "+"������ � ���������� ��������\n");
					System.out.print("|2|"+"������ � ��������� ��������\n");
					System.out.print("3 "+"����� �� ���������\n");
				}
				else if(k%3==2)
				{
					v=-1;
					System.out.print("1 "+"������ � ���������� ��������\n");
					System.out.print("2 "+"������ � ��������� ��������\n");
					System.out.print("|3|"+"����� �� ���������\n");
				}
				s = sc.nextLine();
				if(s.indexOf("W") != -1)
				{
					k = k+1;
				}
				else if(s.indexOf("S") != -1)
				{
					k = k-1;
				}
			}while (s.indexOf("V")==-1);
			
			switch(v)
			{
				case (-1):
				break;
				case (1):
					System.out.print("\n������� ������ ������� ");
					ras = sc.nextInt();
					Odn_Mas massive = new Odn_Mas(ras);
					System.out.print(massive.create_stroka(massive.mas, ras));
					System.out.print("\n���������� ������� ������� �������� "+massive.col_kr()+"\n");
				break;
				case (2):
					System.out.print("\n������� ������ ������� ");
					ras = sc.nextInt();
					Dv_Mas mass = new Dv_Mas(ras);
					System.out.print(mass.stroka()+"\n");
					mass.obr();
					System.out.print("\n���������\n");
					for(int i = 0; i<ras; i++)
					{
						for(int j = 0; j<ras; j++)
						{
							System.out.print(mass.mass[i][j] + " ");
						}
						System.out.print("\n");
					}
				break;
			}
			System.out.print("\n");
		}
	}
}

 