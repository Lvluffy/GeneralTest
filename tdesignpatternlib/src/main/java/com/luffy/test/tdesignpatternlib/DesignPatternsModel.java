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

    CREATE_SINGLETON(R.string.singleton, true, SingletonActivity.class),
    CREATE_PROTOTYPE(R.string.prototype, true, PrototypeActivity.class),
    CREATE_FACTORY_METHOD(R.string.factory_method, true, FactoryMethodActivity.class),
    CREATE_ABSTRACT_FACTORY(R.string.abstract_factory, true, AbstractFactoryActivity.class),
    CREATE_BUILDER(R.string.builder, true, BuilderActivity.class),

    STRUCTURE_PROXY(R.string.proxy, true, ProxyActivity.class),
    STRUCTURE_ADAPTER(R.string.adapter, true, AdapterActivity.class),
    STRUCTURE_BRIDGE(R.string.bridge, true, BridgeActivity.class),
    STRUCTURE_DECORATOR(R.string.decorator, true, DecoratorActivity.class),
    STRUCTURE_FACADE(R.string.facade, true, FacadeActivity.class),
    STRUCTURE_FLYWEIGHT(R.string.flyweight, true, FlyweightActivity.class),
    STRUCTURE_COMPOSITE(R.string.composite, true, CompositeActivity.class),

    BEHAVIOR_TEMPLATE_METHOD(R.string.template_method, true, TemplateMethodActivity.class),
    BEHAVIOR_STRATEGY(R.string.strategy, true, StrategyActivity.class),
    BEHAVIOR_COMMAND(R.string.command, true, CommandActivity.class),
    BEHAVIOR_CHAIN_OF_RESPONSIBILITY(R.string.chain_of_responsibility, true, ChainOfResponsibilityActivity.class),
    BEHAVIOR_STATE(R.string.status, true, StateActivity.class),
    BEHAVIOR_OBSERVER(R.string.observer, true, ObserverActivity.class),
    BEHAVIOR_MEDIATOR(R.string.mediator, true, MediatorActivity.class),
    BEHAVIOR_ITERATOR(R.string.iterator, true, IteratorActivity.class),
    BEHAVIOR_VISITOR(R.string.visitor, false, VisitorActivity.class),
    BEHAVIOR_MEMENTO(R.string.memento, false, MementoActivity.class),
    BEHAVIOR_INTERPRETER(R.string.interpreter, false, InterpreterActivity.class);

    private int name;
    private boolean support;
    private Class aClass;

    DesignPatternsModel(int name, boolean support, Class aClass) {
        this.name = name;
        this.support = support;
        this.aClass = aClass;
    }

    public int getName() {
        return name;
    }

    public Class getaClass() {
        return aClass;
    }

    public boolean isSupport() {
        return support;
    }
}
