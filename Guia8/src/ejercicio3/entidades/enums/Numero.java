package ejercicio3.entidades.enums;

public enum Numero {

    N1(1),
    N2(2),
    N3(3),
    N4(4),
    N5(5),
    N6(6), N7(7), N10(8), N11(9), N12(10);

  public Integer getNum() {
    return num;
  }
    
    private Integer num;

  private Numero(Integer num) {
    this.num = num;
  }
    
    
}
