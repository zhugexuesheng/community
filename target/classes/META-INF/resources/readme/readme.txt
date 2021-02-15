1. web.xml
   配置spring和springmvc的所在位置，配置所有请求的语言编码为UTF-8
2. spring.xml
   配置数据源
   配置mybatis的SqlSession的工厂
   自动扫描mybatis中mapper接口包
   扫描service注解
   配置事务管理器

3. spring-mvc.xml
   开启Springmvc 自动扫描controller包
   开启注解支持和静态资源放行

4. mybatis.xml
   开启sql日志记录

5. 完整easycode自动生成pojo和mapper文件
   自动生成pojo，mapper.java和mapper.xml文件

6. TestService
   添加类头文件注解@Service  纳入spring管理
   注入mapper接口对象，方便直接调用
   编写业务逻辑代码...

7. TestController
   添加类头文件@RestController和@RequestMapping("/test")
   注入service对象，方便直接调用
   编写调用代码
