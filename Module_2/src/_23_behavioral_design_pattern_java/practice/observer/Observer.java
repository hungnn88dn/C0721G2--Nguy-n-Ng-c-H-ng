package _23_behavioral_design_pattern_java.practice.observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
