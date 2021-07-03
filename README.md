MOOC单体版本说明
=============
### 在线演示

API文档：http://47.100.93.185:8080/doc.html

### 快速启动

1. 拉取代码到本地。

2. 创建数据库`mooc`，并导入`sql/mooc.sql`，并配置application.properties中数据库相关host、username以及password。

3. 在IDEA中打开mooc项目文件夹，以Run或Debug模式启动`mooc-class`模块中的`edu.whut.cs.jee.mooc.MoocClassApplication`的`main`方法。

4. 启动成功后，您可以访问API文档：`http://localhost:8080/doc.html#/`，进行后续的调试。

5. 您也可以复制Postman分享链接`https://www.getpostman.com/collections/c5c0e7f9f40bee924ff0`，在Postman中import link。在Postman中进行任何测试之前，需要首先调用`注册（申请令牌）`并在Postman环境变量组`MOOC_API_ENV`中token的当前值设置为得到的`access_token`。注意按照业务流程，进行测试。