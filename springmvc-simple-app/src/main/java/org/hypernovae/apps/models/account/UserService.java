package org.hypernovae.apps.models.account;

import java.util.Collections;

import javax.annotation.PostConstruct;

import org.hypernovae.apps.models.bank.Bank;
import org.hypernovae.apps.models.bank.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.*;

/**
 * An example of how to authenticate and set up the authenticated user details
 * @author LOMPO
 *
 */
public class UserService implements UserDetailsService {
	
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private BankRepository bankRepository;
	
	@PostConstruct	
	protected void initialize() {
		accountRepository.save(new Account("user", "demo", "ROLE_USER"));
		accountRepository.save(new Account("admin", "admin", "ROLE_ADMIN"));
		bankRepository.save(new Bank("Big Bank Co", "001A", "ROLE_BANK_ADMIN"));
		
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account = accountRepository.findByEmail(username);
		if(account == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return createUser(account);
	}
	
	public void signin(Account account) {
		SecurityContextHolder.getContext().setAuthentication(authenticate(account));
	}
	
	private Authentication authenticate(Account account) {
		return new UsernamePasswordAuthenticationToken(createUser(account), null, Collections.singleton(createAuthority(account)));		
	}
	
	private User createUser(Account account) {
		return new User(account.getEmail(), account.getPassword(), Collections.singleton(createAuthority(account)));
	}

	private GrantedAuthority createAuthority(Account account) {
		return new SimpleGrantedAuthority(account.getRole());
	}

}
