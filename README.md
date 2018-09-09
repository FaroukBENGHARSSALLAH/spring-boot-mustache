# spring-boot-mustache

Java Mustache template engine Spring boot integration

-Steps
  -add maven dependecies
 
```
<dependency>          
      <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-mustache</artifactId>
 </dependency>
```

  - add default value configuration
  
   ```
   @Bean
 public Mustache.Compiler mustacheCompiler(
   Mustache.TemplateLoader templateLoader, 
   Environment environment) {
  
     MustacheEnvironmentCollector collector = new MustacheEnvironmentCollector();
     collector.setEnvironment(environment);
  
     return Mustache.compiler()
       .defaultValue("")
       .withLoader(templateLoader)
       .withCollector(collector);
 }
```

 - configure your layouts in layout folder like these lines
    
   ```
   <div class="starter-template"> 
   {{#posts}} 
   <h1>{{title}}</h1> 
   <p>{{content}}</p> 
   {{/posts}} 
   </br>
  </div> 
    ```


  - include them
      ```<div class="container">{{>layout/post}}</div>
      ```
