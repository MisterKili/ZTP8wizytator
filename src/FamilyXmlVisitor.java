public class FamilyXmlVisitor implements FamilyMemberVisitor {

    private int numberOfTabs = 0;

    @Override
    public void visit(Man man) {
        System.out.println(getTabs()+"<man>");
        numberOfTabs++;
        System.out.println(getTabs()+"<car model>"+man.carModel+"</car model>");
        System.out.println(getTabs()+"<age>"+man.age+"</age>");
        System.out.println(getTabs()+"<has beard>"+man.hasBeard+"</has beard>");
        printFather(man.father);
        printMother(man.mother);
        numberOfTabs--;
        System.out.println(getTabs()+"</man>");
    }

    @Override
    public void visit(Woman woman) {
        System.out.println(getTabs()+"<woman>");
        numberOfTabs++;
        System.out.println(getTabs()+"<phone number>"+woman.phoneNumber+"</phone number>");
        System.out.println(getTabs()+"<age>"+woman.age+"</age>");
        System.out.println(getTabs()+"<hair colour>"+woman.hairColour+"</hair colour>");
        printFather(woman.father);
        printMother(woman.mother);
        numberOfTabs--;
        System.out.println(getTabs()+"</woman>");
    }

    @Override
    public void visit(Child child) {
        System.out.println(getTabs()+"<child>");
        numberOfTabs++;
        System.out.println(getTabs()+"<class number>"+child.classNumber+"</class number>");
        System.out.println(getTabs()+"<school name>"+child.schoolName+"</school name>");
        printFather(child.father);
        printMother(child.mother);
        numberOfTabs--;
        System.out.println(getTabs()+"</child>");
    }

    private void printFather(Man father){
        if(father != null) {
            System.out.println(getTabs() + "<father>");
            numberOfTabs++;
            visit(father);
            numberOfTabs--;
            System.out.println(getTabs() + "</father>");
        }
    }

    private void printMother(Woman mother){
        if(mother != null) {
            System.out.println(getTabs() + "<mother>");
            numberOfTabs++;
            visit(mother);
            numberOfTabs--;
            System.out.println(getTabs() + "</mother>");
        }
    }


    private String getTabs(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<numberOfTabs; i++){
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }
}
