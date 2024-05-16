public class q1{
    public static void main (String[]args){
        //using string litrals
        String s1="srd";
        String s2="srd";
        //using new keyword
        String s3=new String ("srd");
        String s4=new String ("srd");
        
        //memory and comparision
        System.out.println("s1==s2 : "+(s1==s2));//true,same memory location in sting pool
        System.out.println("s3 == s4 : " + (s3 == s4)); // false, different memory locations in heap
        // Using equals method for content comparison
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true, content is same 

    }
}