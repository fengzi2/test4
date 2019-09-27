package test;

public class main {
    public static void main(String[] args) {  
        //测试，传入多个参数  
        test("hello", "world", "123", "china", "csdn", "com");  
    	//test(new String[] {"hello", "world", "123", "china", "csdn", "com"});
    }  

    public static void test(String... arguments) {  
        for (int i = 0; i < arguments.length; i++) {  
            System.out.println(arguments[ i ]);  
        }  
    }  



}
