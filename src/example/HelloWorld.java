package example;


public class HelloWorld {
    public String sayHelloWorldFrom(String from[]) throws Exception {
        new sendEmailFunc().start(from);
        return "send success";
    }
}
