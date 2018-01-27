Java9Demo
----
# 1 Java 9
## 1.1 一些资源
* [Java 9 官方文档](https://docs.oracle.com/javase/9/)
* [Java 9 新特性](https://docs.oracle.com/javase/9/whatsnew/toc.htm#JSNEW-GUID-C23AFD78-C777-460B-8ACE-58BE5EA681F6)

## 1.2 新特性概览
以下摘自[《JDK 9新特性汇总》](http://blog.csdn.net/gmg082900/article/details/78067117)：
>
>JDK9的关键更改：
> 1. Java平台模块化系统：引入了一种新的Java编程组件模块，它是一个命名的、自描述的代码和数据集合。
>
>JDK 9中的新工具：
> 1. Java Shell
> 2. 添加更多的诊断命令
> 3. 删除启动时间JRE版本选择
> 4. jlink:Java连接器
> 5. 多版本兼容Jar
>
>JDK 9中新的安全性： 
> 1. 数据报传输层安全性(DTLS）
> 2. 禁用sha - 1证书
>
>JDK 9中核心库的新内容:
> 1. 进程API更新：新增ProcessHandle类，该类提供进程的本地进程ID、参数、命令、启动时间、累计CPU时间、用户、父进程和子进程。这个类还可以监控进程的活力和破坏进程。ProcessHandle。onExit方法，当进程退出时，复杂未来类的异步机制可以执行一个操作。 
> 2. 更多的并发更新：包括一个可互操作的发布-订阅框架，以及对CompletableFuture API的增强。
> 3. 便利的工厂方法对于Collections：用少量的元素创建集合和映射的实例更容易。在列表、设置和映射接口上的新静态工厂方法使创建这些集合的不可变实例变得更加简单 例子：Set<String> alphabet = Set.of("a", "b", "c");

# 2 模块化
* Java 9 的一个新特性就是支持模块化。
* IDEA 中模块化 Demo 构建可以参考：[《Support for Java 9 Modules in IntelliJ IDEA 2017.1》](https://blog.jetbrains.com/idea/2017/03/support-for-java-9-modules-in-intellij-idea-2017-1/)。
* 研一翻译的文章[《Java 模块化系统初探》](http://www.importnew.com/16761.html)

## 2.1 模块化Demo
关注两个模块: `module1` 和 `module2`。`module2` 中使用了 `module1` 中的 `utils` 包中的 `TimeUtil` 类。

`module1` 中的module-info.java内容：
```
module module1 {
    exports utils;
}
```

`module2` 中的module-info.java内容：
```
module module2 {
    requires module1;
}
```


