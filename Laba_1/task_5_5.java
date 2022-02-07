import java.util.Scanner;
class task_5_5
{
//ƒан номер некоторого года (положительное целое число). ¬ывести соответствующий ему номер столети€, учитыва€, что, к примеру, началом 20 столети€ был 1901 год.
	public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("¬ведите номер года: ");
	int num = sc.nextInt();
	int cen = num/100;
	if (num%100 > 0)
	{
		cen+=1;
	}
	System.out.print("—оответствующий ему номер столети€ "+cen);
	
	}
}