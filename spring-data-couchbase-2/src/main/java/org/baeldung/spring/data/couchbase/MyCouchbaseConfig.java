package org.baeldung.spring.data.couchbase;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseRepositories(basePackages={"org.baeldung.spring.data.couchbase"})
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {
    
    public static final List<String> NODE_LIST = Arrays.asList("localhost");
    public static final String BUCKET_NAME = "baeldung";
    public static final String BUCKET_PASSWORD = "";

    @Override
    protected List<String> getBootstrapHosts() {
        return NODE_LIST;
    }

    @Override
    protected String getBucketName() {
        return BUCKET_NAME;
    }

    @Override
    protected String getBucketPassword() {
        return BUCKET_PASSWORD;
    }
}
