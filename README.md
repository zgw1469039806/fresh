# fresh-GD

```
~~~~格调生鲜项目 本项目技术栈

注册中心 SpringCloud eureka

认证框架 Spring security Oauth2

服务调用 SpringCloud fegin

服务容错  SpringCloud  Hystrix

网关 SpringCloud zuul

持久化框架 Mybatis-plus

缓存框架 redis

消息服务 rabbitmq 

Swagger构建API~~~~```

项目参与： 张国伟 郭家恒 夏乾航 贾一飞 位刘报

次项目大致分为6大模块 暂时没引入zipkin 

1、basic 认证模块

（1）authorization-center:认证中心
 SSO服务端 所有微服务要想获取用户信息必须要到认证中心授权，授权成功后返回结果
（2）authorization-service:用户中心
  用户中心独立抽象出来 只要关于针对用户的操作 都在这个服务里面进行

2、commons 常量模块
 advice：异常统一处理
 api:所有API也就是servie层接口统一写在里面，服务间调用用fegin继承即可
 consts：统一常量 包括 reids前缀 返回具体结果
 pojo：数据模型 接受参数  返回参数 统一标准化
 
3、eureka 注册中心  生产环境  单机版即可

4、smodule 具体业务微服务模块
goshopping-service 商品服务 
每个服务对应有一个DB 所以 entity为每个服务的实体这个DB的所有表
fegin 接口继承 commons 常量模块 api 接口写在统一api里
impl 实现类只需实现 commons 常量模块 api 接口即可
mapper为  dao接口 数据访问
utils MybatisPlusCodeGenerator 反向工程生成目录结构

其他业务微服务结构一样

5、unification
 项目主入口  统一controller 统一fegin 也是认证服务器对应的资源服务器之一
6、网关
网关后期进行统一认证 目前暂不做处理
