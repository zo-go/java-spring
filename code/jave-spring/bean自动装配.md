## bean自动装配

* byName
* byType

```xml
<!--byName-->
<bean id="cat" class="com.zb.pojo.Cat"></bean>
<bean id="dog" class="com.zb.pojo.Dog"></bean>

        <!--byType-->
<bean class="com.zb.pojo.Cat"></bean>
<bean class="com.zb.pojo.Dog"></bean>
```

## 用法

```xml

<bean id="people" class="com.zb.pojo.People" autowire="byType">
    <property name="name" value="张三"></property>
</bean>

<!--
    重点在autowire
    供选择: byName、byType
-->
```

![](C:\Users\Montian\Desktop\java_-sp\code\jave-spring\image\注解.jpg)