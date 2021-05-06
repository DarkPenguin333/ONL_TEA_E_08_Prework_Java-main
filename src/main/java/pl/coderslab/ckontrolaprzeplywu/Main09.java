package pl.coderslab.ckontrolaprzeplywu;

public class Main09 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";

            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    row += "* ";
                }
            }
            System.out.println(row);
        }

        System.out.println("");

        for (int i = 1; i <= n; i++) {
            String row = "";

            for (int j = 1; j <= i; j++) {
                row += "* ";
            }
            System.out.println(row);
        }}
}
