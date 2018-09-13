import java.util.Scanner;

class str{

  String s;

  Scanner kb = new Scanner(System.in);

  void get(){

    s = kb.next();

  }

  void print(){

    System.out.println(s);

  }

  String convert(){

    String n = "";
  
    char ch;

    for(int i=0;i<s.length();i++){

      ch = s.charAt(i); 

      if(Character.isUpperCase(s.charAt(i))){

        ch = Character.toLowerCase(ch); 
                
        n = n + ch; 

      }

      else if(Character.isLowerCase(s.charAt(i))){

        ch = Character.toUpperCase(ch);

        n = n + ch;
 
      }
      
    }

    return n;

  }

}

class toggle{

  public static void main(String args[]){

    str s = new str();

    s.get();
 
    System.out.println(s.convert());

  }

}