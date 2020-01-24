package ai.semplify.indexer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableReactiveElasticsearchRepositories
public class IndexerApplication {
    public static void main(String[] args) {
        SpringApplication.run(IndexerApplication.class, args);
    }
}
