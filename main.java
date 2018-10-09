package tugas;

import java.util.*;


public class main {

	public static void main(String[] args) {
	System.out.println("*******Object Kelas Kotak*******");
	// membuat object dari class kotak
	kotak main = new kotak();
		
	// method setter kotak
	main.setPanjang(10.23);
	main.setLebar(4.56);
		
	// method getter kotak
	System.out.println("panjang : " + main.getPanjang());
	System.out.println("lebar : " + main.getLebar());
	System.out.println("luas : " + main.getPanjang()*main.getlebar());
	System.out.println("keliling : " + main.Gettlebar()*main.getPanjang()*main.getLebar()*main.getPanjang());
	
	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "Nurdina";
	mahasiswa.nim = "D0217316";
	mahasiswa.alamat = "Campa";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "Mahasiswi";
	mahasiswa.tinggiBadan = "159";
	mahasiswa.beratBadan = "45";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getNama());
	System.out.println("nim : " + mahasiswa.getNim());
	System.out.println("alamat : " + mahasiswa.getAlamat());
	System.out.println("golongan Darah : " + mahasiswa.getGolongnDarah());
	System.out.println("Status : " + mahasiswa.getStatus());
	System.out.println("tinggi badan : " + mahasiswa.getTinggiBadan());
	System.out.println("berat badan : " + mahasiswa.getBeratBadan());

	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari kelas node
	Node Node = new Node();
	
	//method setter node
	Node.label = "AQUA";
	Node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + Node.getlabel());
	System.out.println("jumlah label : " + Node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object dari kelas stack
	stack stack = new stack();
	
	stack.value[0] = "dina";
	stack.value[1] = "dila";
	stack.value[2]= "fatma";
	stack.value[3]= "Rahma";
	stack.value[4] = "ramlah";
	stack.value[5] = "sintia";
	stack.value[6]= "ani";
	stack.value[7]= "irja";
	stack.value[8] = "ira";
	stack.value[9] = "ikha";
	stack.value[10]= "kurni";
	stack.value[11]= "nadia";
	stack.value[12] = "yanhi";
	stack.value[13] = "mujna";
	stack.value[14]= "cica";
	stack.value[15]= "juli";
	stack.value[16] = "rosa";
	stack.value[17] = "nila";
	stack.value[18]= "lina";
	stack.value[19]= "yana";
	stack.value[20] = "mariani";
	stack.value[21] = "marwah";
	stack.value[22]= "nafisha";
	stack.value[23]= "yuli";
	stack.value[24] = "ahmad";
	stack.value[25] = "aswad";
	stack.value[26]= "udin";
	stack.value[27]= "aswandi";

	stack.setvalueAt(4 ,"Muhammad");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}
