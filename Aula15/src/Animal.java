public class Animal {
    private String name;
    private Integer idade;

    public void fazerSom() {
        System.out.println("Som genérico de animal");
    }

    public Animal(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }
}
