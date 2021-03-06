# proxyPattern
代理模式，静态代理，动态代理，CGLIBI，Javassist

#静态代理：
    由程序员创建或特定工具自动生成源代码，再对其编译，在程序运行前，代理类的.class文件就已经存在了。
* 原理：
    对普通一个接口与一直实现类在加入一个代理类，用于包装实现类中实现的方法，而业务使用方只需要实例化代理类，并传递需要代理的普通类即可。
* 优点：
    编译时生成代码，性能高
* 缺点：
    一个代理类只能为一个接口服务，开发中必然会产生过多的代理
    所有的代理操作除了调用的方法不一样之外，其他的操作都一样，则此时肯定是重复代码
    
#动态代理
* 原理:
    动态代理类的字节码在程序运行时由Java反射机制动态生成，无需程序员手工编写它的源代码。
* 优点:
    可以通过一个代理类，完成所有代理工作，不需要向静态代理需要一个一个实现接口来代理
* 缺点:
    通过反射动态代理方法将消耗系统性能，如果非常多的话，性能比较低
    
    #JDK动态代理
* 原理：JDK的动态代理机制只能代理实现了接口的类，而不能实现接口的类就不能实现JDK的动态代理
    #CGLib动态代理
* 原理：cglib是针对类来实现代理的，他的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理。
