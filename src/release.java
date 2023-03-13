public class release {

    public static void main(String[] args) {

        
        int[] nums = {2, 3, 5};
        int target = 8;
        
        func sorter = new func();
        int[] results = new int[2];

        sorter.twoSums(nums, target);

        
        results[0] = sorter.ind_1;
        results[1] = sorter.ind_2;

        System.out.println(results[0]);
        System.out.println(results[1]);

    }
    
}
