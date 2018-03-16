package co.teemo.bitbucket.compliance.checker.controllers;

import co.teemo.bitbucket.compliance.checker.domain.Ruleset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RulesController {

    @Autowired
    private Ruleset ruleset;

    @GetMapping("/rules")
    @ResponseBody
    public Ruleset getRuleset() {
        return ruleset;
    }
}
