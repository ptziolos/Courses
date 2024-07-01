package Patterns;

import Patterns.Adapter.AdapterPattern;
import Patterns.Bridge.BridgePattern;
import Patterns.Builder.BuilderPattern;
import Patterns.ChainOfResponsibility.ChainOfResponsibilityPattern;
import Patterns.Command.CommandPattern;
import Patterns.Decorator.DecoratorPattern;
import Patterns.Facade.FacadePattern;
import Patterns.Factory.FactoryPattern;
import Patterns.Flyweight.FlyweightPattern;
import Patterns.Interpreter.InterpreterContext;
import Patterns.Interpreter.InterpreterPattern;
import Patterns.Iterator.IteratorPattern;
import Patterns.MVC.MVCPattern;
import Patterns.Mediator.MediatorPattern;
import Patterns.Memento.MementoPattern;
import Patterns.Observer.ObserverPattern;
import Patterns.Prototype.PrototypePattern;
import Patterns.Proxy.ProxyPattern;
import Patterns.Singleton.SingletonPattern;
import Patterns.State.StatePattern;
import Patterns.Strategy.StrategyPattern;
import Patterns.Template_Method.TemplateMethodPattern;
import Patterns.Visitor.VisitorPattern;

public class Main {

  public static void main(String[] args) {

    System.out.println("\n---Strategy example---");
    StrategyPattern strategy = new StrategyPattern();
    strategy.runStrategyPattern();

    System.out.println("\n---Observer example---");
    ObserverPattern observer = new ObserverPattern();
    observer.runObserverPattern();

    System.out.println("\n---Decorator example---");
    DecoratorPattern decorator = new DecoratorPattern();
    decorator.runDecoratorPattern();

    System.out.println("\n---Factory example---");
    FactoryPattern factory = new FactoryPattern();
    factory.runFactoryPattern();

    System.out.println("\n---Singleton example---");
    SingletonPattern singleton = new SingletonPattern();
    singleton.runSingletonPattern();

    System.out.println("\n---Command example---");
    CommandPattern command = new CommandPattern();
    command.runCommandPattern();

    System.out.println("\n---Adapter example---");
    AdapterPattern adapter = new AdapterPattern();
    adapter.runAdapterPattern();

    System.out.println("\n---Facade example---");
    FacadePattern facade = new FacadePattern();
    facade.runFacadePattern();

    System.out.println("\n---Template Method example---");
    TemplateMethodPattern templateMethod = new TemplateMethodPattern();
    templateMethod.runTemplateMethodPattern();

    System.out.println("\n---Iterator example---");
    IteratorPattern iterator = new IteratorPattern();
    iterator.runIteratorPattern();

    System.out.println("\n---State example---");
    StatePattern state = new StatePattern();
    state.runStatePattern();

    System.out.println("\n---Proxy example---");
    ProxyPattern proxy = new ProxyPattern();
    proxy.runProxyPattern();

    System.out.println("\n---MVC example---");
    MVCPattern mvc = new MVCPattern();
    mvc.runMVCPattern();

    System.out.println("\n---Builder example---");
    BuilderPattern builder = new BuilderPattern();
    builder.runBuilderPattern();

    System.out.println("\n---Prototype example---");
    PrototypePattern prototype = new PrototypePattern();
    prototype.runPrototypePattern();

    System.out.println("\n---Mediator example---");
    MediatorPattern mediator = new MediatorPattern();
    mediator.runMediatorPattern();

    System.out.println("\n---Visitor example---");
    VisitorPattern visitor = new VisitorPattern();
    visitor.runVisitorPattern();

    System.out.println("\n---Memento example---");
    MementoPattern memento = new MementoPattern();
    memento.runMementoPattern();

    System.out.println("\n---Interpreter example---");
    InterpreterPattern interpreter = new InterpreterPattern(new InterpreterContext());
    interpreter.runInterpreterPattern();

    System.out.println("\n---Chain of responsibility example---");
    ChainOfResponsibilityPattern chainOfResponsibility = new ChainOfResponsibilityPattern();
    chainOfResponsibility.runChainOfResponsibilityPattern();

    System.out.println("\n---Bridge example---");
    BridgePattern bridge = new BridgePattern();
    bridge.runBridgePattern();

    System.out.println("\n---Flyweight example---");
    FlyweightPattern flyweight = new FlyweightPattern();
    flyweight.runFlyweightPattern();

  }

}
