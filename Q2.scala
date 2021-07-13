//Print all prime numbers less than n

object sequence {
    //check whether prime and return boolean value
    def prime(n:Int, i:Int) : Boolean = { 

        if(n <= 2){
            if(n==2)
                return true;
            else
                return false;
        }
        if(n%i == 0){
            return false;
        }
        if(i*i > n){
            return true;
        }
        return prime(n, i+1)  
       
    }
    def main(args: Array[String]): Unit = {
        var n = 16;
        
        println("Prime numbers : ");
        for(i <- 1 to n){
            if(prime(i,2)){
                 print(i);
                 print(" ");
            }
        }
    }
}
