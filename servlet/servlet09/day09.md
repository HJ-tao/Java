# 一.session
## 1.基本语法
- 获取session:request.getSession()
- 存取数据:getAttribute()/setAttribute()/removeAttribute()
- 销毁session:session.invalidate()

## 2.相关规则
- 超时时间:默认为30分钟,可以通过配置加以修改
- 禁用cookie怎么办:URL重写

## 3.退出
![](1.png)

# 二.cookie和session总结
## 1.通俗的理解(*)
- 存储于该对象中的数据具备如下特征:
- 该对象中的数据可以在多个请求之间复用
- 该对象中的数据可以在多个Servlet之间复用
- 服务器会给每个浏览器单独创建一份cookie及session

## 2.专业的理解
- HTTP协议是一种无状态协议,即服务器没有记录浏览器曾经访问过的状态.
- cookie和session就是用来管理这种状态的对象.
> 状态:浏览器曾经访问过服务器的证据(数据).

# 三.验证码
![](2.png)

# 四.过滤器
## 1.作用
- 用于解决项目中的公共的业务逻辑
- 如:记录日志,登录检查,过滤敏感词
> 公共业务:很多请求都包含的业务逻辑

## 2.如何使用过滤器
- 创建一个类,实现接口Filter
- 在web.xml中配置此类,声明它能过滤哪些请求

## 3.小案例
![](3.png)

## 4.登录检查
![](4.png)

## 5.参数的问题
![](5.png)

# 五.监听器
## 1.作用
- 用来监听某些对象创建、销毁、数据变化的事件
- 服务器会在这些事件发生时自动调用监听器的方法
> 监听器组件也是由服务器管理的

## 2.分类(接口)
### request
- ServletRequestListener:监听request对象的创建与销毁
- ServletRequestAttributeListener:监听request对象中数据的变化

### session
- HttpSessionListener:监听session对象的创建与销毁
- HttpSessionAttributeListener:监听session对象中数据的变化

### ServletContext
- ServletContextListener:监听context对象的创建与销毁
- ServletContextAttributeListener:监听context对象中数据的变化

## 3.使用步骤
- 创建一个类,实现对应的接口
- 在web.xml中配置此类

