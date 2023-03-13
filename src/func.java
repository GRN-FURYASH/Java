public class func {

    public int ind_1;
    public int ind_2;

    public void twoSums(int[] arr, int target) {

        int x; int i;

        for ( x = 0 ; x < arr.length ; x++ ) {
            for ( i = 1 ; i < arr.length ; i++ )  {

                if (arr[x] + arr[i] == target) {

                    this.ind_1 = x;
                    this.ind_2 = i;

                }
            }
        }
    }
}
