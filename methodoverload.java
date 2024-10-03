import java.util.*;
public class methodoverload {

    static int area(int l,int b){
        return l*b;
    }
    
    static double area(double r){
        return Math.PI*r*r;
    }
    
    static int reverse(int n){
        int rem=0;
        int rev=0;
        
        while(n!=0){
            
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
        
        
        }
        
        
        
        return rev;
    }
    
    static int[] reversearray(int a[]){
        int b[]=new int[a.length];
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }
        return b;
    }
    
    static boolean validatename(String n){
        
        return n.matches("[a-zA-Z\\s]+");
        
    }
    
    static boolean validage(int age){
        return age>=3 && age<=15;
    }
    
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
        
//        System.out.println("enter value to calculate area of rectangle:");
//        int l=s.nextInt();
//                int b=s.nextInt();
//        
//        System.out.println("enter value to calculate area of circle:");
//        
//        double r=s.nextDouble(); 
//        
//        System.out.println("area of rectangle: "+area(l,b));
//        
//        
//        System.out.println("area of circle: "+area(r));
//        


//    System.out.println("enter value to reverse:");
//        
//        int n=s.nextInt(); 
//        
//        System.out.println("Reverse of given number is: "+reverse(n));
//  

    int a[]={1,3,4,5,6};
    for(int i=0;i<a.length;i++){
    System.out.println(a[i]+" ");
    }
    
    
    System.out.println("\n");
    
    System.out.println("Reverse of given array is: ");  
    int c[]=new int[a.length];
    
    c=reversearray(a);
    for(int i=0;i<a.length;i++){
    System.out.println(c[i]+" ");
}
    
    
    
 System.out.println(validage(14));
       
    
    }
    
}
