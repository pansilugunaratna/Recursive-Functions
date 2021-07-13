//Addition of all even numbers less than n
object addEven{
    def addEven(n:Int, sum:Int, i:Int): Int = {
        if(i >= n){
             return sum;         
        }  
        return addEven(n, sum+i, i+2);
        //  return (n + i + sum);

    }
    def main(args: Array[String]): Unit = {
        var n = 10;   

        println("Sum of even numbers : " + addEven(n,0,0) );       
    }
}