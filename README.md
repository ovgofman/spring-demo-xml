### Overview (XML Config)
- This project covers configuring an app through xml config.
    - How create a bean
    - Bean Scope (Singleton/Prototype)
    - How to inject a bean into other one (Constructor/Setter)
    - Bean LifeCycle (init-method/destroy-method)
___
___

##### Configuring Spring Container (IoC)
**applicationContext.xml** - This is an outdated approach to create Application context through XML config.
This file refers to IoC by itself. You should specify **beans** and inject them as desired through **dependencies or DI mechanism** here.
(**XmlApplicationContext.class** - create app through xml context)

**Java Annotation** - This is a modern way to configure application.
(**AnnotationConfigApplication.class** - create context through annotations)

**Java Source Code** - This is a modern way to configure application as well.

---

##### Dependency Injection
It needs to inject other objects to object you are asking for from the container.
So, at the end you'll have been provided within an object by Spring Container. 
The only thing is to describe in advance the bean by itself and it's dependenies.

##### Injection types
- Constructor `<constructor-arg ref="myFortuneService"/>`
- Setter `<property name="fortuneService" ref="myFortuneService"/>`
**fortuneService** will create a setter named as **setFortuneService** and put the myFortuneService bean into this setter.
- others

##### Inject literal values
- Setter injection 
    - Create setter
    - Add `<property name="email" value="BobWhite@example.com"/>` to config file
- Config file 
    - Add `<context:property-placeholder location="classpath:sport.properties"/>` to context
    - Use `<property name="email" value="${coach.email}"/>` syntax to inject
---

##### Bean Scopes
- Singleton by Default
    `<bean id="iceSkatingCoach"
               class="com.alex.springdemo.Sec5.IceSkatingCoach"
               scope="singleton">
         </bean>`
- Prototype (Creates a new instance for every request)
    `<bean id="iceSkatingCoach"
                    class="com.alex.springdemo.Sec5.IceSkatingCoach"
                    scope="prototype">
              </bean>`
              
##### Bean LifeCycle
1. Container started 
2. Bean Instantiated 
3. Internal Spring Processing 
4. Your Custom Init method
5. Your Custom Destroy Method (**Doesn't work for Prototype**)
    - `<bean id="iceSkatingCoach"
           class="com.alex.springdemo.Sec5.IceSkatingCoach"
           init-method="initMethod"
           destroy-method="destroyMethod">
         <constructor-arg ref="myFortune"/>
     </bean>`
___