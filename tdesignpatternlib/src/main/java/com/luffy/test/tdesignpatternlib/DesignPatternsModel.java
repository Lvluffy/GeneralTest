package com.luffy.test.tdesignpatternlib;

import com.luffy.test.tdesignpatternlib.behavior.chainOfResponsibility.ui.ChainOfResponsibilityActivity;
import com.luffy.test.tdesignpatternlib.behavior.command.ui.CommandActivity;
import com.luffy.test.tdesignpatternlib.behavior.interpreter.ui.InterpreterActivity;
import com.luffy.test.tdesignpatternlib.behavior.iterator.ui.IteratorActivity;
import com.luffy.test.tdesignpatternlib.behavior.mediator.ui.MediatorActivity;
import com.luffy.test.tdesignpatternlib.behavior.memento.ui.MementoActivity;
import com.luffy.test.tdesignpatternlib.behavior.observer.ui.ObserverActivity;
import com.luffy.test.tdesignpatternlib.behavior.state.ui.StateActivity;
import com.luffy.test.tdesignpatternlib.behavior.strategy.ui.StrategyActivity;
import com.luffy.test.tdesignpatternlib.behavior.templateMethod.ui.TemplateMethodActivity;
import com.luffy.test.tdesignpatternlib.behavior.visitor.ui.VisitorActivity;
import com.luffy.test.tdesignpatternlib.create.abstractFactory.ui.AbstractFactoryActivity;
import com.luffy.test.tdesignpatternlib.create.builder.ui.BuilderActivity;
import com.luffy.test.tdesignpatternlib.create.factoryMethod.ui.FactoryMethodActivity;
import com.luffy.test.tdesignpatternlib.create.prototype.ui.PrototypeActivity;
import com.luffy.test.tdesignpatternlib.create.singleton.ui.SingletonActivity;
import com.luffy.test.tdesignpatternlib.structure.adapter.ui.AdapterActivity;
import com.luffy.test.tdesignpatternlib.structure.bridge.ui.BridgeActivity;
import com.luffy.test.tdesignpatternlib.structure.composite.ui.CompositeActivity;
import com.luffy.test.tdesignpatternlib.structure.decorator.ui.DecoratorActivity;
import com.luffy.test.tdesignpatternlib.structure.facade.ui.FacadeActivity;
import com.luffy.test.tdesignpatternlib.structure.flyweight.ui.FlyweightActivity;
import com.luffy.test.tdesignpatternlib.structure.proxy.ui.ProxyActivity;

public enum DesignPatternsModel {

    CREATE_SINGLETON("单例", SingletonActivity.class),
    CREATE_PROTOTYPE("原型", PrototypeActivity.class),
    CREATE_FACTORY_METHOD("工厂方法", FactoryMethodActivity.class),
    CREATE_ABSTRACT_FACTORY("抽象工厂", AbstractFactoryActivity.class),
    CREATE_BUILDER("建造者", BuilderActivity.class),

    STRUCTURE_PROXY("代理", ProxyActivity.class),
    STRUCTURE_ADAPTER("适配器", AdapterActivity.class),
    STRUCTURE_BRIDGE("桥接", BridgeActivity.class),
    STRUCTURE_DECORATOR("装饰", DecoratorActivity.class),
    STRUCTURE_FACADE("外观", FacadeActivity.class),
    STRUCTURE_FLYWEIGHT("享元", FlyweightActivity.class),
    STRUCTURE_COMPOSITE("组合", CompositeActivity.class),

    BEHAVIOR_TEMPLATE_METHOD("模版方法", TemplateMethodActivity.class),
    BEHAVIOR_STRATEGY("策略", StrategyActivity.class),
    BEHAVIOR_COMMAND("命令", CommandActivity.class),
    BEHAVIOR_CHAIN_OF_RESPONSIBILITY("责任链", ChainOfResponsibilityActivity.class),
    BEHAVIOR_STATE("状态", StateActivity.class),
    BEHAVIOR_OBSERVER("观察者", ObserverActivity.class),
    BEHAVIOR_MEDIATOR("中介者", MediatorActivity.class),
    BEHAVIOR_ITERATOR("迭代器", IteratorActivity.class),
    BEHAVIOR_VISITOR("访问者", VisitorActivity.class),
    BEHAVIOR_MEMENTO("备忘录", MementoActivity.class),
    BEHAVIOR_INTERPRETER("解释器", InterpreterActivity.class);

    private String name;
    private Class aClass;

    DesignPatternsModel(String name, Class aClass) {
        this.name = name;
        this.aClass = aClass;
    }

    public String getName() {
        return name;
    }

    public Class getaClass() {
        return aClass;
    }
}
