import java.util.Scanner;
import java.util.Random;
class task_1_8
{
// Дан массив из координат х N точек на прямой. Найти такую точку из данного множества, сумма расстояний от которой до остальных его точек минимальна, и саму эту сумму
	public static void main (String[] args)
	{
		
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	System.out.print("Enter 0 if you want to enter an array yourself and 1 if you want to generate an array randomly:\n");
	
	int choose = sc.nextInt();
	System.out.print("Enter the size of the array ");
	int N = sc.nextInt();
	int [] mas;
	mas = new int [N];
	if (choose==0)
	{
		System.out.print("Enter array element ");
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
	
	System.out.print("The resulting array ");
	for (int i = 0; i<N; i++)
	{
		System.out.print(mas[i]+" ");
	}
	System.out.print(" The found point is "+min(mas, N));

	
	}
	public static int min(int[] mas, int N)
	{
		int min_sum = 10000000;
		int tochka = 0;
		for(int i = 0; i<N; i++)
		{
			int sum = 0;
			System.out.print("\n");
			for (int j = 0; j<N; j++)
			{
				if (i==j) continue;
				int ras = mas[i]>=mas[j] ? mas[i]-mas[j] : mas[j]-mas[i];
				sum+=ras;	
				System.out.print("Distance between points "+mas[i]+" and "+mas[j]+ " is "+ras +" \n");
			}
			System.out.print("The resulting amount is " + sum +"\n");
			if (sum < min_sum)
				{
					min_sum = sum;
					tochka = mas[i];
				}
		}
		return tochka;
	}
}