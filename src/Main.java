class Main {

    public static void main(String[] args) {
        Man dad = new Man("Toyota Corolla", 43, true);
        Man grandpa = new Man("Opel Astra", 70, false);
        Woman grandma = new Woman("609437492", 68, "white");
        Woman mom = new Woman("123123123", 40, "black");
        Man grandpa2 = new Man("Opel Corsa", 75, true);
        Woman grandma2 = new Woman("60998762", 72, "red");
        Child child = new Child("I a", "SP 18");
        child.addFather(dad);
        child.addMother(mom);
        dad.addFather(grandpa);
        dad.addMother(grandma);
        mom.addFather(grandpa2);
        mom.addMother(grandma2);

        FamilyXmlVisitor visitor = new FamilyXmlVisitor();
        child.accept(visitor);

    }
}
