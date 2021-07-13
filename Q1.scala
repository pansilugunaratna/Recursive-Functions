//Check whether prime or not

object prime {
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
        var n = 1;
        
        println("Is prime : " + prime(n,2));
    }
}