package org.hypernovae.apps.models.bank;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpServletResponse;

import org.hypernovae.apps.models.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@Secured({"ROLE_BANK_ADMIN", "ROLE_USER"})
public class BankController {
	
	private static final String CENTRAL_BANK = "Big Bank Co";
	private BankRepository bankRepository;
	
	@Autowired
	public BankController(BankRepository bankRepository) {
		this.bankRepository = bankRepository;
	}
	
	@RequestMapping(value = "bank/central", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public Bank centralBank(Principal principal, HttpServletResponse response) {
        Assert.notNull(principal);
        Bank bank = bankRepository.findByDesignation(CENTRAL_BANK);
        return bank;
        
    }

}
