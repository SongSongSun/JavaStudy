## 工厂方法模式
### 定义一个用于创建对象的接口，让子类决定实例化哪一个类
#### 优点
+ 遵循开闭原则
+ 对客户端隐藏对象的创建过程
+ 遵循单一职责原则

#### 缺点
+ 添加子类的时候，需要成对添加产品及其工厂类，使得系统更加复杂
+ 只支持创建同一类产品