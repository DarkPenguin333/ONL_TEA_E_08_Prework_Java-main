package pl.coderslab.ckontrolaprzeplywu;

public class Main02 {

	public static void main(String[] args) {
int nr1 = 11;
int nr2 = 7;
int nr3 = 3;
String points = null;
if (nr3-nr1+nr2>0)
	points="3";
else if (nr1-nr2+nr3>0)
		points = "11";
else if (nr2-nr1+nr3>0)
	points="7";
System.out.println("Najwieksza z liczb to "+ points);


	}

}
