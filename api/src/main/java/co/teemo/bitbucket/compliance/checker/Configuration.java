package co.teemo.bitbucket.compliance.checker;

import co.teemo.bitbucket.compliance.checker.domain.Ruleset;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

@Component
public class Configuration {
    private static final ObjectMapper ymlObjectMapper = new ObjectMapper(new YAMLFactory());
    private static final Logger logger = LoggerFactory.getLogger(Configuration.class);
    private static final String DEFAULT_RULES_FILE_PATH = "/etc/bitbucket-compliance-checker/rules.yml";

    @Value("${rules.file.path}")
    private String rulesFilePath;

    @Bean
    public Ruleset provideRuleset() throws IOException {
        File rulesFile = new File(rulesFilePath);
        if(rulesFile.exists() && rulesFile.canRead()) {
            return ymlObjectMapper.readValue(rulesFile, Ruleset.class);
        }
        logger.warn("{} does not exist or is not readable, loading default one at {}", rulesFilePath, DEFAULT_RULES_FILE_PATH);
        rulesFile = new File(DEFAULT_RULES_FILE_PATH);
        if(rulesFile.exists() && rulesFile.canRead()) {
            return ymlObjectMapper.readValue(rulesFile, Ruleset.class);
        }
        logger.error("Default rules file path {} does not exist or is not readable", DEFAULT_RULES_FILE_PATH);
        throw new FileNotFoundException("Ruleset configuration not found at provided path nor default one");
    }


}
