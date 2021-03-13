package task1;

public class main {

    static void myExcepter() throws MyException {
 
        throw new MyException();
    }
    static void excepter() throws NullPointerException {
 
         throw new NullPointerException();
     }
    public static void main(String [] args) throws NullPointerException, MyException {
        int a[] = {1,2,3};

        try {
            a[4] = 4;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("exception: " + e);
        }
        try {
            excepter();
        }
        catch (NullPointerException e) {
           e.printStackTrace();
        }      
        try {
            myExcepter();
        }catch(MyException e) {
            System.out.println("exception: " + e);
        }

        System.out.println("Hello World!");
    }

}