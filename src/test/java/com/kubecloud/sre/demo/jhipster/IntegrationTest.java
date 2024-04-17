package com.kubecloud.sre.demo.jhipster;

import com.kubecloud.sre.demo.jhipster.config.AsyncSyncConfiguration;
import com.kubecloud.sre.demo.jhipster.config.EmbeddedSQL;
import com.kubecloud.sre.demo.jhipster.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { HelloJHipsterApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
public @interface IntegrationTest {
}
