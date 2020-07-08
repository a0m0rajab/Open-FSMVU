 public static void main(String[] args) {
        LoopSolution();
        Formula_solution(2, 3, 6);
        System.out.println(" ---- ");
        Scanner Sc = new Scanner(System.in);
        System.out.println(" write the matrix row number ");
        int a = Sc.nextInt();
        System.out.println(" write the matrix coloumn number");
        int b = Sc.nextInt();
        int[][] Matrix = new int[a][b];
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {
                Matrix[i][j] = Sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {
                System.out.print(Matrix[i][j] + " ");;
            }
            System.out.println("");
        }

        symetric(Matrix, a, b);

    }

    public static void symetric(int[][] a, int c, int b) {
        if (c == b) {
            boolean result = true;
            Firstloop :
            for (int i = 0; i < c; i++) {

                for (int j = 0; j < b; j++) {
                    if (a[i][j] != a[c-j-1][b-i-1]) {
                        result = false;
                        System.out.println("its not Syemtric ");
                        break Firstloop;

                    }
                }
            }
            if (result) {
                System.out.println("Its symetric");
            }
        } else {
            System.out.println(" its not syemteric , the row and coloumn are not equal");
        }

    }

    public static void Formula_solution(double a, double r, double n) {
        if (r == 1) {
            System.out.println((n + 1) * a);
        } else {
            double result;
            double power = Math.pow(r, n + 1);
            result = ((a * power) - a) / (r - 1);
            System.out.println(result - a);
        }

    }

    public static void LoopSolution() {
        double result = 0;
        for (int i = 1; i <= 6; i++) {
            result += Math.pow(3, i);
        }
        System.out.println(result * 2);
    }
}
