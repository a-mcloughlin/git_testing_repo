public final class HelloName {
    public final String name;

    public HelloName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Hello " + name;
    }
}