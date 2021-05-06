package pl.coderslab.ckontrolaprzeplywu;

public class Main01 {

    public static void main(String[] args) {
    int nr1 = 7;
    int nr2 = 3;
    char points = 0;
    if (nr1-nr2>0)
        points = '7';
    else if (nr1-nr2<0)
        points = '3';
    System.out.print("Większa liczba to " + points);
        }
}

