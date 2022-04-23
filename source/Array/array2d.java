//Leetcode 74 Question
//find element in array if it is present return true otherwise false;
// Searching using Linear Search
//time complexity is O(n2)
class array2d{
    public static void main(String[] args) {
        int [][]matrix={
                {2,3,45,88,65},
                {5,4,7,64,12},
                {0,100,120,111}
        };
        int target=111;
        boolean res=searchMatrix(matrix,target);
        System.out.println(res);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        for(int row=0;row<matrix.length;row++){
            for(int col= 0;col<matrix[row].length;col++){
                if(target==matrix[row][col])
                    return true;
            }
        }
        return false;
    }
}