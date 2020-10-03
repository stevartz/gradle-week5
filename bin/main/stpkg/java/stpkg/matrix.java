package stpkg;



public class matrix {


    public void wahoovian(double mat[][]) {
        int count = 0;

        // Loop through all rows
        for (double[] row : mat)

            // Loop through all columns of current row
            for (double x : row) {
                System.out.print(x + " ");
                count++;

                if (count == 3 || count == 6) {

                    System.out.println();
                }
            }


    }

}





