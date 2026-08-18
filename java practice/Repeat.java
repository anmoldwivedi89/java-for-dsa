

public class Repeat {
    public static void main(String[] args){
  String ch = "Hello World";
  char target = 'l';
  int count = 0;
  int n = ch.length();
  for(int i=0;i<n;i++){
    if(ch.charAt(i)==target){
      count++;
    }
  }
  System.out.print(count);
   
}}
