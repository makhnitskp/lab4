package project4;

public class Main5 {

	public static void main(String[] args) {
		int k=0;
		
		for(int i=0; i<24; i++) {
			int a, b;
			a=i/10;
			b=i%10;
			for(int j=0; j<60; j++) {
				int f, e;
				f=j/10;
				e=j%10;
				if(a==e&&b==f) {
					k++;
					System.out.println(a+""+b+":"+f+""+e);
				}
				
			}
		}
		System.out.println("Кількість комбінацій:" +k);
	}

}
