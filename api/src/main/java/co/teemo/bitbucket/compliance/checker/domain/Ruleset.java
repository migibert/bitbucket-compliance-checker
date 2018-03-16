package co.teemo.bitbucket.compliance.checker.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.Set;

public class Ruleset {
    @JsonProperty("rules")
    private Set<Rule> rules;

    public Set<Rule> getRules() {
        return rules;
    }

    public void setRules(Set<Rule> rules) {
        this.rules = Collections.unmodifiableSet(rules);
    }
}
