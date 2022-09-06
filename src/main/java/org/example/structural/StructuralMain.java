package org.example.structural;

import org.example.structural.adapter.AccountCreationService;
import org.example.structural.adapter.BankAccountAdapter;
import org.example.structural.adapter.LegacyBankAccount;
import org.example.structural.adapter.PersonalInfoDB;
import org.example.structural.bridge.Bag;
import org.example.structural.bridge.Blue;
import org.example.structural.bridge.Purse;
import org.example.structural.bridge.Red;
import org.example.structural.composite.Human;
import org.example.structural.composite.Robot;
import org.example.structural.composite.WorkerManager;
import org.example.structural.decorator.Car;
import org.example.structural.decorator.Machine;
import org.example.structural.decorator.Navigation;
import org.example.structural.decorator.ParkingAssistant;
import org.example.structural.facade.FacadeClass;
import org.example.structural.filter.BlueFilter;
import org.example.structural.filter.Filter;
import org.example.structural.flyweight.InventoryBackend;
import org.example.structural.proxy.ProxyFile;

import java.util.Arrays;
import java.util.List;

public class StructuralMain {

    public static final String AGA = "Aga";
    public static final String EMAIL = "aga@gmail.com";
    public static final long AMOUNT = 0L;

    public static void main(String[] args) {
        //Adapter pattern example
        LegacyBankAccount account = new LegacyBankAccount(1, "Aga");

        PersonalInfoDB infoDB = new PersonalInfoDB();
        infoDB.setName(AGA);
        infoDB.setEmail(EMAIL);
        infoDB.setAmount(AMOUNT);

        BankAccountAdapter adapter = new BankAccountAdapter(account, infoDB);

        AccountCreationService service = new AccountCreationService(adapter.getId(), adapter.getName(), adapter.getEmail(), adapter.getAmount());
        service.createAccount();

        //Bridge pattern example
        Bag redBag = new Bag(new Red());
        Bag blueBag = new Bag(new Blue());

        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());

        redBag.getColor();
        blueBag.getColor();

        redPurse.getColor();
        bluePurse.getColor();

        //Filter pattern example
        Purse redPurse1 = new Purse(new Red());
        Purse bluePurse1 = new Purse(new Blue());

        Purse redPurse2 = new Purse(new Red());
        Purse bluePurse2 = new Purse(new Blue());
        List<Purse> purses = Arrays.asList(redPurse1, bluePurse1, redPurse2, bluePurse2);

        Filter blueFilter = new BlueFilter();

        List<Purse> purses1 = blueFilter.meetFilter(purses);
        purses1.forEach(e -> System.out.println(e.getColor().getClass().getSimpleName()));

        //Composite pattern example
        Human human = new Human(AGA);
        Robot robot = new Robot(1, "savdsva00");

        WorkerManager manager = new WorkerManager();
        manager.addWorker(human);
        manager.addWorker(robot);
        manager.performTask();

        //Decorator pattern example
        Machine machine = new Navigation(new ParkingAssistant(new Car()));
        System.out.println(machine.doOperation());

        //Facade pattern example
        FacadeClass facadeClass = new FacadeClass();
        facadeClass.performRobotTask();
        facadeClass.performComputerTask();
        //Flyweight pattern example
        InventoryBackend backend = new InventoryBackend();

        backend.takeOrder("a", 1);
        backend.takeOrder("a", 2);
        backend.takeOrder("b", 3);
        backend.takeOrder("b", 4);
        backend.takeOrder("c", 5);
        backend.takeOrder("c", 6);
        backend.takeOrder("d", 7);

        backend.process();

        System.out.println(backend.report());
        //Proxy pattern example
        String fileName="kjav";
        ProxyFile proxyFile = new ProxyFile(fileName);
        proxyFile.downloadFile();


    }
}
