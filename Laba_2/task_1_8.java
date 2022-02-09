import java.util.Scanner;
import java.util.Random;
class task_1_8
{
//Дан массив из координат х N точек на прямой. Найти такую точку из данного множества, сумма расстояний от которой до остальных его точек минимальна, и саму эту сумму.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	System.out.print("Введите 0 для выбора варианта задания массива вручную и 1 для генерации массива ");
	
	int choose = sc.nextInt();
	System.out.print("Введите размер массива ");
	int N = sc.nextInt();
	int [] mas;
	mas = new int [N];
	if (choose==0)
	{
		System.out.print("Введите элементы массива ");
		for (int i = 0; i<N; i++)
		{
			mas[i] = sc.nextInt();
		}
	}
	else
	{
		for (int i = 0; i<N; i++)
		{
			mas[i] = random.nextInt(100);
		}
	}
	
	System.out.print("Для массива ");
	for (int i = 0; i<N; i++)
	{
		System.out.print(mas[i]+" ");
	}
	System.out.print(" Минимальная сумма расстояний равна "+min(mas, N));

	
	}
	public static int min(int[] mas, int N)
	{
		int min_sum = 10000000;
		for(int i = 0; i<N; i++)
		{
			int sum = 0;
			System.out.print("\n");
			for (int j = 0; j<N; j++)
			{
				if (i==j) continue;
				int ras = mas[i]>=mas[j] ? mas[i]-mas[j] : mas[j]-mas[i];
				sum+=ras;	
				System.out.print("Расстояниe между "+mas[i]+" и "+mas[j]+ " равно "+ras +" ");
			}
			System.out.print("Сумма равна " + sum +"\n");
			if (sum < min_sum)
				{
					min_sum = sum;
				}
		}
		return min_sum;
	}
}