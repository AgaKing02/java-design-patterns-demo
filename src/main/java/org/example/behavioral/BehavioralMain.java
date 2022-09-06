package org.example.behavioral;

import org.example.behavioral.chain.AuthenticationHandler;
import org.example.behavioral.chain.Handler;
import org.example.behavioral.command.GenerateReportOperation;
import org.example.behavioral.command.ReportGeneratorExecutor;
import org.example.behavioral.interpreter.AbstractExpression;
import org.example.behavioral.interpreter.AndExpression;
import org.example.behavioral.interpreter.OrExpression;
import org.example.behavioral.interpreter.TerminalExpression;
import org.example.behavioral.iterator.EmployeeContainer;
import org.example.behavioral.iterator.Iterator;
import org.example.behavioral.mediator.Colleague;
import org.example.behavioral.mediator.ConcreteColleague;
import org.example.behavioral.mediator.ConcreteMediator;
import org.example.behavioral.mediator.Mediator;
import org.example.behavioral.memento.CareTaker;
import org.example.behavioral.memento.Originator;
import org.example.behavioral.observer.ProductSubject;
import org.example.behavioral.observer.StoreObserver;
import org.example.behavioral.observer.SupplyChainObserver;
import org.example.behavioral.state.Product;
import org.example.behavioral.strategy.AddOperation;
import org.example.behavioral.strategy.Context;
import org.example.behavioral.strategy.MultiplyOperation;
import org.example.behavioral.template.AbstractComputer;
import org.example.behavioral.template.QuantumComputer;
import org.example.behavioral.template.TowerComputer;
import org.example.behavioral.visitor.Vehicle;
import org.example.behavioral.visitor.VehiclePart;
import org.example.behavioral.visitor.VehiclePartShowVisitor;

import java.util.Arrays;
import java.util.List;

public class BehavioralMain {
    public static void main(String[] args) {
        //Chain of responsibility pattern example
        Handler authenticationHandler = new AuthenticationHandler();
        authenticationHandler.handleRequest();
        //Command pattern example
        ReportGeneratorExecutor executor = new ReportGeneratorExecutor();
        executor.executeOperation(new GenerateReportOperation());
        //Interpreter pattern example
        AbstractExpression car1 = new TerminalExpression("Toyota");
        AbstractExpression car2 = new TerminalExpression("Mazda");

        AbstractExpression isFast = new OrExpression(car1, car2);
        AbstractExpression isReliable = new AndExpression(car1, car2);
        System.out.println(isFast.interpret("Toyota"));
        System.out.println(isReliable.interpret("Mazda Toyota"));

        //Iterator pattern example
        List<String> employees = Arrays.asList("John Smith", "Aga Peyish", "Zhako");

        EmployeeContainer container = new EmployeeContainer(employees);
        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            System.out.println("Name of this person is " + iterator.next());
        }
        //Mediator pattern example
        Mediator mediator = new ConcreteMediator();
        Colleague colleague = new ConcreteColleague(mediator, "aga");
        Colleague colleague2 = new ConcreteColleague(mediator, "zhanda");

        mediator.addColleague(colleague);
        mediator.addColleague(colleague2);

        colleague.sendMessage("Hello");

        //Memento pattern example
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        careTaker.add(originator.storeStateMemento());

        originator.setState("State 2");
        careTaker.add(originator.storeStateMemento());

        originator.setState("State 3");
        careTaker.add(originator.storeStateMemento());

        System.out.println("The current state : " + originator.getState());

        for (int i = 0; i < careTaker.getSize(); i++) {
            originator.retrieveStateFromMemento(careTaker.get(i));
            System.out.println(originator.getState());
        }
        //Observer pattern example
        ProductSubject computer = new ProductSubject();
        StoreObserver storeObserver = new StoreObserver(computer);
        computer.setState("new");
        computer.setState("sold");

        SupplyChainObserver chainObserver = new SupplyChainObserver(computer);

        computer.setState("ordered");
        //State pattern example
        Product smartphone = new Product();
        System.out.println("Smartphone has been sold");
        smartphone.nextState();
        smartphone.printStatus();
        System.out.println("Smartphone is returned by the customer");
        smartphone.previousState();
        smartphone.printStatus();

        //Strategy pattern example
        int num1 = 10;
        int num2 = 2;

        Context context = new Context(new AddOperation());
        System.out.println("Add operation : " + context.executeStrategy(num1, num2));

        context = new Context(new MultiplyOperation());
        System.out.println("Multiply operation : " + context.executeStrategy(num1, num2));
        //Template pattern example
        AbstractComputer tower = new TowerComputer();
        tower.buildComputer();
        System.out.println("________________");
        AbstractComputer quantum = new QuantumComputer();
        quantum.buildComputer();

        //Visitor pattern example
        VehiclePart car=new Vehicle();
        car.accept(new VehiclePartShowVisitor());

    }
}
