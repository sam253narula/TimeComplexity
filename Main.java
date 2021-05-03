public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{5,6,7,3};

        for(int i=0; i< a.length;i++){      // 1 + // n => 2 + 4n - 4i -3 => 4n - 4i - 1

//            // start inner

//            // 4(n-i-1) + 1 = 4n-4i-3
            for(int j=i+1;j<a.length;j++){      // 1 +    // n-i-1 => 2 + 2
                System.out.println(a[i]+ " " + a[j]);
            }
//
//            //end inner

            //endinner - startinner = 4n-4i-3
        }

        /**
         * 1+
         * i = 0 : 4n-3
         * i = 1 : 4n -7
         * i = 2 : 4n - 11
         * i = 3 : 4n - 15
         * .
         * .
         * .
         * i = n-2 : 4n - 4(n-2) - 3
         * i = n-1 : 4n - 4(n-1) - 3
         *
         *
         * (4n-3) + (4n - 7) + 4n - 11 + ....+ () + (4n - (4n-1))
         *
         * (4n + 4n + 4n + 4n +... + 4n)  - (3 + 7 + 11 + .... + (4n + 1) )
         *
         * 4(n^2) - (3 + 7 + 11 +...+(4n+1) )
         * 4(n^2) - (n/2)(2*3 + (n-1)4)
         * 4(n^2) - ( (3*n) + 2(n)(n-1))
         * 4(n^2) - (3n + 2(n^2) -2n )
         *
         *
         *
         * 2(n^2) + n +100
         *
         * O(n^2)
         * 5 => 155            =>   50   => 10%
         * 10 => 310          =>   200  => 5%
         * 20 => 820          =>   800  => 2.5%
         *
         */

        /**
         * i = 5
         * n = 10
         * n-i = 5
         * 6, 7, 8, 9 = 4
         *
         * i = 6
         * n = 10
         * n-i = 4
         * 7, 8, 9 = 3
         *
         * i = 7
         * n = 10
         * n-i = 3
         * 8, 9
         *
         * i = 9
         * n = 10
         * 0 values
         *
         * i,
         * n,
         * ?
         */

        for(int i =0 ;i < n; i++){
            for( int j = 3; j > 0; j--){  // c
                System.out.println();
            }
        }

        for(int i = 0; i < n ; i++){  //ap
            for(int j = 1; j< n; j = j*2){  //gp

            }
        }

    }
}
