package Home;



public class Modul5{
  
	public static void main(String[] args){
		int f0 = 1;
		int f1 = 1;
		int f2;
		System.out.print(f0+" "+f1+" ");
		for(int i = 3; i <= 15; i++){
			f2=f0+f1;
			System.out.print(f2+" ");
			f0=f1;
			f1=f2;
		}
		System.out.println();
	}
}