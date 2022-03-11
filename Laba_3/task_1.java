import java.util.Scanner;
import Lib.*;
import Lib.Dv_Mas;
import Lib.Odn_Mas;
class task_1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Добро пожаловать! Выберите нужную вам операцию, введя V. Для переключения операций введите W для выбора следующей и S - для предыдущего\n");
		int v = 0;
		int ras = 0;
		String s = "";
		
		int k = 0;
		do
		{
			do 
			{
				int ost = k%3;
				switch (ost)
				{
					case 0:
					System.out.print("|1|"+"Одномерный массив\n");
					System.out.print("2 "+"Двумерный массив\n");
					System.out.print("3 "+"Выход из программы\n");
					v = 1;
					break;
					case 1:
					System.out.print("1 "+"Одномерный массив\n");
					System.out.print("|2|"+"Двумерный массив\n");
					System.out.print("3 "+"Выход из программы\n");
					v=2;
					break;
					case 2:
					System.out.print("1 "+"Одномерный массив\n");
					System.out.print("2 "+"Двумерный массив\n");
					System.out.print("|3|"+"Выход из программы\n");
					v=-1;
					break;
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
					System.out.print("\nВведите размер массива ");
					ras = sc.nextInt();
					Lib.Odn_Mas massive = new Lib.Odn_Mas(ras);
					System.out.print(massive.create_stroka(massive.mas, ras));
					System.out.print("\nКоличество кратных в массиве равно "+massive.col_kr()+"\n");
				break;
				case (2):
					System.out.print("\nВведите размер массива ");
					ras = sc.nextInt();
					Lib.Dv_Mas mass = new Lib.Dv_Mas(ras);
					System.out.print(mass.stroka()+"\n");
					mass.obr();
					System.out.print("\nОтсортированный массив\n");
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
		} while (v!=-1);
	}
}

 