package br.com.aviagem.modelo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;


public class UserDetailsImpl implements UserDetails {

    private Cliente cliente;

    public UserDetailsImpl(Cliente cliente) {
        this.cliente = cliente;
    }

	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
	 * Perfil perfil = cliente.getCargo().getNome().equals("Gerente") ?
	 * Perfil.ADMIN : Perfil.USER;
	 * 
	 * return AuthorityUtils.createAuthorityList(perfil.toString()); }
	 */

    @Override
    public String getPassword() {
        return cliente.getSenha();
    }

    @Override
    public String getUsername() {
        return cliente.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return cliente.getEmail() == null;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
