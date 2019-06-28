public class Child implements FamilyMember {

    final String classNumber;
    final String schoolName;
    Man father;
    Woman mother;

    public Child(String classNumber, String schoolName) {
        this.classNumber = classNumber;
        this.schoolName = schoolName;
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
