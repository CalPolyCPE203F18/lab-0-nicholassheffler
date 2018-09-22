public class Lab00
{
   public static int char_count(char c, String s)
   {
     int count = 0;
     for (int j = 0; j<s.length(); j++){
       if (c ==s.charAt(j))
       {
         count++;
       }

     }
     return count;
   }
   public static void main(String[] args)
   {
     int x = 5;
     String y = "hello";
     double z = 9.8;
     System.out.println("x: " + x+ " y: " + y + " z: " + z);

     int [] nums = {3,6,-1,2};
     for (int i = 0; i<nums.length; i++)
     System.out.println(nums[i]);

     int output = Lab00.char_count('l',y);
     System.out.println("Found: "+output);

     for (int k = 1; k<11; k++){
       System.out.print(k+" ");
     }
   }
}
