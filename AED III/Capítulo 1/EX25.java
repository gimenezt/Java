package edIII;  
public class Atividade_2_25 {  
public static void main(String[] args) {  
 String S1 = new String("abcd");  
 String S2 = null;  
 S2 = S1;  
 String S3 = new String("!!!".concat(S2.concat("!!!") ) );   System.out.println(S1+S2+S3);  
 }  
}  
