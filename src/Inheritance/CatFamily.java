package Inheritance;

public class CatFamily {
    protected int legs;     // protected - чтобы можно было их менять в подклассах
    protected int eyes;
    protected boolean canEatPerson;

  public CatFamily(int legs, int eyes, boolean canEatPerson){
      this.legs=legs;
      this.eyes=eyes;
      this.canEatPerson=canEatPerson;
    }

    public int getLegs() {    //geter
        return legs;
    }
    public int getEyes() {    //geter
        return eyes;
    }
    public boolean isCanEatPerson() {    //geter
        return canEatPerson;
    }

    public void eat(){
        System.out.println("Кушаю");
    }
}
