# 抽象工厂(Abstract Factory)

## 目的
提供一个统一的接口来创建一系列产品（对象），而不用声明其实现类(通过多态实现)
`
    // 仅需在最开始创建好具体的工厂类即可
    AbstractFactory factory = new ConcreteFactory();
    factory.createProduct1();
    factory.createProduct2();
`

## 应用场景
// TODO
