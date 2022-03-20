package Lib;
import java.util.Random;
public class Odn_Mas {
    public int [] mas;
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

	public int col_kr()
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
	public String create_stroka(int [] mas, int n)
	{
		String str = "";
		for (int i = 0; i<n; i++)
		{
				str+=mas[i]+" ";
		}
		return str;
	}
}
