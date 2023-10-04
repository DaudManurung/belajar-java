public class MethodParameter {
  public static void main(String[] args) {


    sayHello("Daud", "Manurung");
    sayHello("Jona", "Julu");
    sayHello("Fatwa", "MUI");

  }

  static void sayHello(String firstName, String lastName){
    System.out.println("Hello " + firstName + " " + lastName);
  }
}
