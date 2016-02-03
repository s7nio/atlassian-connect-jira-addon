package de.codecentric.atlassian.connect.jira.addon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LifecycleController {

	private static final Logger LOG = LoggerFactory.getLogger(LifecycleController.class);

	@RequestMapping(value = "/lifecycle/installed", method = RequestMethod.POST)
	String installed(@RequestParam String user_key) {
		String infoMessage = "installed: " + user_key;
		LOG.info(infoMessage);
		return infoMessage;
	}

	@RequestMapping(value = "/lifecycle/uninstalled", method = RequestMethod.POST)
	String uninstalled(@RequestParam String user_key) {
		String infoMessage = "uninstalled: " + user_key;
		LOG.info(infoMessage);
		return infoMessage;
	}

	@RequestMapping(value = "/lifecycle/enabled", method = RequestMethod.POST)
	String enabled(@RequestParam String user_key) {
		String infoMessage = "enabled: " + user_key;
		LOG.info(infoMessage);
		return infoMessage;
	}

	@RequestMapping(value = "/lifecycle/disabled", method = RequestMethod.POST)
	String disabled(@RequestParam String user_key) {
		String infoMessage = "disabled: " + user_key;
		LOG.info(infoMessage);
		return infoMessage;
	}
}
