class Age {
    int age;
    String name;

    public void setDate(String name, int age ) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Имя: " + this.name + ", " + this.age + " лет.");
    }
}
