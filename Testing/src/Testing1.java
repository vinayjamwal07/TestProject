
public class Testing1 {

	static void print(int n){
		if(n==0) return;
		else{
			print(--n);
			System.out.println(n);
		}
	}

	public static void main(String args[]){
		print(4);
	}

}
