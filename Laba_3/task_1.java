import java.util.Scanner;
import java.util.Random;
import java.io.InputStreamReader;
class task_1
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Добро пожаловать! Для перемещения между пунктами меню используйте символы W и S, для выбора нажмите V\n");
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
					System.out.print("|1|"+"Работа с одномерным массивом\n");
					System.out.print("2 "+"Работа с двумерным масиивом\n");
					System.out.print("3 "+"Выйти из программы\n");
				}
				else if(k%3==1)
				{
					v=2;
					System.out.print("1 "+"Работа с одномерным массивом\n");
					System.out.print("|2|"+"Работа с двумерным масиивом\n");
					System.out.print("3 "+"Выйти из программы\n");
				}
				else if(k%3==2)
				{
					v=-1;
					System.out.print("1 "+"Работа с одномерным массивом\n");
					System.out.print("2 "+"Работа с двумерным масиивом\n");
					System.out.print("|3|"+"Выйти из программы\n");
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
					Odn_Mas massive = new Odn_Mas(ras);
					System.out.print(massive.create_stroka(massive.mas, ras));
					System.out.print("\nКоличество кратных первому элементу "+massive.col_kr()+"\n");
				break;
				case (2):
					System.out.print("\nВведите размер массива ");
					ras = sc.nextInt();
					Dv_Mas mass = new Dv_Mas(ras);
					System.out.print(mass.stroka()+"\n");
					mass.obr();
					System.out.print("\nРезультат\n");
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

class Odn_Mas
{
	int [] mas;
	int n;
	public Odn_Mas(int N)
	{
		Random random = new Random();
		this.mas = new int [N];
		this.n = N;
		for(int i = 0; i<N; i++)
		{
			this.mas[i] = random.nextInt(100+1);
		}
	}

	int col_kr()
	{
		int kol = 0;
		for(int i = 1; i<this.n; i++)
		{
			if(this.mas[i]%this.mas[0]==0)
			{
				kol++;
			}
		}
		return kol;
	}
	String create_stroka(int [] mas, int n)
	{
		String str = "";
		for (int i = 0; i<n; i++)
		{
				str+=mas[i]+" ";
		}
		return str;
	}
}
class Dv_Mas extends Odn_Mas{
	int [][] mass;
	int n;
	public Dv_Mas(int N)
	{
		super(N);
		this.n = N;
		Random random = new Random();
		this.mass = new int[n][n];
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				this.mass[i][j] = random.nextInt(100+1);
			}
		}
	}
	void obr()
	{
		int s1 = 0;
		int s2 = 0;
		for(int i = 0; i<this.n; i++)
		{
			for(int j = 0; j<this.n; j++)
			{
				if(i<=this.n/2)
				{
					s1+=this.mass[i][j];
				}
				else
				{
					s2+=this.mass[i][j];
				}
			}
		}
		if(s1>=s2)
		{
			sort(0, this.n/2);
		}
		else
		{
			sort(this.n/2+1, n);
		}
	}
	void sort(int begin, int end)
	{
		for(int i = begin; i<end; i++)
		{
			for(int y = 0; y<this.n; y++)
			{
				for(int j = 0; j<n-1; j++)
				{
					if(this.mass[i][j]<this.mass[i][j+1])
					{
						int t = this.mass[i][j];
						this.mass[i][j] = this.mass[i][j+1];
						this.mass[i][j+1] = t;
					}
				}
			}
		}
	}
	String stroka()
	{
	String str = "";
		for(int i = 0; i<this.n; i++)
		{
			str+=create_stroka(this.mass[i], this.n);
		}
		return str;
	}
}
 