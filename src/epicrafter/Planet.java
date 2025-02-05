package epicrafter;

// can use interface
// but can not use for inheritance
public record Planet(String name) implements IPlanet {
    @Override
    public void whoIAm() {
        System.out.println("Hello from planet" + name);
    }
}