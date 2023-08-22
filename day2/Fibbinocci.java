package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int X=0;
int Y=1;
int sum;
for (int i = 1; i <= 11; i++) {
	sum	= X+Y;
	System.out.println("the fibbnocci value" +sum);
	X=Y;
	Y=sum;
	
}
	}

}
