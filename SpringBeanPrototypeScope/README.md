# SpringBeanPrototypeScope

In ScopeTestBean, the instance variable is defined as the integer exampleValue.
The default exampleValue is 0.
Two different rest controllers call this bean and get exampleValue.

When ScopeTestBean is initialized in different controllers, it will create a new bean for each location it is called.

The following two separate endpoints will request the exampleValue value in the ScopeTestBean class defined twice in two separate controllers and will increase the value by 1 after each request.
http://localhost:8080/v1/scope-test/
http://localhost:8080/v1/scope-test-another/

You can also call it via the request.http file.
