# spring-autowiring

Here you can find basic behaviour related with @Autowiring

First priority - configuration in xml

- autowire="byType" - search bean byType if not matched do nothing
- autowire="byName" - search bean byName if not matched do nothing

Second priority - configuration in class

- @Autowire - default byType, if not matched byName
- @Inject - byType, if not matched byName
- @Resource - byName, if not matched byType

Result of this application:

Execute ExampleFooByTypeBean...
FooServiceImplOne
FooServiceImplOne
Execute ExampleBarByNameBean...
BarServiceImplOne
BarServiceImplTwo