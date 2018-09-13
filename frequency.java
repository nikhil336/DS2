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

  char maxchar(){

    int c,max = 0;

    char cl = ' ';

    for(char ch='a';ch<='z';ch++){

      c = 0;

      for(int i=0;i<s.length();i++){
  
        if(ch == s.charAt(i)){

          c++;

        }

      }

      if(c > max){

        max = c;

        cl = ch;

      }

    }

    return cl;
  
  }

}

class frequency{

  public static void main(String args[]){

    str s = new str();

    s.get();
 
    System.out.println(s.maxchar());

  }

}