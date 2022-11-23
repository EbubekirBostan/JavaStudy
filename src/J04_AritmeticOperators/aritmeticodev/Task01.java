package J04_AritmeticOperators.aritmeticodev;

public class Task01 {
	public static void main(String[] args) {
		int x = 4;
        x++;//5
        x += x;//10
        --x;//9
        x = 7 + x;//16
        x *= x;//256
        x -= 3;//253

        System.out.println(" x = " + x );//253
        
        int a = 3;
        double d = 4.5;

        d+=a;// d:7.5, a:3
        a+=d;// a:10, d7.5
        d-=a;//d: -2.5, a:10
        a-=d;// a:12, d:-2.5

        System.out.println(" d = " + ++d );//-1.5
        System.out.println(" a = " + a-- );//12
        
        

	}

}
