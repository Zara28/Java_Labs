package My;

import java.util.Random;
import My.Odn_Mas;
public class Dv_Mas extends My.Odn_Mas{
	public int [][] mass;
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
				mass[i][j]=random.nextInt(100)+10;
			}
		}
	}
	public void obr()
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
	public String stroka()
	{
	String str = "";
		for(int i = 0; i<this.n; i++)
		{
			str+=super.create_stroka(this.mass[i], this.n);
		}
		return str;
	}
}