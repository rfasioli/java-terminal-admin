package br.inf.orion.eSafe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inf.orion.eSafe.model.Perfil;
import br.inf.orion.eSafe.model.Usuario;
import br.inf.orion.eSafe.service.dao.PerfilServiceDao;
import br.inf.orion.eSafe.service.dao.UsuarioServiceDao;

@Repository
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

//    @Autowired
//    private UsuarioServiceDao userService;

    @Transactional(readOnly=true)
    @Override
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		Usuario user = UsuarioServiceDao.getByLogin(ssoId);
        if(user==null) {
            throw new UsernameNotFoundException("Username not found");
        }
        return new org.springframework.security.core.userdetails.User(user.getDsLogin(), user.getDsSenha(), user.getIcAtivo(), true, true, true, getGrantedAuthorities(user));
	}

    private List<GrantedAuthority> getGrantedAuthorities(Usuario user){
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        Perfil profile = PerfilServiceDao.getById(user.getIdPerfil());
        authorities.add(new SimpleGrantedAuthority("ROLE_"+profile.getDsRules()));
        return authorities;
    }
     
}


