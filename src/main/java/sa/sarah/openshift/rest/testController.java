package sa.sarah.openshift.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {

	private static final Logger LOGGER = LoggerFactory.getLogger(testController.class);

	@GetMapping("/hello")
	public ResponseEntity<String> getHelloMessage() {
		LOGGER.debug("In get hello message");
		return ResponseEntity.ok().body("Hello, it's working :)");
	}

}
