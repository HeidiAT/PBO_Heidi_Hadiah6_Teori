import java.util.Scanner;

class kubus
{
	public int s;
	
	public void setS(int s)
	{
		this.s = s;
	}
	
	public int getS()
	{
		return s;
	}
}

class lingkaran
{
	public int r;
	public double phi;
	
	public void setR(int r)
	{
		this.r = r;
	}
	
	public int getR()
	{
		return r;
	}
	
	public void setPhi(double phi)
	{
		this.phi = phi;
	}
	
	public double getPhi()
	{
		return phi;
	}
}

public class HadiahTeo6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		lingkaran ling = new lingkaran();
		kubus kub = new kubus();
		
		double L;
		int V;
		
		System.out.println("Menentukan Luas Lingkaran");
		System.out.print("Masukkan Jari-jari Lingakaran =  ");
		ling.r = input.nextInt();
		ling.setPhi(3.14);
		L = ling.getPhi() * ling.r * ling.r;
		System.out.println("Luas Lingkaran = " +L);
		System.out.println();
		
		System.out.println("Menentukan Volume Kubus");
		System.out.print("Masukkan Panjang Sisi = ");
		kub.s = input.nextInt();
		V = kub.s * kub.s * kub.s;
		System.out.println("Volume Kubus = " +V);
	}
}