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

  boolean check(){

    String n = new String();

    for(int i=s.length()-1;i>=0;i--){

      n = n + s.charAt(i);
      
    }

    return (s.equals(n));

  }

}

class pallindrome{

  public static void main(String args[]){

    str s = new str();

    s.get();

    System.out.println("Pallindrome: "+s.check());

  }

}