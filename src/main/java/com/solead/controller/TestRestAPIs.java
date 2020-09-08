package com.solead.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solead.model.Cash;
import com.solead.model.Post;
import com.solead.model.User;
import com.solead.repository.CashRepository;
import com.solead.repository.PostRepository;
import com.solead.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/api")
public class TestRestAPIs {

	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private CashRepository cashRepository;

	@Autowired
	private UserRepository userRepository;

	 

	@GetMapping("/test/user")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String userAccess() {
		return ">>> User Contents!";
	}

	@GetMapping("/posts/get")
	// @PreAuthorize("permitAll()")
	public Page<Post> getClientPage(@RequestParam("page") int page, @RequestParam("size") int size) {

		Sort sort = new Sort(new Sort.Order(Direction.DESC, "id"));
		Pageable pageable = new PageRequest(page, size, sort);
		return postRepository.findAll(pageable);
	}
	
	
	@GetMapping("/cash/get/{id_usuario}")
	public Cash getCash(@PathVariable(value="id_usuario") long id_usuario) {
		return cashRepository.findByReviewId(id_usuario);
				
		 

		
	}

	@PostMapping("/posts")
	// @PreAuthorize("permitAll()")
	public Post salvaProduto(@RequestBody Post post) {
		Optional<User> user = userRepository.findByUsername(
				((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername());

		if (user.isPresent()) {
			post.setUsuario(user.get());

		} else {
			// GERAR EXCEÇÃO!
		}
		return postRepository.save(post);
	}

	@DeleteMapping("/delete/post")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public String deletaPost(@RequestBody @Valid Post post) {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		Optional<Post> postBD = postRepository.findById(post.getId());

		if (postBD.isPresent()) {

			if (principal != null && principal instanceof UserDetails) {
				String username = ((UserDetails) principal).getUsername();
				if (username.equals(postBD.get().getUsuario().getUsername())) {
					postRepository.delete(postBD.get());

					//return "deleted";
					return post.getId().toString();
				}

			}
		}
		// return post;
		return "nada a fazer";
	}

	private Object ResponseEntity(String string, HttpStatus badRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	 

	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}