package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            String row = "";

            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    row += "* ";
                }
                else {row += j + " ";
                }
            }
            System.out.println(row);
        }

        for (int k = n; k >= 1; k--) {
            String row = "";

            for (int l = 1; l <= n; l++) {
                if (l <= k) {
                    row += "* ";
                }
                else {row += l + " ";
                }
            }
            System.out.println(row);
        }

    }
}

