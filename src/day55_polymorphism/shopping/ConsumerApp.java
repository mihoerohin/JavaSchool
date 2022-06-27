package day55_polymorphism.shopping;

public interface ConsumerApp extends Shipping, AllowEserToSell {

}

abstract class TestA implements Shipping, AllowEserToSell{ }

abstract class TestB implements ConsumerApp{ }