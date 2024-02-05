package task.generics;

import task.models.BigBox;
import task.models.MediumBox;
import task.models.MicroBox;
import task.models.SmallBox;

import java.util.ArrayList;
import java.util.List;

public class Generics<T extends BigBox> {

  public static void main(String[] args) {
    Generics generics = new Generics();

    generics.addBox(generateMediumBox());
    generics.print(generateMediumBox());
    generics.availability(generatMicroBox());
  }

  List<BigBox> producer = new ArrayList<>();


  List<BigBox> consumer = new ArrayList<>();

  //TODO: реализуйте Метод для проверки наличия коробки в списке (Producer).

  public void availability(T t) {
    System.out.println(producer.contains(t));
  }

  //TODO: реализуйте Метод для добавления коробок в список (Consumer)
  public void addBox(T t) {
    consumer.add(t);
    System.out.println(consumer);
  }

  //TODO: реализуйте Метод для печати списка коробок (Producer)
  public void print(T t) {
    ;
    for (BigBox b : producer) {
      System.out.println(b + " ");
    }
  }


  //TODO: реализуйте Метод для копирования коробок из одного списка в другой (Producer и Consumer)
  public void addAll() {
    producer.addAll(consumer);

  }


  private static BigBox generateBigBox() {
    BigBox bigBox = new BigBox();
    bigBox.setMediumBox(generateMediumBox());
    bigBox.setHeight(20);
    bigBox.setLength(20);
    bigBox.setSize("big");
    bigBox.setWidth(20);
    return bigBox;
  }

  private static MediumBox generateMediumBox() {
    MediumBox mediumBox = new MediumBox();
    mediumBox.setSmallBox(generatSmallBox());
    mediumBox.setHeight(15);
    mediumBox.setLength(15);
    mediumBox.setSize("medium");
    mediumBox.setWidth(15);
    return mediumBox;
  }

  private static SmallBox generatSmallBox() {
    SmallBox smallBox = new SmallBox();
    smallBox.setMicroBox(generatMicroBox());
    smallBox.setHeight(10);
    smallBox.setLength(10);
    smallBox.setSize("small");
    smallBox.setWidth(10);
    return smallBox;
  }

  private static MicroBox generatMicroBox() {
    MicroBox microBox = new MicroBox();
    microBox.setHeight(5);
    microBox.setLength(5);
    microBox.setSize("small");
    microBox.setWidth(5);
    return microBox;
  }


}