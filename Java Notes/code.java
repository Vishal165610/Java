class Foo{

}

class Demo{
    public static void main (String a[]){
            String name = new String("Vishal");
            System.out.println(name);
            System.out.println(name.length());
            System.out.println(name.charAt(2));
            System.out.println(name.concat(" Sharma"));
            System.out.println(name.hashCode());
            System.out.println(name.toLowerCase());
            System.out.println(name.toUpperCase());
            System.out.println(name.equals("Vishal"));
            System.out.println(name.equalsIgnoreCase("vishal"));


            //StringBuffer 

            StringBuffer sb = new StringBuffer("Vishal");
            System.out.println(sb.capacity()); // by default capacity is 16
            sb.append(" Sharma"); 
            System.out.println(sb);  
            // System.out.println(sb.delete(0, 5)); // it will delete the characters from index 0 to 5 in one go
            // System.out.println(sb.reverse()); // it will reverse the string output - amrahS lahsiV
            // System.out.println(sb.replace(0, 6, "ReplacedName")); // it will replace the characters from index 0 to 6 with "ReplacedName" 
            System.out.println(sb.toString());  // it will convert StringBuffer to String
            // System.out.println(sb.substring(0, 5)); //it will only return the string from index 0 to 5 
            

            
            
            
        }
        
    }