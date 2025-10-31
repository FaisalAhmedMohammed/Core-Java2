public class Addition1{
     static int add(int a, int b)throws IllegalArgumentException{
          if( a<0 || b<0 ){
              throw new IllegalArgumentException("Do not pass -ve numbers");
           }
            else{
              return a+b;
           }
     }
  
}