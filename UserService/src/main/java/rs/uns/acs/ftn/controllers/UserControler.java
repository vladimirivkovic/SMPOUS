package rs.uns.acs.ftn.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.uns.acs.ftn.models.User;
import rs.uns.acs.ftn.services.UserService;

@RestController
@RequestMapping("users")
public class UserControler extends AbstractRESTController<User, String>{
	
	private UserService userService;

	@Autowired
	public UserControler(UserService userService) {
		super(userService);
		this.userService = userService;
	}
	
	@RequestMapping(value = "/hello")
	public String hello(
			
			@RequestParam(name = "name") String name){
		return "Hello " + name + " " + "PORT 8081";
	}
	
	@RequestMapping(value = "search/findByFirstName", method = RequestMethod.GET)
	public List<User> findByAreaOfDanger(
			@RequestParam(name = "firstName") String firstName) {
		List<User> all = userService.findByFirstName(firstName);
		return all;
	}
	
	@RequestMapping(value = "search/findByFirstNamePageable", method = RequestMethod.GET)
	public Map<String, Object> findByAreaOfDanger(
			@RequestParam(name = "firstName") String firstName,
			@RequestParam(name = "page", defaultValue = "0") Integer page) {
		Page<User> all = userService.findByFirstName(firstName, new PageRequest(page, pageSize));
		return prepareListPage(all);
	}


}
