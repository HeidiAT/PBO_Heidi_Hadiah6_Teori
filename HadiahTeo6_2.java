import java.util.Scanner;

class identitas
{
	public String nama;
	public String jurusan;
	public int nim;
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void setJurusan(String jurusan)
	{
		this.jurusan = jurusan;
	}
	
	public String getJurusan()
	{
		return jurusan;
	}
	
	public void setNIM(int nim)
	{
		this.nim = nim;
	}
	
	public int getNIM()
	{
		return nim;
	}
}

public class HadiahTeo6_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		identitas iden = new identitas();
		System.out.print("Masukkan Nama Anda: ");
		iden.nama = input.nextLine();
		System.out.print("Masukkan Jurusan Anda: ");
		iden.jurusan = input.nextLine();
		System.out.print("Masukkan NIM Anda: ");
		iden.nim = input.nextInt();
		System.out.println();
		System.out.println("Nama saya adalah "+iden.getNama()+", jurusan saya adalah "+iden.getJurusan()+" dan NIM saya "+iden.getNIM());
	}
}