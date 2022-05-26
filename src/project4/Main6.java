package project4;

public class Main6 {

	public static void main(String[] args) {
        int k=0;
		
		for(int i=000001; i<=999999; i++) {
			int a, b;
			a=i/1000;
			b=i%1000;
			if(a==b) {
				k++;
			}
		}
		System.out.println("Кількість комбінацій:" +k);
	}

}
