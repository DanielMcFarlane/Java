/**
* Write a description of class ArrayOperations here.
*
* @author (your name)
* @version (a version number or a date)
*/
    public class ArrayOperations
    {
    // instance variables - replace the example below with your own
    private int[] nums;
 
    /**
     * Constructor for objects of class ArrayOperations
     */
    public ArrayOperations()
    {
        // initialise instance variables
        nums=new int[]{1,2,3,4,5};
    }
    
    public ArrayOperations(int[] nums)
    {
        // initialise instance variables
        this.nums=nums;
    }
    
    public void reverse(){
        for(int l=0;l<nums.length/2;l++){
            int r=nums.length-1-l;// 4 3,
            int temp= nums[l];
            nums[l]=nums[r];
            nums[r]= temp;          
        }
    }
    
    /**
     * findElement method
     * complete for homework
     * 
     * loops through array searching for numToFind 
     * If found returns index found at otherwise returns -1 
     *
     * @param numToFind A parameter
     */
    public int findElement(int numToFind){
      for (int i = 0; i < nums.length; i++){
        if (nums[i] == numToFind) {
            return i;
            }
        }
        return -1;
    }
}