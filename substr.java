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

  void sub(){

    String l;

    for(int i=0;i<s.length();i++){

      for(int j=1;j<=s.length()-i;j++){

        l = s.substring(i,i+j);

        System.out.println(l);

      }

    }

  }

}

class substr{

  public static void main(String args[]){

    str s = new str();

    s.get();
 
    s.sub();

  }

}