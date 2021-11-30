public class Top2HighestValue
{
    public void print2TopNumbers(int[] nums){
        int highOne = 0;
        int highTwo = 0;
        for(int n:nums){
            if(highOne < n){
                highTwo = highOne;
                highOne =n;
            } else if(highTwo < n){
                highTwo = n;
            }
        }
        System.out.println("First Highest Value: "+highOne);
        System.out.println("Second Highest Value: "+highTwo);
    }

    public static void main(String[] args){
        int[] num = {11,22,45,92,21,54,79,11};
        Top2HighestValue top = new Top2HighestValue();
        top.print2TopNumbers(num);
    }
}