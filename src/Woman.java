public class Woman implements FamilyMember {

    final String phoneNumber;
    final int age;
    final String hairColour;
    Man father;
    Woman mother;

    public Woman(String phoneNumber, int age, String hairColour) {
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.hairColour = hairColour;
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
