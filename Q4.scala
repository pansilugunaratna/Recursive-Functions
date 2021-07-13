//Determine even and odd
object oddEven{
    def oddEven(n:Int): Boolean = {
        if(n==0)
            return true;
        else if(n==1)
            return false;
        else if(n<0)
            return oddEven(-n);
        else
            return oddEven(n-2);
    }
    def main(args: Array[String]): Unit = {
        var n = 0;
        println("Number is : ");
        if(oddEven(n))
          print("even");  
        else
          print("odd");  
    }
}