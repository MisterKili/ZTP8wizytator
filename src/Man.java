public class Man implements FamilyMember {

    final String carModel;
    final int age;
    final boolean hasBeard;
    Man father;
    Woman mother;

    public Man(String carModel, int age, boolean hasBeard) {
        this.carModel = carModel;
        this.age = age;
        this.hasBeard = hasBeard;
    }

    @Override
    public void accept(FamilyMemberVisitor visitor) {
        visitor.visit(this);
    }

    public void addFather(Man father){
        this.father = father;
    }

    public void addMother(Woman mother){
        this.mother = mother;
    }
}
