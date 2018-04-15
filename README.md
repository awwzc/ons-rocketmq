# ons-rocketmq


ons-rocketmq是什么
ons-rocketmq是一个以注解方式集成spring-rocketmq 或 spring-ons(阿里云)的封装框架
ons-rocketmq 实现了哪些功能：

简化了MQ的使用,面向接口编程的方式使用MQ

封装了MQ的具体实现，可不更改业务代码地切换RocketMQ及ONS

兼容abtest的生产-灰度环境测试

兼容spring3.2.x 及 springboot1.4.5

核心代码参考shook2012/springboot-mq
# 目录结构
ons-rocketmq  核心代码包

example-xxx   为示例代码