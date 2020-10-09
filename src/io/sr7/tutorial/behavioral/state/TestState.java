package io.sr7.tutorial.behavioral.state;

public class TestState {
    public static void main(String[] args) {
        Context context=new Context();
        State state=new State("First",1);
        State state2=new State("Second",2);
        context.setState(state);//we change state of class and never change class itself
        System.out.println(context.getState());
        context.setState(state2);
        System.out.println(context.getState());
    }
}
