package ar.edu.unju.escmi.pv.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unju.escmi.pv.dao.IUsuarioDao;
import ar.edu.unju.escmi.pv.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class UsuarioDaoImp implements IUsuarioDao {
	@PersistenceContext
	private EntityManager em;
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		
		return em.createQuery("from Usuario").getResultList();
	}
}
