public enum Animals {
    LION(10, "Simba"), ELEPHANT(20,"Dambo"), ZEBRA(4,"Martin");
    int age;
    String name;

    Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
