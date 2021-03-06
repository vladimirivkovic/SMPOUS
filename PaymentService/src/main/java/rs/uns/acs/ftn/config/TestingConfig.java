package rs.uns.acs.ftn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:general.properties"),
	@PropertySource("classpath:testing.properties")
})
@Profile("testing")
public class TestingConfig {

}
