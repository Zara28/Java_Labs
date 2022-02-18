package My;

import java.util.Random;
import My.*;
public class Odn_Mas
{
	int [] mas;
	int n;
	public Odn_Mas(int N)
	{
	//My.Dv_Mas mat = new My.Dv_Mas(5);
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
