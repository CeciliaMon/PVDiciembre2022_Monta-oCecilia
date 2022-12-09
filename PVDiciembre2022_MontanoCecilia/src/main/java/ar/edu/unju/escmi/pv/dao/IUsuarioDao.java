package ar.edu.unju.escmi.pv.dao;

import java.util.List;

import ar.edu.unju.escmi.pv.models.Usuario;

public interface IUsuarioDao {
	public List<Usuario> findAll();
}
