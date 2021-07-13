//First n numbers of Fibonocci series
object fibonocci{
    def fib(x:Int): Int = {
        if(x <= 1){
             return x;         
        }  
        return fib(x-1) + fib(x-2);
    }
    def main(args: Array[String]): Unit = {
        var n = 6;
        println("Fibonocci series : "); 
        for(i <- 0 until n){           
            print(fib(i)); 
            print(" ");
        }
            
    }
}