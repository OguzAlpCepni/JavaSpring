package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{
	
	private UserDao userdao;
	
	@Autowired // userdao yu implemente eden ortamı nesne referansını bize vericek 
	public UserManager(UserDao userdao) {  // ınjection pattern 
		super();
		this.userdao = userdao;
	}

	@Override
	public Result add(User user) {
		this.userdao.save(user);
		return new SuccessResult(" kullanici eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userdao.findByEmail(email)," kullanici bulundu ");
	}

}
