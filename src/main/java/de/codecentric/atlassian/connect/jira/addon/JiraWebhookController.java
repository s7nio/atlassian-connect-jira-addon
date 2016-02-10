package de.codecentric.atlassian.connect.jira.addon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiraWebhookController {

    private static final Logger LOG = LoggerFactory.getLogger(JiraWebhookController.class);

    @RequestMapping(value = "/jira/issue-created", method = RequestMethod.POST)
    public void issueCreated(@RequestParam String webhook) {
        LOG.info("JIRA issue created");
        LOG.debug(webhook);
    }

    @RequestMapping(value = "/jira/issue-updated", method = RequestMethod.POST)
    public void issueUpdated(@RequestParam String webhook) {
        LOG.info("JIRA issue updated");
        LOG.debug(webhook);
    }
}
