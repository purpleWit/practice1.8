import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

  private List<Telephone> telephones;
  private Scanner scanner = new Scanner(System.in);

  public void mainLogic() {
    telephones = createTelephone();
    while (true) {
      System.out.println("1 - Добавить телефон в список.\n"
                          + "2 - Удалить телефон из списка по серийному номеру\n"
                          + "3 - Удалить все телефоны из списка\n"
                          + "4 - Закончить работу программы" );

      int firstMenuPoint = scanner.nextInt();
      scanner.nextLine();
      switch (firstMenuPoint){
        case 1:
          case1();
          break;
        case 2:
          case2();
          break;
        case 3:
          case3();
          break;
        case 4:
          return;
        default:
          System.out.println("Не правильная команда");
      }
      }
  }

  private void case1() {
    System.out.println("Введите модель телефона");
    String telephoneModel = scanner.nextLine();
    System.out.println("Введите серийный номер телефона");
    String serialNumber = scanner.nextLine();


      for (Telephone t : telephones) {
        if (t.getSerialNumber().equals(serialNumber)) {
          System.out.println("Телефон с таким серийным номером уже существует введите другой");
          return;
        }
      }

    System.out.println("Введите цвет");
    String color = scanner.nextLine();
    System.out.println("Введите тип телефона\ntrue - мобильный\nfalse - нет");
    boolean isMobile = scanner.nextBoolean();

    Telephone telephone = new Telephone(telephoneModel, serialNumber, color, isMobile);
    telephones.add(telephone);
    System.out.println(telephones);
    }


    private  void case2() {
      System.out.println("Введите серийный номер телефона который хотите удалить");
      String deleteSerialNumber = scanner.nextLine();

      for(Telephone t : telephones) {
        if(t.getSerialNumber().equals(deleteSerialNumber)) {
          telephones.remove(t);
          System.out.println("Телефон с серийным номером " + deleteSerialNumber + " удален");
          System.out.println(telephones);
          return;
        }
      }
      System.out.println("Телефон не найден в списке введите серийный номер заново");
    }


    private void case3() {
    telephones.clear();
    System.out.println(telephones);
    System.out.println("Все телефоны удалены");
    }
  private List<Telephone> createTelephone() {
    List<Telephone> telephones = new ArrayList<>();
    Telephone t1 = new Telephone("Panasonic", "X35235ZMD", "white", false);
    Telephone t2 = new Telephone("Samsung S10", "XYZ123456789", "black", true);
    Telephone t3 = new Telephone("Iphone X", "ASIOS77777QWERTY", "black", true);
    telephones.add(t1);
    telephones.add(t2);
    telephones.add(t3);
    return telephones;
  }
}
