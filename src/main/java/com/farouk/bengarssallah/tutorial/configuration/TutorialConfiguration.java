package com.farouk.bengarssallah.tutorial.configuration;

import org.springframework.boot.autoconfigure.mustache.MustacheEnvironmentCollector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.samskivert.mustache.Mustache;

@Configuration
public class TutorialConfiguration {

	  //if we do not provide a value for a placeholder, 
	    //the MustacheException will be thrown with a message “No method or field with name ”variable-name” 
      //In order to avoid such errors it’s better to provide a default global value to all placeholders

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

}
