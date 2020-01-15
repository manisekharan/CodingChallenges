package general.lambda;

import sun.jvm.hotspot.*;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String a[]){
        Greeter greeter = new Greeter();

        HelloWorldGreeting greetingImpl = new HelloWorldGreeting();
        Greeting greeting = new HelloWorldGreeting();

        Greeting myLambdaFunction = () -> System.out.println("Lambda function");
        myLambdaFunction.perform();

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("innerClassGreeting");
            }
        };

        //All same
        greetingImpl.perform();
        greeting.perform();
        innerClassGreeting.perform();

        greeter.greet(greetingImpl);
        greeter.greet(greeting);
        greeter.greet(myLambdaFunction);

    }
}
