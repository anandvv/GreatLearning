class Recursion{
    int function(int n)
       {
         int result;
         if (n<1) return n--;
         result = function (n - 1);
         return result;
       }
 }

