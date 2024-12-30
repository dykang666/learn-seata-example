1 、seata 的一些例子 主要包含 TCC和AT模式

2、 AT 模式主要使用@GlobalTransactional注解

3、 TCC 模式 使用 @GlobalTransactional和@LocalTCC和@TwoPhaseBusinessAction注解、分为 try、commit、和 rollback，具体业务逻辑需要自己实现

4、saga 模式 使用需要写json文件，使用起来相对复杂，使用的较少。

5、XA模式用到了锁机制，性能比较低，很少使用。

6、seata默认是AT模式，是二阶段提交，通过日志进行回滚，无锁方案，性能比较高。

代码参考链接: 

https://github.com/Kerry2019/seata-tcc-demo;

https://github.com/Xiao-Y/seata-demo