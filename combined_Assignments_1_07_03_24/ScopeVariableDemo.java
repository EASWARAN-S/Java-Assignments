/* Program to understand variable scope.  */
public class ScopeVariableDemo {
    public static void main(String[] args) {

        int variable1  = 5 ;

        if(variable1 <= 10)
        {
            int temp  = 20;
            System.out.println("The value of variable1 is " + variable1);
            System.out.println("The value of temp is " + temp);
        }
        
         // Attempting to print temp outside of its scope will result in a compiler error 
        //   temp cannot be resolved to a variable

        System.out.println("The value of temp is " + temp);
    }
}
