public class Element {
  private int atomic_number;
  private int atomic_mass;
  private int num_neutrons;
  private int num_electrons;
  private String element_symbol;

  public void setElement(String s1) {
    element_symbol = s1;
  }
  public void setAtomics(int a, int b) {
    atomic_number = a;
    atomic_mass = b;
  }

  public String getElement() {
    return element_symbol;
  }
  public int getAtomicNumber() {
    return atomic_number;
  }
  public int getAtomicMass() {
    return atomic_mass;
  }

  public void changeNum(int c) {
    atomic_number += c;
    element_symbol = newElement(atomic_number);
  }
  public void changeMass(int d) {
    atomic_mass += d;
  }

  private String newElement(int e) {
    String e1 = " ";
    if (e >= 78) {
      String above78inc [] = {"Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db", "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn"};
      e1 = above78inc[e - 78];
    }
    return e1;
  }
}
