//Print the sum of numbers from 1 to n

object addition {
    //Take sum of addition
    def addition(n:Int, sum:Int, i:Int) : Int = { 

        if(i == n+1){
             return sum;         
        }  
        return addition(n, sum+i, i+1);    
    }

    def main(args: Array[String]): Unit = {
        var n = 5;
        
        println("Sum of numbers : " + addition(n ,0, 1));
        
    }
}
